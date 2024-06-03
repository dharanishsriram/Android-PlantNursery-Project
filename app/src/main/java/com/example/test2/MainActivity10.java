package com.example.test2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity10 extends AppCompatActivity {

    EditText name, contact, Address,plantname;
    Button insert, cart, delete, view,exit;
    DBHelper DB;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);
        TextView marqueeText = findViewById(R.id.marqueeText);
        marqueeText.setSelected(true);
        exit=findViewById(R.id.exit);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity10.this, MainActivity11.class);
                startActivity(i);
            }
        });
        name = findViewById(R.id.name);
        contact = findViewById(R.id.contact);
        Address = findViewById(R.id.dob);
        plantname = findViewById(R.id.plant);
        insert = findViewById(R.id.btnInsert);
        cart = findViewById(R.id.btnUpdate);
        delete = findViewById(R.id.btnDelete);
        view = findViewById(R.id.btnView);
        DB = new DBHelper(this);
        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nameTXT = name.getText().toString();
                String contactTXT = contact.getText().toString();
                String addTXT = Address.getText().toString();
                String plantTXT=plantname.getText().toString();

                Boolean checkinsertdata = DB.insertuserdata(nameTXT, contactTXT, addTXT,plantTXT);
                if(checkinsertdata==true)
                    Toast.makeText(MainActivity10.this, "Thanks for Your Purchase", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity10.this, "New Entry Not Inserted", Toast.LENGTH_SHORT).show();
            }        });
        cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nameTXT = name.getText().toString();
                String contactTXT = contact.getText().toString();
                String addTXT = Address.getText().toString();
                String plantTXT=plantname.getText().toString();

                Boolean checkupdatedata = DB.updateuserdata(nameTXT, contactTXT, addTXT,plantTXT);
                if(checkupdatedata==true)
                    Toast.makeText(MainActivity10.this, "Added to Cart", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity10.this, "ERROR try again", Toast.LENGTH_SHORT).show();
            }        });
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nameTXT = name.getText().toString();
                Boolean checkudeletedata = DB.deletedata(nameTXT);
                if(checkudeletedata==true)
                    Toast.makeText(MainActivity10.this, "Entry Deleted", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(MainActivity10.this, "Entry Not Deleted", Toast.LENGTH_SHORT).show();
            }        });

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cursor res = DB.getdata();
                if(res.getCount()==0){
                    Toast.makeText(MainActivity10.this, "No Entry Exists", Toast.LENGTH_SHORT).show();
                    return;
                }
                StringBuffer buffer = new StringBuffer();
                while(res.moveToNext()){
                    buffer.append("Name :"+res.getString(0)+"\n");
                    buffer.append("Contact :"+res.getString(1)+"\n");
                    buffer.append("Address of resipiant:"+res.getString(2)+"\n");
                    buffer.append("Plant name:"+res.getString(3)+"\n\n");
                }

                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity10.this);
                builder.setCancelable(true);
                builder.setTitle("Customer Entries");
                builder.setMessage(buffer.toString());
                builder.show();
            }
        });
    }
}