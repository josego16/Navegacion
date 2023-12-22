package com.example.navegacion.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import com.example.navegacion.R
import com.example.navegacion.databinding.FragmentStartBinding

class FragmentStart : Fragment() {
    private lateinit var navController: NavController
    private lateinit var binding: FragmentStartBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentStartBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val navHost = requireActivity()
            .supportFragmentManager
            .findFragmentById(R.id.id_fragment_container)
        navHost.let {
            navController = navHost!!.findNavController()

            binding.idBtnToA.setOnClickListener {
                navController.navigate(R.id.action_fragmentStart_toA)
            }
            binding.idBtnToB.setOnClickListener {
                /*navController.navigate(R.id.action_fragmentStart_toB)*/
                navController.navigate(FragmentStartDirections.actionFragmentStartToB(name = "Josema"))
            }
        }
    }
}