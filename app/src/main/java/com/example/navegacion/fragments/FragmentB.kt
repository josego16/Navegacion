package com.example.navegacion.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.navegacion.R
import com.example.navegacion.databinding.FragmentBBinding

class FragmentB : Fragment() {
    private lateinit var navController: NavController
    private lateinit var binding: FragmentBBinding
    private val myArguments: FragmentBArgs by navArgs()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentBBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val name = myArguments.name
        Toast.makeText(requireActivity(), "Mi mensaje es $name", Toast.LENGTH_SHORT).show()
        val navHost = requireActivity()
            .supportFragmentManager
            .findFragmentById(R.id.id_fragment_container)
        navHost.let {
            navController = navHost!!.findNavController()

            binding.idBtnAtrasB.setOnClickListener {
                navController.navigate(R.id.action_fragmentB_toC)
            }
            binding.idBtnSiguienteB.setOnClickListener {
                navController.navigate(R.id.action_fragmentB_toStart)
            }
        }
    }
}