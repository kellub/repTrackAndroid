package reptrack.kellub.reptrack

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ListView
import android.widget.ArrayAdapter



class newWorkoutActivity : AppCompatActivity() {

    //LIST OF ARRAY STRINGS WHICH WILL SERVE AS LIST ITEMS
    var listItems = ArrayList<String>()

    //DEFINING A STRING ADAPTER WHICH WILL HANDLE THE DATA OF THE LISTVIEW
    var adapter: ArrayAdapter<String>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_workout)

        // Get the Intent that started this activity and extract the string
        val message = intent.getStringExtra(EXTRA_MESSAGE)
        Log.d("myTag", "Message is: $message")
        adapter= ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, listItems)
        val listView = findViewById<ListView>(R.id.workoutExerciseList)
        //listView.adapter = adapter
        listView.setAdapter(adapter)

        //setTitle(getResources().getText(R.string.MyTitle));
    }


    fun newExerciseIntent(view: View) {
        val message = "test"
        val intent = Intent(this, newExerciseActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, message)
        }
        startActivity(intent)
    }
}
