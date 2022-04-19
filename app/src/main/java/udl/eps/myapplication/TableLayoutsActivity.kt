package udl.eps.myapplication

import android.app.Activity
import android.os.Bundle
import udl.eps.myapplication.databinding.RelativeLayoutsBinding
import udl.eps.myapplication.databinding.TableLayoutsBinding

class TableLayoutsActivity : Activity() {
    private lateinit var binding: TableLayoutsBinding

    /** Initializes the app when it is first created.  */
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = TableLayoutsBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}