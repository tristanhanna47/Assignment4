package com.example.t00584336.assignment4;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

    TextView screen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        screen = findViewById(R.id.screen);

    }

    public int multiply (int x, int y)
    {
        int z;
        z = x * y;
        return z;
    }

    public void display (View view)
    {
        

    }
}
