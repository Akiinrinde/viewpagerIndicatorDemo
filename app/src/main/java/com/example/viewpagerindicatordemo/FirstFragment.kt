package com.example.viewpagerindicatordemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.viewpagerindicatordemo.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    private lateinit var firstBinding: FragmentFirstBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val textView = firstBinding.textView
        val imageView = firstBinding.imageView

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        firstBinding = FragmentFirstBinding.inflate(layoutInflater)
        return firstBinding.root
    }


}