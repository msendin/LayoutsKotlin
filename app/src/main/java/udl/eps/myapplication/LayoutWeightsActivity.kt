package udl.eps.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import udl.eps.myapplication.databinding.RelativeLayoutsBinding

class LayoutWeightsActivity : AppCompatActivity() {
    private lateinit var binding: RelativeLayoutsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = RelativeLayoutsBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}