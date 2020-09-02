package com.example.walletmoney.ui.login

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.walletmoney.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {

    private lateinit var binding: FragmentLoginBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLoginBinding.inflate(inflater)
        val application = requireNotNull(activity).application

        val viewModelFactory = LoginViewModelFactory(application)

        binding.viewModel =
            ViewModelProvider(this, viewModelFactory).get(LoginViewModel::class.java)

        return binding.root
    }
}
