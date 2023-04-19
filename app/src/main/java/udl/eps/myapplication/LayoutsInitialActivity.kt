package udl.eps.myapplication

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import udl.eps.myapplication.databinding.MainBinding

class LayoutsInitialActivity : AppCompatActivity() {

    private lateinit var binding: MainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    /** Switches to the given class (which must be a subclass of Activity).
     * You must also register the new Activity in AndroidManifest.xml.
     */
    fun goToActivity(
        newClass: Class<out Activity?>?
    ) {
        val `in`: Intent?

        `in` = Intent(this, newClass)
        startActivity(`in`)
    }


    /** Switches to NestedLayoutsActivity when the associated button is clicked.
     * The colors.xml file gives different background colors to the leaf-level
     * Layouts in order to make the nesting easier to see.  */
    fun showNestedLayouts() {
        goToActivity(NestedLayoutsActivity::class.java)
    }

    /** Switches to the LayoutWeightsActivity when the associated button is clicked.  */
    fun showLayoutWeights() {
        goToActivity(LayoutWeightsActivity::class.java)
    }

    /** Switches to the RelativeLayoutsActivity when the associated button is clicked.  */
    fun showRelativeLayouts() {
        goToActivity(RelativeLayoutsActivity::class.java)
    }

    /** Switches to the TableLayoutsActivity when the associated button is clicked.  */
    fun showTableLayouts() {
        goToActivity(TableLayoutsActivity::class.java)
    }
}