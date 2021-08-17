package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button ac;
    private Button equ;
    private Button add;
    private Button sub;
    private Button mul;
    private Button div;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button button0;
    private TextView resultText;
    private double value1, value2;
    private int condition;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        resultText = findViewById(R.id.resultText);
        ac = findViewById(R.id.acButton);
        equ = findViewById(R.id.equButton);
        add = findViewById(R.id.additionButton);
        sub = findViewById(R.id.subButton);
        mul = findViewById(R.id.mulButton);
        div = findViewById(R.id.divButton);
       button1 = findViewById(R.id.button1);
       button2 = findViewById(R.id.button2);
       button3 = findViewById(R.id.button3);
       button4 = findViewById(R.id.button4);
       button5 = findViewById(R.id.button5);
       button6 = findViewById(R.id.button6);
       button7 = findViewById(R.id.button7);
       button8 = findViewById(R.id.button8);
       button9 = findViewById(R.id.button9);
       button0 = findViewById(R.id.button0);

       ac.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               resultText.setText("");
           }
       });
       button0.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               resultText.setText(resultText.getText() + "0");
           }
       });
       button1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               resultText.setText(resultText.getText() + "1");
           }
       });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultText.setText(resultText.getText() + "2");
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultText.setText(resultText.getText() + "3");
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultText.setText(resultText.getText() + "4");
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultText.setText(resultText.getText() + "5");
            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultText.setText(resultText.getText() + "6");
            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultText.setText(resultText.getText() + "7");
            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultText.setText(resultText.getText() + "8");
            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultText.setText(resultText.getText() + "9");
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (resultText.getText() == ""){
                    resultText.setText("");
                } else {
                    value1 = Double.parseDouble(resultText.getText().toString());
                    resultText.setText("");
                    condition = 1;
//
                }
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (resultText.getText() == ""){
                    resultText.setText("");
                } else {
                    value1 = Double.parseDouble(resultText.getText().toString());
                    resultText.setText("");
                    condition = 2;
//
                }
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (resultText.getText() == ""){
                    resultText.setText("");
                } else {
                    value1 = Double.parseDouble(resultText.getText().toString());
                    resultText.setText("");
                    condition = 3;
//
                }
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (resultText.getText() == ""){
                    resultText.setText("");
                } else {
                    value1 = Double.parseDouble(resultText.getText().toString());
                    resultText.setText("");
                    condition = 4;
//
                }
            }
        });

        equ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (condition) {
                    case 1 :  value2 = Double.parseDouble(resultText.getText().toString());
                        resultText.setText(String.valueOf(value1+value2));
                        break;
                    case 2 :
                        value2 = Double.parseDouble(resultText.getText().toString());
                        resultText.setText(String.valueOf(value1-value2));
                        break;
                    case 3:
                        value2 = Double.parseDouble(resultText.getText().toString());
                        resultText.setText(String.valueOf(value1*value2));
                        break;
                    case 4:
                        value2 = Double.parseDouble(resultText.getText().toString());
                        if(value2 == 0){
                            resultText.setText("Error");
                        }else {

                            resultText.setText(String.valueOf(value1/value2));
                        }
                        break;


                }

            }
        });


    }
}