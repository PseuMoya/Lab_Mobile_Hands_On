package com.example.moya_lab_hands_on;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Perry Andre' B. Moya BSIT 3.2a
        //Buttons
        Button compareBtn = (Button) findViewById(R.id.btnCompare);
        Button swapBtn = (Button) findViewById(R.id.btnSwap);

        //SWAP_BUTTON
        swapBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                EditText s_e_1 = (EditText) findViewById(R.id.e1);
                EditText s_e_2 = (EditText) findViewById(R.id.e2);

                //OL' SWITCHEROO
                String switcheroo = s_e_1.getText().toString();
                s_e_1.setText(s_e_2.getText().toString());
                s_e_2.setText(switcheroo);
            }
        });
        //COMPARE_BUTTON
        compareBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                EditText c_e_1 = (EditText) findViewById(R.id.e1);
                EditText c_e_2 = (EditText) findViewById(R.id.e2);

                String t_1 = c_e_1.getText().toString();
                String t_2 = c_e_2.getText().toString();

                Intent intent = new Intent(MainActivity.this, Act2.class);

                if (t_1.equals(t_2)) {
                    intent.putExtra("result", "SAME");
                }
                else {
                    intent.putExtra("result", "NOT THE SAME");
                }
                startActivity(intent);
            }
        });

    }
}