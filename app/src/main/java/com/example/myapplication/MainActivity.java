package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button edibutton = findViewById(R.id.signin);

        View.OnClickListener listenerEditbutton = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(),MainActivity2.class);

                intent.setClass(view.getContext(),MainActivity2.class);

                startActivity( new Intent(view.getContext(),MainActivity2.class));
            }
        };
        edibutton.setOnClickListener(listenerEditbutton);
    }

}