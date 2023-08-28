package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
public class MainActivity2 extends AppCompatActivity {

    Button btnKq= findViewById(R.id.btn1);
    EditText edtx1=findViewById(R.id.ed1);
    EditText edtx2=findViewById(R.id.ed2);
    TextView htkq=findViewById(R.id.textview1);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void tinhTong(View view){
        double so1= Double.parseDouble(edtx1.getText().toString());
        double so2= Double.parseDouble(edtx2.getText().toString());
        double tong=so1+so2;
        htkq.setText(String.valueOf(tong));
    }

}