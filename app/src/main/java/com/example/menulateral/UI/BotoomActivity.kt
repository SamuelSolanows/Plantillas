package com.example.menulateral.UI

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.menulateral.R
import com.example.menulateral.UI.Fragments.FirstFragment
import com.example.menulateral.UI.Fragments.SecondFragment
import com.example.menulateral.UI.Fragments.ThirdFragment
import com.example.menulateral.databinding.ActivityMainBinding

class BotoomActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.apply {
            binding.bottomNavigationView.menu.findItem(R.id.item1).setOnMenuItemClickListener {
                PasarFragments(FirstFragment.newInstance(), "")
                it.isChecked = true // etop ke es?
                return@setOnMenuItemClickListener false  // es esto porque deveuelve false?
            }

            binding.bottomNavigationView.menu.findItem(R.id.item2).setOnMenuItemClickListener {
                PasarFragments(SecondFragment.newInstance(), "")
                return@setOnMenuItemClickListener false
            }

            binding.bottomNavigationView.menu.findItem(R.id.item3).setOnMenuItemClickListener {
                PasarFragments(ThirdFragment.newInstance(), "")
                return@setOnMenuItemClickListener false
            }
        }
    }

    private fun PasarFragments(
        fragment: Fragment,
        title: String  // porque se tiene que pasar un tutulo?  es para poder regresar a ese fragment?
    ) {
        supportFragmentManager.beginTransaction()  // pa ke es esto?
            .replace(R.id.fragmentContainerView, fragment)
            .commit()

        supportActionBar?.setDisplayShowHomeEnabled(true)// pa ker es esto?
    }
}