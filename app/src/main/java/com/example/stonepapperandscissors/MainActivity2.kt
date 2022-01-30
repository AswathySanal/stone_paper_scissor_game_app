package com.example.stonepapperandscissors

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
var scoreUser = 0
var compUser = 0
var computer = 0
var user1= 0
class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        val text1 = findViewById<TextView>(R.id.textView11)
        val intent = intent
        val num = intent.getStringExtra("number")
        var numOfRound = num!!.toInt();
        val stone = findViewById<Button>(R.id.button2)
        val paper = findViewById<Button>(R.id.button3)
        val scissor = findViewById<Button>(R.id.button4)
        val compChoiceText = findViewById<TextView>(R.id.textView10)
        val userChoiceText = findViewById<TextView>(R.id.textView11)
        val compScore = findViewById<TextView>(R.id.textView7)
        val userScore = findViewById<TextView>(R.id.textView8)
        val choices = arrayOf("Stone", "Paper", "Scissors")

//        Button click and basic game logic
                var i=1;

                stone.setOnClickListener {
                    if(i<=numOfRound){
                        val randomNumber = (0..2).random()
                        userChoiceText.text = "Stone"
                        compChoiceText.text = choices[randomNumber]
                        score()
                        i++
                    }
                    else{
                        result()
                        if(computer == 1 && user1==0){
                            val intent = Intent(this, MainActivity3::class.java)
                            scoreUser = 0;
                            compUser = 0;
                            startActivity(intent)
                        }
                        else if(computer == 0 && user1==1){
                            val intent = Intent(this, MainActivity5::class.java)
                            scoreUser = 0;
                            compUser = 0;
                            startActivity(intent)
                        }
                        else if(computer ==0 && user1==0){
                            val intent = Intent(this, MainActivity4::class.java)
                            scoreUser = 0;
                            compUser = 0;
                            startActivity(intent)
                        }



                    }
                }
                paper.setOnClickListener {
                    if(i<=numOfRound){
                        val randomNumber = (0..2).random()
                        userChoiceText.text = "Paper"
                        compChoiceText.text = choices[randomNumber]
                        score()
                        i++
                    }
                    else{
                        result()
                        if(computer == 1 && user1==0){
                            val intent = Intent(this, MainActivity3::class.java)
                            scoreUser = 0;
                            compUser = 0;
                            startActivity(intent)
                        }
                        else if(computer == 0 && user1==1){
                            val intent = Intent(this, MainActivity5::class.java)
                            scoreUser = 0;
                            compUser = 0;
                            startActivity(intent)
                        }
                        else if(computer ==0 && user1==0){
                            val intent = Intent(this, MainActivity4::class.java)
                            scoreUser = 0;
                            compUser = 0;
                            startActivity(intent)
                        }

                    }
                }
                scissor.setOnClickListener {
                    if(i<=numOfRound){
                        val randomNumber = (0..2).random()
                        userChoiceText.text = "Scissors"
                        compChoiceText.text = choices[randomNumber]
                        score()
                        i++
                    }
                    else{
                        result()
                        if(computer == 1 && user1==0){
                            val intent = Intent(this, MainActivity3::class.java)
                            scoreUser = 0;
                            compUser = 0;
                            startActivity(intent)
                        }
                        else if(computer == 0 && user1==1){
                            val intent = Intent(this, MainActivity5::class.java)
                            scoreUser = 0;
                            compUser = 0;
                            startActivity(intent)
                        }
                        else if(computer ==0 && user1==0){
                            val intent = Intent(this, MainActivity4::class.java)
                            scoreUser = 0;
                            compUser = 0;
                            startActivity(intent)
                        }
                    }
                }
    }

    private fun result() {
        val compScore = findViewById<TextView>(R.id.textView7)
        val userScore = findViewById<TextView>(R.id.textView8)
        val comp = compScore.getText()
        val user =userScore.getText()
        val computerScoreString=comp.toString()
        val computerScore = computerScoreString.toInt()
        val userScoreString = user.toString()
        val useScore = userScoreString.toInt()
        if(computerScore>useScore){
            computer= 1;
        }
        else if(computerScore<useScore){
            user1= 1;
        }
    }

    private fun score() {
        val compScore = findViewById<TextView>(R.id.textView7)
        val userScore = findViewById<TextView>(R.id.textView8)
        val compChoiceText = findViewById<TextView>(R.id.textView10)
        val userChoiceText = findViewById<TextView>(R.id.textView11)
        val comp = compChoiceText.getText()
        val user =userChoiceText.getText()

        if(comp=="Stone" && user=="Paper"){
            scoreUser++
            userScore.text=scoreUser.toString()

        }
        else if(comp=="Paper" && user=="Stone"){
            compUser++
            compScore.text=compUser.toString()

        }
        else if(comp=="Paper" && user=="Scissors"){
            scoreUser++
            userScore.text=scoreUser.toString()

        }
        else if(comp=="Scissors" && user=="Paper"){
            compUser++
            compScore.text=compUser.toString()

        }
        else if(comp=="Scissors" && user=="Stone"){
            scoreUser++
            userScore.text=scoreUser.toString()

        }
        else if(comp=="Stone" && user=="Scissors"){
            compUser++
            compScore.text=compUser.toString()

        }

    }
}
