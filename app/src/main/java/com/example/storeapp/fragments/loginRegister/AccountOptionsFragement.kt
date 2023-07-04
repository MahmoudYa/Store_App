package com.example.storeapp.fragments.loginRegister

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.storeapp.R
import com.example.storeapp.databinding.FragmentAccountOptionsBinding

class AccountOptionsFragement: Fragment(R.layout.fragment_account_options)  {
    private lateinit var binding: FragmentAccountOptionsBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAccountOptionsBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.buttonLoginAccountOpions.setOnClickListener{
            findNavController().navigate(R.id.action_accountOptionsFragement_to_loginFragment)
        }

        binding.buttonRegisterAccountOpions.setOnClickListener{
            findNavController().navigate(R.id.action_accountOptionsFragement_to_registerFragment)
        }
    }
}