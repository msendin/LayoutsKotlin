package udl.eps.myapplication

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import udl.eps.myapplication.*
import udl.eps.myapplication.databinding.NestedLayoutsBinding
import udl.eps.myapplication.databinding.RelativeLayoutsBinding

class NestedLayoutsActivity : AppCompatActivity() {
    private lateinit var binding: NestedLayoutsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = NestedLayoutsBinding.inflate(layoutInflater)
        setContentView(binding.root)
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