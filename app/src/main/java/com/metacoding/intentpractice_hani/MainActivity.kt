package com.metacoding.intentpractice_hani

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_edit.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //멤버 변수 만들기
    val REQUEST_FOR_NICKNAME = 1005

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        sendMessageBtn.setOnClickListener {

            //입력한 내용을 변수에 저장
            val inputMessage = messageEdt.text.toString()

            //비행기 티켓 발권
            val myIntent = Intent(this,MessageActivity::class.java)

            //수하물 첨부
            myIntent.putExtra("message", inputMessage )

            //여행 출발
            startActivity(myIntent)
        }

        moveToOtherBtn.setOnClickListener {

            //다른 화면으로 이동하기
            val myIntent = Intent(this,OtherActivity::class.java)
            startActivity(myIntent)

        }
        editNicknameBtn.setOnClickListener {

            val myIntent = Intent(this,EditActivity::class.java)
            //이건 왕복과 같다. 따라서 다음 화면에서 돌아올 때에는 Intent()안에 뭘 써줄 필요 X
            startActivityForResult(myIntent,REQUEST_FOR_NICKNAME)
        }
    }
}