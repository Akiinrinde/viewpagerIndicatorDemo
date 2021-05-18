package com.example.viewpagerindicatordemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.viewpagerindicatordemo.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {

    private lateinit var secondBinding: FragmentSecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val textView = secondBinding.textView

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        secondBinding = FragmentSecondBinding.inflate(layoutInflater)
        return secondBinding.root
    }



}