package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    public void btnConvert(View view){

      EditText mAmaount =(EditText) findViewById(R.id.txt);
      double inAmaount = Integer.parseInt(mAmaount.getText().toString());

      inAmaount =  inAmaount *1.26;

      Toast.makeText(MainActivity.this, "£"+inAmaount, Toast.LENGTH_SHORT).show();



    }




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
