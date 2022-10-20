package com.example.kotlinbasic.practise.SharedViewModel

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.lifecycle.ViewModelProvider
import com.example.kotlinbasic.R


class MessageSenderFragment : Fragment() {


    lateinit var btn:Button

    lateinit var writeMsg: EditText

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_message_sender, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn = view.findViewById(R.id.buttonSend)

        writeMsg = view.findViewById(R.id.writeMessage)

        val model = ViewModelProvider(requireActivity()).get(SharedViewModel::class.java)

        btn.setOnClickListener{
            model.sendMessage(writeMsg.text.toString())
        }
    }
}