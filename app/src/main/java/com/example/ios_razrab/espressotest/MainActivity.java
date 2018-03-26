package com.example.ios_razrab.espressotest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView =(TextView) findViewById(R.id.tv);
    }



    public void ocl(View view) {

        Toast.makeText(this, "Hello!", Toast.LENGTH_SHORT).show();

        textView .setText("abc");
    }
}
