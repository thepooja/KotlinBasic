package com.androidbasic.brodcastReciever

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast

class AirplaneModeChangeRecevier : BroadcastReceiver() {

    override fun onReceive(context: Context?, p1: Intent?) {
        // intent contains the information about the broadcast
        // in our case broadcast is change of airplane mode

        // if getBooleanExtra contains null value,it will directly return back


        Log.e("TAG", "onReceive: ")
        val isAirplaneMode = p1?.getBooleanExtra("state",false) ?:return


        // checking whether airplane mode is enabled or not
        if (isAirplaneMode) {
            // showing the toast message if airplane mode is enabled

            Toast.makeText(context, "Airplane Mode Enabled", Toast.LENGTH_LONG).show()
        } else {
            // showing the toast message if airplane mode is disabled
            Toast.makeText(context, "Airplane Mode Disabled", Toast.LENGTH_LONG).show()
        }
    }

}