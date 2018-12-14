package ndk.sample.`in`.android

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var buttonCallLibraryMethod: Button

    companion object {
        init {
            System.loadLibrary("MyLibrary");
        }
    }

    external fun sum(a: Int): Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonCallLibraryMethod = findViewById(R.id.buttonCallLibraryMethod);
        buttonCallLibraryMethod.setOnClickListener {
            Snackbar.make(it, "" + sum(100), Snackbar.LENGTH_LONG).show()
        }
    }
}