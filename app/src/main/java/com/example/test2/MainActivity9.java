package com.example.test2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity9 extends AppCompatActivity {
    Button b1,b2,b3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);
        Button b1=findViewById(R.id.btf1);
        Button b2=findViewById(R.id.btf2);
        Button b3=findViewById(R.id.btf3);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm=getSupportFragmentManager();
                fm.beginTransaction().replace(R.id.fragmentContainerView4,Fragment1.class,null)
                        .setReorderingAllowed(true).addToBackStack("name").commit();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm=getSupportFragmentManager();
                fm.beginTransaction().replace(R.id.fragmentContainerView4,Fragment2.class,null)
                        .setReorderingAllowed(true).addToBackStack("name").commit();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm=getSupportFragmentManager();
                fm.beginTransaction().replace(R.id.fragmentContainerView4,Fragment3.class,null)
                        .setReorderingAllowed(true).addToBackStack("name").commit();
            }
        });

    }
}