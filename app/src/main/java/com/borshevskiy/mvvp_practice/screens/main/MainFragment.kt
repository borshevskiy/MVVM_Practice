package com.borshevskiy.mvvp_practice.screens.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.borshevskiy.mvvp_practice.R
import com.borshevskiy.mvvp_practice.databinding.FragmentMainBinding
import com.borshevskiy.mvvp_practice.databinding.FragmentStartBinding
import com.borshevskiy.mvvp_practice.screens.start.StartFragmentViewModel
import com.borshevskiy.mvvp_practice.utils.ACTIVITY_APP
import com.borshevskiy.mvvp_practice.utils.TYPE_ROOM

class MainFragment : Fragment() {

    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!
    private lateinit var  mViewModel: MainFragmentViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onStart() {
        super.onStart()
        mViewModel = ViewModelProvider(this)[MainFragmentViewModel::class.java]
        binding.btnAddNote.setOnClickListener {
            ACTIVITY_APP.mNavController.navigate(R.id.action_mainFragment_to_addNewNoteFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}