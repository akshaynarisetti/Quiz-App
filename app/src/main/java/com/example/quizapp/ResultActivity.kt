package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val username = intent.getStringExtra(Constants.USER_NAME)
        val total = intent.getIntExtra(Constants.TOTAL_QUESTIONS,0)
        val correct = intent.getIntExtra(Constants.TOTAL_ANSWERS,0)

       tv_username.text ="${username.toString()}"
        tv_score.text ="Your score is $correct out of $total"

        btn_finish.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}