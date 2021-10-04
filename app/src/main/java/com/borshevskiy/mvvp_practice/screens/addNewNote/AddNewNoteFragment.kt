package com.borshevskiy.mvvp_practice.screens.addNewNote

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.borshevskiy.mvvp_practice.R
import com.borshevskiy.mvvp_practice.databinding.FragmentAddNewNoteBinding
import com.borshevskiy.mvvp_practice.models.AppNote

class AddNewNoteFragment : Fragment() {

    private var _binding: FragmentAddNewNoteBinding? = null
    private val binding get() = _binding!!
    private lateinit var  mViewModel: AddNewNoteViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentAddNewNoteBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onStart() {
        super.onStart()
        mViewModel = ViewModelProvider(this)[AddNewNoteViewModel::class.java]
        binding.btnAddNote.setOnClickListener {
            if (binding.inputNameNote.text.isEmpty()) {
                Toast.makeText(context,"Это поле не может быть пустым", Toast.LENGTH_SHORT).show()
            } else {
                mViewModel.insertNewNote(AppNote(0, binding.inputNameNote.text.toString(),binding.inputTextNote.text.toString())) {
                    findNavController().navigate(R.id.action_addNewNoteFragment_to_mainFragment)
                }
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}