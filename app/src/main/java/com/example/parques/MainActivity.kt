package com.example.parques

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.parques.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val TAG="info"
        binding.button.setOnClickListener{
            //  Para los checkbox
            /* if (binding.checkBox4.isChecked)
            Log.d(TAG, "Las actividades del parque son: ${binding.checkBox4.text}")

            //  Para el spinner:
            Log.d(TAG, "Las hora de apertura es: ${binding.spinner.selectedItem}")
             */

            val miDialogo = DialogBox()
            miDialogo.show(supportFragmentManager, "MiDialogo")
        }
    }
}