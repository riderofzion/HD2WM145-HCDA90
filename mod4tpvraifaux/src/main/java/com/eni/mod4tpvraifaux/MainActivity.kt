package com.eni.mod4tpvraifaux

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.eni.mod4tpvraifaux.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var amb :ActivityMainBinding
    val lsQuestionsReponse = listOf(
        QuestionReponse("Est-ce que la terre est plate", true),
        QuestionReponse("Est-ce que les oiseaux nous espionnent", true),
        QuestionReponse("Est-ce que les avions nous asphixient", true),
        QuestionReponse("Peut-on s'en servir pour donner de l'élan à un pigeon", true),
    )
    var indexQ = 0
    var score = 0
    var gameFinished = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        amb = DataBindingUtil.setContentView(this,R.layout.activity_main)
        showQuestion()
        showScore()
        amb.buttonVrai.setOnClickListener { processUserResponse(true) }
        amb.buttonFaux.setOnClickListener { processUserResponse(false) }

    }
    //Poser la question suivante s'il y en a une
    fun showQuestion(){
        amb.qr = lsQuestionsReponse[indexQ]
    }

    fun showScore(){
        amb.textViewScore.text = "$score/${lsQuestionsReponse.size}"
    }

    fun processUserResponse(responseUser : Boolean) {
        if(indexQ <= lsQuestionsReponse.size - 1 && !gameFinished){
            if(responseUser == (amb.qr as QuestionReponse).reponse){
                score++
                showScore()
            }
            if(indexQ == lsQuestionsReponse.size - 1) {
                gameFinished = true
                return;
            }
            indexQ++
            showQuestion()
        }else{
            amb.buttonVrai.isEnabled = false
            amb.buttonFaux.isEnabled = false
        }

    }
}