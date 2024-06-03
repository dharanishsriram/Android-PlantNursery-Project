package com.example.test2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1;
    Button b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = findViewById(R.id.button3);
        b2 = findViewById(R.id.button4);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this, MainActivity2.class);
                startActivity(i);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this, MainActivity3.class);
                startActivity(i);
            }
        });





    }

    public boolean onCreateOptionsMenu(Menu menu){
        super.onCreateOptionsMenu(menu);
        CreateMenu(menu);
        return true;
    }
    private void CreateMenu(Menu menu) {
        MenuItem mu1=menu.add(0,0,0,"Orders");
        {
            mu1.setAlphabeticShortcut('a');
        }
        MenuItem m2=menu.add(0,1,1,"contact");
        {
            m2.setAlphabeticShortcut('b');
        }
        MenuItem m3=menu.add(0,2,2,"Calci");
        {
            m2.setAlphabeticShortcut('c');
        }

    }
    public boolean onOptionsItemSelected(MenuItem item)
    {
        return menuChoice(item);
    }


    private boolean menuChoice(MenuItem item) {
        switch (item.getItemId()) {
            case 0:
                Intent i = new Intent(MainActivity.this, MainActivity4.class);
                startActivity(i);
                return true;
            case 1:
                Toast.makeText(MainActivity.this, "phone no:9626253725", Toast.LENGTH_SHORT).show();
                return true;
            case 2:
                Intent i2 = new Intent(MainActivity.this, MainActivity9.class);
                startActivity(i2);
                return true;
        }
        return false;
    }
}