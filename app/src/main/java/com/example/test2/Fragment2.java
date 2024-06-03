package com.example.test2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class Fragment2 extends Fragment {

    int a,b;
    String op;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        return inflater.inflate(R.layout.fragment_2, container, false);
    }
    @Override
    public void onViewCreated( View view,  Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TextView v=view.findViewById(R.id.textView1);
        Button btn1=view.findViewById(R.id.AC);
        Button btn2=view.findViewById(R.id.equal);
        Button btn3=view.findViewById(R.id.mod);
        Button btn4=view.findViewById(R.id.add);
        Button btn5=view.findViewById(R.id.one);
        Button btn6=view.findViewById(R.id.two);
        Button btn7=view.findViewById(R.id.three);
        Button btn8=view.findViewById(R.id.sub);
        Button btn9=view.findViewById(R.id.four);
        Button btn10=view.findViewById(R.id.five);
        Button btn11=view.findViewById(R.id.six);
        Button btn12=view.findViewById(R.id.mult);
        Button btn13=view.findViewById(R.id.seven);
        Button btn14=view.findViewById(R.id.eight);
        Button btn15=view.findViewById(R.id.nine);
        Button btn16=view.findViewById(R.id.zero);

//        Intent i=view.getIntent();
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                v.setText("");

            }
        });
        btn15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str=String.valueOf(v.getText());
                v.setText(str+"9");

            }
        });
        btn14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str=String.valueOf(v.getText());
                v.setText(str+"8");

            }
        });
        btn13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str=String.valueOf(v.getText());
                v.setText(str+"7");

            }
        });
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str=String.valueOf(v.getText());
                v.setText(str+"6");

            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str=String.valueOf(v.getText());
                v.setText(str+"5");

            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str=String.valueOf(v.getText());
                v.setText(str+"4");

            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str=String.valueOf(v.getText());
                v.setText(str+"3");

            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str=String.valueOf(v.getText());
                v.setText(str+"2");

            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str=String.valueOf(v.getText());
                v.setText(str+"1");

            }
        });
        btn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str=String.valueOf(v.getText());
                v.setText(str+"0");

            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=Integer.valueOf(String.valueOf(v.getText()));
                v.setText("");
                op="+";
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=Integer.valueOf(String.valueOf(v.getText()));
                v.setText("");
                op="-";
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=Integer.valueOf(String.valueOf(v.getText()));
                v.setText("");
                op="/";
            }
        });
        btn12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a=Integer.valueOf(String.valueOf(v.getText()));
                v.setText("");
                op="*";
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                b=Integer.valueOf(String.valueOf(v.getText()));
                v.setText("");
                switch (op){
                    case "+":
                        v.setText(String.valueOf(a+b));
                        break;
                    case "-":
                        v.setText(String.valueOf(a-b));
                        break;
                    case "/":
                        v.setText(String.valueOf(a/b));
                        break;
                    case "*":
                        v.setText(String.valueOf(a*b));
                        break;
                }
            }
        });





    }

}