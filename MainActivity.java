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
        //Buttons and Edit Texts
        Button compareBtn = (Button) findViewById(R.id.btnCompare);
        Button swapBtn = (Button) findViewById(R.id.btnSwap);
        EditText e_1 = (EditText) findViewById(R.id.e1);
        EditText e_2 = (EditText) findViewById(R.id.e2);
        //SWAP_BUTTON
        swapBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //OL' SWITCHEROO
                String switcheroo = e_1.getText().toString();
                e_1.setText(e_2.getText().toString());
                e_2.setText(switcheroo);
            }
        });
        //COMPARE_BUTTON
        compareBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                
                String t_1 = e_1.getText().toString();
                String t_2 = e_2.getText().toString();

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
