package com.example.viewpagerindicatordemo

import android.os.Bundle
import android.text.SpannableString
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.viewpagerindicatordemo.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {

    private lateinit var firstBinding: FragmentFirstBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        firstBinding = FragmentFirstBinding.inflate(layoutInflater)

        val textView = firstBinding.textView
        val spannable = SpannableString("Save and optimize \nyour spending")
        textView.text = spannable

        val secondTexView = firstBinding.secondTextView
        val secondSpannable = SpannableString("Take control of your finances with tips on how \nto lower bills and be better with your savings.")
        secondTexView.text = secondSpannable



        return firstBinding.root
    }


}