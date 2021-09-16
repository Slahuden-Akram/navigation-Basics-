package com.theitzon.navigation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class listView extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listview);

//        TextView txt = (TextView) findViewById(R.id.txt3);
//        txt.setText("This is 3rd Screen");

        ListView list = (ListView) findViewById(R.id.list1);
        Button btnback2 = (Button) findViewById(R.id.btn5);

        ArrayList<String> name = new ArrayList<>();
        name.add("Slahuden");
        name.add("Usman");
        name.add("Umar");
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, name);
        list.setAdapter(adapter);



        btnback2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(listView.this, Scroll_View.class);
                startActivity(intent);
            }
        });

    }
}
