package com.theitzon.navigation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btnToSecond =  (Button) findViewById(R.id.btn1);
        TextView txtOne = (TextView) findViewById(R.id.txt1);

        txtOne.setText("This is 1st page, Click Button to Navigate");

        btnToSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondScreen.class);
                startActivity(intent);
//                finish();
            }
        });
    }
}