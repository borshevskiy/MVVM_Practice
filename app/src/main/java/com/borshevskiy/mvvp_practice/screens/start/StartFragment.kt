package com.borshevskiy.mvvp_practice.screens.start

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.borshevskiy.mvvp_practice.R
import com.borshevskiy.mvvp_practice.databinding.FragmentStartBinding
import com.borshevskiy.mvvp_practice.utils.ACTIVITY_APP
import com.borshevskiy.mvvp_practice.utils.TYPE_DATABASE
import com.borshevskiy.mvvp_practice.utils.TYPE_ROOM

class StartFragment : Fragment() {

    private var _binding: FragmentStartBinding? = null
    private val binding get() = _binding!!
    private lateinit var  mViewModel: StartFragmentViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentStartBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onStart() {
        super.onStart()
        mViewModel = ViewModelProvider(this)[StartFragmentViewModel::class.java]
        binding.btnRoom.setOnClickListener {
            mViewModel.initDatabase(TYPE_ROOM) {
                ACTIVITY_APP.mNavController.navigate(R.id.action_startFragment_to_mainFragment)
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}