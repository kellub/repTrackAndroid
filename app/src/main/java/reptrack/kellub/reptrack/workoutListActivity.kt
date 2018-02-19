package reptrack.kellub.reptrack

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

const val EXTRA_MESSAGE = "reptrack.kellub.MESSAGE"

class workoutListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercise_list)
    }

    fun newWorkoutIntent(view: View) {
        val message = "NewWorkoutClicked"
        val intent = Intent(this, newWorkoutActivity::class.java).apply {
            putExtra(EXTRA_MESSAGE, message)
        }
        startActivity(intent)
    }
}
