package com.example.moya_lab_hands_on;

import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class Act2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act2);
        //Perry Andre' B. Moya BSIT 3.2a
        //SHOW_RESULT
        TextView ViewResult = (TextView) findViewById(R.id.Result);

        String result = getIntent().getStringExtra("result");

        ViewResult.setText(result);
    }
}