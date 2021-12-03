package com.example.myapplication

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var numbersGuess: Button
    private lateinit var guessPhrase: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        numbersGuess = findViewById(R.id.numbersGb)
        numbersGuess.setOnClickListener {
            startActivity(Intent(this,Number_Game::class.java))}

        guessPhrase = findViewById(R.id.guessPb)
        guessPhrase.setOnClickListener {
            startActivity(Intent(this,Guess_phrase::class.java))}


        title = "Main Activity"
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.item_list1, menu)
        return true

    }

    override fun onPrepareOptionsMenu(menu: Menu?): Boolean {
        val item:MenuItem= menu!!.getItem(2)
        item.isVisible=false
        return super.onPrepareOptionsMenu(menu)


    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        when (item.itemId) {
            R.id.NGi -> {
                startActivity(Intent(this,Number_Game::class.java))
                return true
            }


            // return true

            R.id.GPi -> {
                startActivity(Intent(this,Guess_phrase::class.java))
                return true
            }

            //   startGame(.GuessThePhrase())


        }

        return super.onOptionsItemSelected(item)
    }

}

