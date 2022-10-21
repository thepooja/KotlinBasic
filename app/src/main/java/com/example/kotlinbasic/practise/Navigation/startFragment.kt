package com.example.kotlinbasic.practise.Navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.NavHostFragment
import com.example.kotlinbasic.R
import kotlinx.android.synthetic.main.fragment_start.*


class StartFragment : Fragment() {

    lateinit var  btnNavigate:Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_start, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnNavigate = view.findViewById(R.id.btnNavigate)
        btnNavigate.setOnClickListener{
            NavHostFragment.findNavController(this).navigate(R.id.action_startFragment_to_endFragment)
        }
    }
}