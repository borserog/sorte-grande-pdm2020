package com.example.sortgrande

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import kotlin.random.Random
/*
Na aula realizada no dia 23/02/2021, foi desenvolvido um aplicativo para gerar 01(um) número
aleatório. Esse número gerado está sendo exibido no Log.
Desenvolva um aplicativo para gerar 6 (seis) números inteiros aleatórios e distintos. Esses valores
deverão ser exibidos também no Log. Os números deverão estar no intervalo [1, 60].
*/
class MainActivity : AppCompatActivity() {
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.button = findViewById(R.id.btnRandom);

        this.button.setOnClickListener { generateRandomList(it) }
    }

    private fun generateRandomList(view: View) {
        val randomList = mutableListOf<Int>()

        for (index in 0..5) {
            var randomNumber = Random.nextInt(1,61)

            while (randomList.any { it == randomNumber }) {
                randomNumber = Random.nextInt(1,61)
            }

            randomList.add(randomNumber)
        }

        Log.i("DEV", randomList.toString())
    }
}