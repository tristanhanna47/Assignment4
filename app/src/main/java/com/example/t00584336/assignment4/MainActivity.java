package com.example.t00584336.assignment4;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {

    TextView input1;
    EditText screen;
    Button clear,point,equals,divide,multiply,add,subtract,zero,one,two,three,four,five,six,seven,eight,nine;


    float value1, value2;
    double ans = 0;
    boolean addition,subtraction,multiplication,division;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        screen = (EditText)findViewById(R.id.screen);

        zero = (Button) findViewById(R.id.zero);
        one = (Button)findViewById(R.id.one);
        two = (Button)findViewById(R.id.two);
        three = (Button)findViewById(R.id.three);
        four = (Button)findViewById(R.id.four);
        five = (Button)findViewById(R.id.five);
        six = (Button)findViewById(R.id.six);
        seven = (Button)findViewById(R.id.seven);
        eight = (Button)findViewById(R.id.eight);
        nine = (Button)findViewById(R.id.nine);
        add = (Button)findViewById(R.id.add);
        subtract = (Button)findViewById(R.id.subtract);
        multiply = (Button)findViewById(R.id.multiply);
        divide = (Button)findViewById(R.id.divide);
        equals = (Button)findViewById(R.id.equals);
        point = (Button)findViewById(R.id.point);
        clear = (Button)findViewById(R.id.clear);

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen.setText(screen.getText() + "0");
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen.setText(screen.getText() + "1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen.setText(screen.getText() + "2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { screen.setText(screen.getText() + "3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen.setText(screen.getText() + "4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen.setText(screen.getText() + "5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen.setText(screen.getText() + "6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { screen.setText(screen.getText() + "7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { screen.setText(screen.getText() + "8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen.setText(screen.getText() + "9");
            }
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (screen == null)
                    input1.setText("");
                else
                {
                    value1 = Float.parseFloat(screen.getText().toString() + "");
                    addition = true;
                    screen.setText("");
                }

            }
        });
        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (screen == null)
                    input1.setText("");
                else
                {
                    value1 = Float.parseFloat(screen.getText().toString() + "");
                    subtraction = true;
                    screen.setText("");
                }

            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (screen == null)
                    input1.setText("");
                else
                {
                    value1 = Float.parseFloat(screen.getText().toString() + "");
                    addition = false;
                    subtraction = false;
                    division = false;
                    multiplication = true;
                    screen.setText("");
                }

            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (screen == null)
                    input1.setText("");
                else
                {
                    value1 = Float.parseFloat(screen.getText().toString() + "");
                    division = true;
                    screen.setText("");
                }

            }
        });
        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value2 = Float.parseFloat(screen.getText().toString() + "");
                if (addition == true) {
                  //  input1.setText("");
                    screen.setText(value1 + value2 + "");
                    addition = false;
                }
                if (subtraction == true)
                {
                    screen.setText(value1 - value2 + "");
                    subtraction = false;
                }
                if (multiplication == true)
                {
                    screen.setText(value1 * value2 + "");
                    multiplication = false;
                }
                if (division == true)
                {
                    screen.setText(value1 / value2 + "");
                    division = false;
                }

            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                screen.setText("");
            }
        });
        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { screen.setText(screen.getText() + ".");
            }
        });



    }






}
