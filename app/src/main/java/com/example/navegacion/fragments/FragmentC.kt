package com.example.navegacion.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import com.example.navegacion.R
import com.example.navegacion.databinding.FragmentCBinding

class FragmentC : Fragment() {
    private lateinit var navController: NavController
    private lateinit var binding: FragmentCBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentCBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val navHost = requireActivity()
            .supportFragmentManager
            .findFragmentById(R.id.id_fragment_container)
        navHost.let {
            navController = navHost!!.findNavController()

            binding.idBtnAtrasC.setOnClickListener {
                navController.navigate(R.id.action_fragmentC_toB)
            }
            binding.idBtnSiguienteC.setOnClickListener {
                navController.navigate(R.id.action_fragmentC_toStart)
            }
        }
    }
}