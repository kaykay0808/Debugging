package com.kay.debugging

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import timber.log.Timber

private const val TAG = "Jason"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Timber.tag(TAG).d("this is where the app crashed before")
        val helloTextView: TextView = findViewById(R.id.hello_world)
        //Timber.tag(TAG).d("this should be logged if the bug is fixed")
        helloTextView.text = "Hello, debugging!"

        logging()
        division()
    }

    fun logging() {
        Timber.tag(TAG).e("ERROR: a serious error like an app crash")
        Timber.tag(TAG).w("WARN: warns about the potential for serious errors")
        Timber.tag(TAG).i("INFO: reporting technical information, such as an operation succeeding")
        Timber.tag(TAG).d("DEBUG: reporting technical information useful for debugging")
        Timber.tag(TAG).v("VERBOSE: more verbose than DEBUG logs")
    }

    fun division() {
        val numerator = 60
        var denominator = 4
        repeat(4) {
            Timber.tag(TAG).d(denominator.toString())
            Timber.tag(TAG).v((numerator / denominator).toString())
            denominator--
        }
    }
}