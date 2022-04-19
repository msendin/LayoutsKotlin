package udl.eps.myapplication

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import udl.eps.myapplication.*

class NestedLayoutsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.nested_layouts)
    }

    /** Switches to the given class (which must be a subclass of Activity).
     * You must also register the new Activity in AndroidManifest.xml.
     */
    fun goToActivity(
        newClass: Class<out Activity?>?
    ) {
        val newActivity = Intent(this, newClass)
        startActivity(newActivity)
    }

    /** Switches to LayoutsInitialActivity when the associated button is clicked.  */
    fun showInitialScreen(clickedButton: View?) {
        goToActivity(LayoutsInitialActivity::class.java)
    }

    /** Switches to LayoutWeightsActivity when the associated button is clicked.  */
    fun showLayoutWeights(clickedButton: View?) {
        goToActivity(LayoutWeightsActivity::class.java)
    }
}