package com.jeho.dice_app

import android.database.DatabaseUtils
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.jeho.dice_app.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val diceImage1 = binding.dice1
        val diceImage2 = binding.dice2

        binding.diceStartBtn.setOnClickListener {

//            Toast.makeText(this, "주사위 GO!", Toast.LENGTH_LONG).show()

//            Log.d("MainActivity", Random.nextInt(1, 7).toString())
//            Log.d("MainActivity", Random.nextInt(1, 7).toString())

            val number1 = (1..6).random()
            val number2 = (1..6).random()

            if (number1 == 1) {
                diceImage1.setImageResource(R.drawable.dice_1)
            } else if (number1 == 2) {
                diceImage1.setImageResource(R.drawable.dice_2)
            } else if (number1 == 3) {
                diceImage1.setImageResource(R.drawable.dice_3)
            } else if (number1 == 4) {
                diceImage1.setImageResource(R.drawable.dice_4)
            } else if (number1 == 5) {
                diceImage1.setImageResource(R.drawable.dice_5)
            } else {
                diceImage1.setImageResource(R.drawable.dice_6)
            }

            if (number2 == 1) {
                diceImage2.setImageResource(R.drawable.dice_1)
            } else if (number1 == 2) {
                diceImage2.setImageResource(R.drawable.dice_2)
            } else if (number1 == 3) {
                diceImage2.setImageResource(R.drawable.dice_3)
            } else if (number1 == 4) {
                diceImage2.setImageResource(R.drawable.dice_4)
            } else if (number1 == 5) {
                diceImage2.setImageResource(R.drawable.dice_5)
            } else {
                diceImage2.setImageResource(R.drawable.dice_6)
            }


        }


    }
}