package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    /*onCreate메서드는 액티비티가 실행되면 자동으로 선언됨.
    * setContentView는 화면 출력 함수.*/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //R.layout.activity_main는 res/layout/activity_main.xml이다.
    }
}