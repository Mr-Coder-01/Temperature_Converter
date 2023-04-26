package com.example.temperature_converter

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.temperature_converter.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.calculateButton.setOnClickListener{
            convertTemp()
        }

    }

    @SuppressLint("SetTextI18n")
    private fun convertTemp() {
       val stringInTextField=binding.temperatureCelsiusEditText.text.toString()
       val temperature= stringInTextField.toDoubleOrNull()
       if(temperature==null){
           binding.result.text=""
           return
       }
        val temperatureTo= when(binding.temperatureOptions.checkedRadioButtonId){
            R.id.fahrenheit_scale->{
                 (temperature*9/5)+32
            }
            else-> {
                temperature  + 273.15
            }
        }


        binding.result.text= "Temperature: $temperatureTo"
    }
}