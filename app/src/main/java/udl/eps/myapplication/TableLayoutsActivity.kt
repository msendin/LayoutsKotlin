package udl.eps.myapplication

import android.app.Activity
import android.os.Bundle
import udl.eps.myapplication.databinding.RelativeLayoutsBinding

class TableLayoutsActivity : Activity() {
    private lateinit var binding: RelativeLayoutsBinding

    /** Initializes the app when it is first created.  */
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = RelativeLayoutsBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}