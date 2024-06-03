package com.example.test2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageSwitcher;
import android.widget.ImageView;

public class MainActivity4 extends AppCompatActivity {
    ImageButton i1,i2,i3,i4;
    private ImageSwitcher imageSwitcher;
    private int[] images = { R.drawable.ads1, R.drawable.ads2, R.drawable.ad4 }; // Add your image names here
    private int currentIndex= 0;
    private Handler handler= new Handler();
    private Runnable runnable= new Runnable() {
        @Override
        public void run() {
            currentIndex++;
            if (currentIndex == images.length) {
                currentIndex = 0;
            }
            imageSwitcher.setImageResource(images[currentIndex]);
            handler.postDelayed(this, 6000); // Change image every 3 seconds
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        ImageButton i1=findViewById(R.id.indoor);
        ImageButton i2=findViewById(R.id.outdoor);
        ImageButton i3 = findViewById(R.id.seeds);
        ImageButton i4=findViewById(R.id.tools);
        i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity4.this, MainActivity8.class);
                startActivity(i);

            }
        });
        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity4.this, MainActivity7.class);
                startActivity(i);
            }
        });
        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity4.this, MainActivity6.class);
                startActivity(i);
            }
        });
        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity4.this, MainActivity5.class);
                startActivity(i);
            }
        });
        imageSwitcher = findViewById(R.id.is);
        imageSwitcher.setFactory(() -> {
            ImageView imageView = new ImageView(getApplicationContext());
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            return imageView;
        });

        imageSwitcher.setImageResource(images[currentIndex]); // Set the initial image
        handler.postDelayed(runnable, 3000); // Start the image switcher
    }


    protected void onPause() {
        super.onPause();
        handler.removeCallbacks(runnable); // Stop the image switcher when activity is not visible
    }

    @Override
    protected void onResume() {
        super.onResume();
        handler.postDelayed(runnable, 3000); // Restart the image switching on resume
    }
}