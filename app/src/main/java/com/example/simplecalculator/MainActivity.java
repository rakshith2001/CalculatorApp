package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button plus,min,div,sub;
    EditText in1,in2;
    TextView res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        plus = findViewById(R.id.plus);
        min = findViewById(R.id.min);
        div = findViewById(R.id.div);
        sub = findViewById(R.id.sub);
        in1 = findViewById(R.id.in1);
        in2 = findViewById(R.id.in2);
        res= findViewById(R.id.res);


    }
    public void  doPlus (View V)
    {
        String a1 =  in1.getText().toString();
        String a2 =  in2.getText().toString();
        if(a1.equals("")){
            Toast.makeText(this,"Incorrect input",Toast.LENGTH_SHORT).show();
        }
        else {
            float num1 = Float.parseFloat(a1);
            float num2 = Float.parseFloat(a2);
            float sum = num1+ num2;
            res.setText(""+sum);
        }

    }
    public void  doMin (View V)
    {
        String a1 =  in1.getText().toString();
        String a2 =  in2.getText().toString();
        if(a1.equals("")){
            Toast.makeText(this,"Incorrect input",Toast.LENGTH_SHORT).show();
        }
        else {
            float num1 = Float.parseFloat(a1);
            float num2 = Float.parseFloat(a2);
            float min = num1- num2;
            res.setText(""+min);
        }

    }
    public void  doDiv (View V)
    {
        String a1 =  in1.getText().toString();
        String a2 =  in2.getText().toString();
        if(a1.equals("")){
            Toast.makeText(this,"Incorrect input",Toast.LENGTH_SHORT).show();
        }
        else {
            float num1 = Float.parseFloat(a1);
            float num2 = Float.parseFloat(a2);
            float div = num1+ num2;
            res.setText(""+div);
        }

    }
    public void  doSub (View V)
    {
        String a1 =  in1.getText().toString();
        String a2 =  in2.getText().toString();
        if(a1.equals("")){
            Toast.makeText(this,"Incorrect input",Toast.LENGTH_SHORT).show();
        }
        else {
            float num1 = Float.parseFloat(a1);
            float num2 = Float.parseFloat(a2);
            float sub = num1/ num2;
            res.setText(""+sub);
        }

    }

}