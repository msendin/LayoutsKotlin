package udl.eps.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import udl.eps.myapplication.databinding.LayoutWeightsBinding
import udl.eps.myapplication.databinding.RelativeLayoutsBinding

class LayoutWeightsActivity : AppCompatActivity() {
    private lateinit var binding: LayoutWeightsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = LayoutWeightsBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}