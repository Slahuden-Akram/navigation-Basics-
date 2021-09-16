package com.theitzon.navigation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class SecondScreen extends AppCompatActivity {
    @Override
    protected void onCreate( @Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_screen_layout);

        Button btnToThird = (Button) findViewById(R.id.btn2);
        TextView txtTwo = (TextView) findViewById(R.id.txt2);
        txtTwo.setText("This is an Image Page: page 2, Navigate to back page.");


        ImageView img = (ImageView) findViewById(R.id.img1);
        int img1 = getResources().getIdentifier("@drawable/image", null, this.getPackageName());
        img.setImageResource(img1);
        btnToThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SecondScreen.this, listView.class);
                startActivity(intent);
            }
        });
    }
}
