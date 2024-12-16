package com.example.c_toast

import android.content.Context
import android.widget.Toast

/**
 * Utility class for showing toast messages.
 */
object Toaster {
    /**
     * Displays a Toast message.
     *
     * @param context the context in which the Toast should be displayed.
     * @param msg the message to be displayed in the Toast.
     * @param duration the duration for which the Toast should be displayed (default: Toast.LENGTH_SHORT).
     */
    fun showToast(context: Context?, msg: String?, duration: Int = Toast.LENGTH_SHORT) {
        if (!msg.isNullOrEmpty() && context != null) {
            Toast.makeText(context, msg, duration).show()
        }
    }
}