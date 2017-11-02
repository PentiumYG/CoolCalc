package com.example.yuktigoswami.coolcalc;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class CalcActivity extends Activity implements View.OnClickListener{
    TextView t;
    EditText e1, e2;
    Button b1, b2, b3, b4, b5, b6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);
        t=(TextView)findViewById(R.id.textView);
        e1=(EditText)findViewById(R.id.editText);
        e2=(EditText)findViewById(R.id.editText2);
        b1=(Button)findViewById(R.id.button);
        b2=(Button)findViewById(R.id.button2);
        b3=(Button)findViewById(R.id.button3);
        b4=(Button)findViewById(R.id.button4);
        b5=(Button)findViewById(R.id.button5);
        b6=(Button)findViewById(R.id.button6);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.button){
            int a,b,c;
            String s1=e1.getText().toString();
            String s2=e2.getText().toString();
            a=Integer.parseInt(s1);
            b=Integer.parseInt(s2);
            c=a+b;
            String s3=String.valueOf(c);
            t.setText(s3);

        }
        if(v.getId()==R.id.button2){
            int a,b,c;
            String s1=e1.getText().toString();
            String s2=e2.getText().toString();
            a=Integer.parseInt(s1);
            b=Integer.parseInt(s2);
            c=a-b;
            String s3=String.valueOf(c);
            t.setText(s3);

        }
        if(v.getId()==R.id.button3){
            int a,b,c;
            String s1=e1.getText().toString();
            String s2=e2.getText().toString();
            a=Integer.parseInt(s1);
            b=Integer.parseInt(s2);
            c=a*b;
            String s3=String.valueOf(c);
            t.setText(s3);

        }
        if(v.getId()==R.id.button4){
            float a,b,c;
            String s1=e1.getText().toString();
            String s2=e2.getText().toString();
            a=Float.parseFloat(s1);
            b=Float.parseFloat(s2);
            c=a/b;
            String s3=String.valueOf(c);
            t.setText(s3);

        }
        if(v.getId()==R.id.button5){
            int a,b,c;
            String s1=e1.getText().toString();
            String s2=e2.getText().toString();
            a=Integer.parseInt(s1);
            b=Integer.parseInt(s2);
            c=a%b;
            String s3=String.valueOf(c);
            t.setText(s3);

        }
        if(v.getId()==R.id.button6){
            e1.setText(null);
            e2.setText(null);
            t.setText("0");

        }

    }
}
