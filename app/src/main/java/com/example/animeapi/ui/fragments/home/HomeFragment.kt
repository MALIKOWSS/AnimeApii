package com.example.animeapi.ui.fragments.home

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.animeapi.ui.adapters.pager.PagersAdapter
import com.example.youtube.R
import com.example.youtube.databinding.FragmentHomeBinding
import com.google.android.material.tabs.TabLayoutMediator

class HomeFragment : Fragment(R.layout.fragment_home) {

    private val binding by viewBinding(FragmentHomeBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initialize()
    }

    private fun initialize() {
        tabLayout()
    }

    private fun tabLayout() {
        binding.viewPager.adapter = PagersAdapter(this)
        TabLayoutMediator(binding.tabLayout, binding.viewPager) { tab, pos ->
            when (pos) {
                0 -> {
                    tab.text = "anime"
                }
                1 -> {
                    tab.text = "manga"
                }
            }
        }.attach()
    }
}