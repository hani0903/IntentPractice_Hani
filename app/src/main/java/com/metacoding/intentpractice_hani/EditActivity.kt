package com.metacoding.intentpractice_hani

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_edit.*
import kotlinx.android.synthetic.main.activity_main.*

class EditActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit)

        okBtn.setOnClickListener {
            //입력한 새 닉네임이 뭔지 변수에 저장
            val inputNickname = newNicknameEdt.text.toString()

            //입력한 닉네임을 가지고 메인으로 복귀

            //입력한 닉네임을 담아주기 위한 용도로만 사용하는 Intent
            val resultIntent = Intent()
            resultIntent.putExtra("nickname",inputNickname)
            setResult(RESULT_OK, resultIntent)
            finish()

        }

    }
}