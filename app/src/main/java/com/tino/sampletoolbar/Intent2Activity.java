package com.tino.sampletoolbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class Intent2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent2);

        //뒤로가기 버튼 커스터마이징
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_close);
        //툴바에 표시될 제목 설정
        setTitle("Intent2");
    }
}
