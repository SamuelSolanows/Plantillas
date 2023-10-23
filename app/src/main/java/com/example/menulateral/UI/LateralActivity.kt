package com.example.menulateral.UI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.menulateral.R
import com.example.menulateral.UI.Fragments.SecondFragment
import com.example.menulateral.databinding.ActivityLateralBinding

class LateralActivity : AppCompatActivity() {
    lateinit var binding: ActivityLateralBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLateralBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.apply {
            bnv.menu.findItem(R.id.samuel).setOnMenuItemClickListener {
                supportFragmentManager.beginTransaction()
                    .replace(R.id.fragmentContainerView2, SecondFragment())
                    .commit()
                return@setOnMenuItemClickListener false
            }
        }
    }
}