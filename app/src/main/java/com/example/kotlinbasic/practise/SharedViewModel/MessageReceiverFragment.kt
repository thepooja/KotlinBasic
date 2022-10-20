package com.example.kotlinbasic.practise.SharedViewModel

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.kotlinbasic.R


class MessageReceiverFragment : Fragment() {

    lateinit var displayMessage : TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_message_receiver, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        displayMessage = view.findViewById(R.id.textViewReceiver)

        val model = ViewModelProvider(requireActivity()).get(SharedViewModel::class.java)

        model.message.observe(viewLifecycleOwner, Observer { displayMessage.text = it })
    }
}