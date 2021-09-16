package com.theitzon.navigation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Scroll_View extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scroll_view);

        TextView titleText = (TextView) findViewById(R.id.txtTitle);
        TextView longText = (TextView) findViewById(R.id.txtLong);

        titleText.setText("This is Dummy Title:");
        StringBuilder stringBuilder = new StringBuilder();
        String someMessage = "This is the Message I am going to append Here, I will be using Scroll view here as well.";

        for(int i=0; i<100; i++){
            stringBuilder.append(someMessage);
        }

        longText.setText(stringBuilder.toString());


    }
}
