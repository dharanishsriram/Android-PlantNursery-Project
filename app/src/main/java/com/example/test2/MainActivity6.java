package com.example.test2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity6 extends AppCompatActivity {
    TextView marqueeText;
    Button b1i,b2i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        TextView marqueeText = findViewById(R.id.marqueeText);
        marqueeText.setSelected(true);
        Button b1i=findViewById(R.id.backi);
        Button b2i=findViewById(R.id.exiti);
        b1i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity6.this, MainActivity4.class);
                startActivity(i);
            }
        });
        b2i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity6.this, MainActivity10.class);
                startActivity(i);
            }
        });
    }
}