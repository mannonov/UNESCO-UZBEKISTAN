package uz.najottalim.unescouzbekistan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import uz.najottalim.unescouzbekistan.databinding.ActivityMainBinding
import uz.najottalim.unescouzbekistan.databinding.FragmentCulturekBinding
import uz.najottalim.unescouzbekistan.databinding.FragmentNewsBinding
import uz.najottalim.unescouzbekistan.databinding.FragmentScienceBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    lateinit var culturekFragment: CulturekFragmentval

    lateinit var newsFragment: NewsFragment

    lateinit var scienceFragment: ScienceFragment


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        culturekFragment = CulturekFragmentval {

        }

        scienceFragment = ScienceFragment {

        }

        newsFragment = NewsFragment()

        binding.bottomNavigation.setOnNavigationItemSelectedListener {
            when (it.itemId) {

                R.id.ic_culute -> showFragment(culturekFragment, "Culture Fragment")

                R.id.ic_news -> showFragment(newsFragment, "Science Fragment")

                R.id.ic_science -> showFragment(scienceFragment, "Science Fragment")

            }
            true
        }

        showFragment(culturekFragment, "Culture Fragment")


    }

    private fun showFragment(fragment: Fragment, name: String) {
        supportFragmentManager.beginTransaction().replace(R.id.main_container, fragment)
            .addToBackStack(name)
            .commit()
    }
}