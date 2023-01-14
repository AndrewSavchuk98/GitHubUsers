package com.example.githubuserstesttask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.githubuserstesttask.databinding.ActivityMainBinding
import com.example.githubuserstesttask.presentation.Navigator
import com.example.githubuserstesttask.presentation.UserUi
import com.example.githubuserstesttask.presentation.detail.UserDetailFragment
import com.example.githubuserstesttask.presentation.main.UsersListFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity(), Navigator {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .add(R.id.fragmentContainerMain, UsersListFragment.newInstance())
                .commit()
        }

    }

    override fun goToUserDetailFragment(user: UserUi) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainerMain, UserDetailFragment.newInstance(user))
            .addToBackStack(null)
            .commit()
    }

    override fun goBack() {
        onBackPressed()
    }
}