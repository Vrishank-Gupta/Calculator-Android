package com.example.vrishankgupta.calculator;

import java.lang.*;
import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.text.*;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.util.Log;

import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button one, two, three, four,fact, five, six, seven, eight, nine, zero, dot, add, subtract, multiply, divide, clear, equal, sin, cos, tan, sec, cosec, cot, ln, log, recip;
    public static final String TAG = "CHECK!";
    TextView et1, powerButton, squareButton, exp;
    TextView tv1;

    double op1, op2;



    boolean addition,factorial, subtraction, division, multiplication, squareOperation, sineOperation, cosOperation, tanOperation, secOperation, cosecOperation, cotOperation, lnOperation, logOperation, recipOperation, expOperation, powerOperation;

    public int facto(int a)
    {
        if (a==0 || a==1)
            return 1;

        return a*facto(a-1);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        zero = findViewById(R.id.zeroButton);
        one = findViewById(R.id.oneButton);
        two = findViewById(R.id.twoButton);
        three = findViewById(R.id.threeButton);
        four = findViewById(R.id.fourButton);
        five = findViewById(R.id.fiveButton);
        six = findViewById(R.id.sixButton);
        seven = findViewById(R.id.sevenButton);
        eight = findViewById(R.id.eightButton);
        nine = findViewById(R.id.nineButton);
        dot = findViewById(R.id.dotButton);
        add = findViewById(R.id.addButton);
        subtract = findViewById(R.id.subButton);
        multiply = findViewById(R.id.multButton);
        divide = findViewById(R.id.divide);
        clear = findViewById(R.id.cancelButton);
        equal = findViewById(R.id.equal);
        et1 = findViewById(R.id.editText);
        tv1 = findViewById(R.id.ope1);

        sin = findViewById(R.id.sin);
        cos = findViewById(R.id.cos);
        tan = findViewById(R.id.tan);
        sec = findViewById(R.id.sec);
        cosec = findViewById(R.id.cosec);
        cot = findViewById(R.id.cot);
        ln = findViewById(R.id.ln);
        log = findViewById(R.id.log);
        recip = findViewById(R.id.recip);
        exp = findViewById(R.id.exp);
        squareButton = findViewById(R.id.square);
        powerButton = findViewById(R.id.power);
        fact = findViewById(R.id.fact);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
            powerButton.setText(Html.fromHtml("x<sup>y</sup>", Html.FROM_HTML_MODE_COMPACT));

            squareButton.setText(Html.fromHtml("x<sup>2</sup>", Html.FROM_HTML_MODE_COMPACT));

            exp.setText(Html.fromHtml("e<sup>x</sup>", Html.FROM_HTML_MODE_COMPACT));
        }
        else
        {
            powerButton.setText(Html.fromHtml("x<sup>y</sup>"));

            squareButton.setText(Html.fromHtml("x<sup>2</sup>"));
            exp.setText(Html.fromHtml("e<sup>x</sup>"));

        }


        zero.setOnClickListener(new View.OnClickListener() {
            //@SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                et1.setText(et1.getText() + "0");
                tv1.setText(tv1.getText() + "0");
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(et1.getText() + "1");
                tv1.setText(tv1.getText() + "1");
            }
        });


        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(et1.getText() + "2");
                tv1.setText(tv1.getText() + "2");
            }
        });


        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(et1.getText() + "3");
                tv1.setText(tv1.getText() + "3");
            }
        });


        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(et1.getText() + "4");
                tv1.setText(tv1.getText() + "4");
            }
        });


        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(et1.getText() + "5");
                tv1.setText(tv1.getText() + "5");
            }
        });


        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(et1.getText() + "6");
                tv1.setText(tv1.getText() + "6");
            }
        });


        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(et1.getText() + "7");
                tv1.setText(tv1.getText() + "7");
            }
        });


        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(et1.getText() + "8");
                tv1.setText(tv1.getText() + "8");
            }
        });


        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText(et1.getText() + "9");
                tv1.setText(tv1.getText() + "9");
            }
        });


        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if(et1.getText().toString().contains("."))
                {

                }
                if(et1.getText().toString().equals(""))
                {
                    et1.setText("0.");
                    tv1.setText(tv1.getText() + "0.");
                }
                else {
                    et1.setText(et1.getText() + ".");
                    tv1.setText(tv1.getText() + ".");
                }
            }
        });


        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText("");
                tv1.setText("");
            }
        });


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et1 == null || et1.getText() == "") {
                    et1.setText("");

                    Toast.makeText(getApplicationContext(), "No operand",
                            Toast.LENGTH_LONG).show();
                } else {
                    op1 = Double.parseDouble(et1.getText() + "");
                    addition = true;
                    et1.setText(null);
                    tv1.setText(tv1.getText() + "+");
                }
            }
        });


        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et1 == null || et1.getText() == "") {
                    et1.setText("");

                    Toast.makeText(getApplicationContext(), "No operand",
                            Toast.LENGTH_LONG).show();
                } else {
                    op1 = Double.parseDouble(et1.getText() + "");
                    subtraction = true;
                    et1.setText(null);
                    tv1.setText(tv1.getText() + "-");
                }
            }
        });


        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et1 == null || et1.getText() == "") {
                    et1.setText("");

                    Toast.makeText(getApplicationContext(), "No operand",
                            Toast.LENGTH_LONG).show();
                } else {
                    op1 = Double.parseDouble(et1.getText() + "");
                    multiplication = true;
                    et1.setText(null);
                    tv1.setText(tv1.getText() + "X");
                }
            }
        });


        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et1 == null || et1.getText() == "") {
                    et1.setText("");

                    Toast.makeText(getApplicationContext(), "No operand",
                            Toast.LENGTH_LONG).show();
                    tv1.setText("");
                } else {
                    op1 = Double.parseDouble(et1.getText() + "");
                    division = true;
                    et1.setText(null);
                    tv1.setText(tv1.getText() + "/");
                }
            }
        });


        squareButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et1 == null || et1.getText() == "") {
                    et1.setText("");

                    Toast.makeText(getApplicationContext(), "No operand",
                            Toast.LENGTH_LONG).show();
                } else {
                    op1 = Double.parseDouble(et1.getText() + "");
                    squareOperation = true;
                    et1.setText(op1 + "^2");
                    tv1.setText(tv1.getText() + "^2");

                }
            }
        });
        fact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et1 == null || et1.getText() == "") {
                    et1.setText("");

                    Toast.makeText(getApplicationContext(), "No operand",
                            Toast.LENGTH_LONG).show();
                }
                else
                {
                    op1 = Double.parseDouble(et1.getText() + "");
                    factorial = true;
                    et1.setText(op1 + "!");
                    tv1.setText(tv1.getText() + "!");
                }
            }
        });


        sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et1 == null || et1.getText() == "") {
                    et1.setText("");

                    Toast.makeText(getApplicationContext(), "No operand",
                            Toast.LENGTH_LONG).show();
                } else {
                    op1 = Double.parseDouble(et1.getText() + "");
                    sineOperation = true;
                    et1.setText("sin (" + op1 + ")");
                    tv1.setText("sin(" + op1 + ")");

                }
            }
        });


        cos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et1 == null || et1.getText() == "") {
                    et1.setText("");

                    Toast.makeText(getApplicationContext(), "No operand",
                            Toast.LENGTH_LONG).show();
                } else {
                    op1 = Double.parseDouble(et1.getText() + "");
                    cosOperation = true;
                    et1.setText("cos (" + op1 + ")");
                    tv1.setText("cos(" + op1 + ")");

                }
            }
        });


        sec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et1 == null || et1.getText() == "") {
                    et1.setText("");

                    Toast.makeText(getApplicationContext(), "No operand",
                            Toast.LENGTH_LONG).show();
                } else {
                    op1 = Double.parseDouble(et1.getText() + "");
                    secOperation = true;
                    et1.setText("sec (" + op1 + ")");
                    tv1.setText("sec(" + op1 + ")");

                }
            }
        });


        cosec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et1 == null || et1.getText() == "") {
                    et1.setText("");

                    Toast.makeText(getApplicationContext(), "No operand",
                            Toast.LENGTH_LONG).show();
                } else {
                    op1 = Double.parseDouble(et1.getText() + "");
                    cosecOperation = true;
                    et1.setText("cosec (" + op1 + ")");
                    tv1.setText("cosec(" + op1 + ")");

                }
            }
        });


        cot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et1 == null || et1.getText() == "") {
                    et1.setText("");

                    Toast.makeText(getApplicationContext(), "No operand",
                            Toast.LENGTH_LONG).show();
                } else {
                    op1 = Double.parseDouble(et1.getText() + "");
                    cotOperation = true;
                    et1.setText("cot (" + op1 + ")");
                    tv1.setText("cot(" + op1 + ")");

                }
            }
        });

        tan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et1 == null || et1.getText() == "") {
                    et1.setText("");

                    Toast.makeText(getApplicationContext(), "No operand",
                            Toast.LENGTH_LONG).show();
                } else {
                    op1 = Double.parseDouble(et1.getText() + "");
                    tanOperation = true;
                    et1.setText("tan (" + op1 + ")");
                    tv1.setText("tan(" + op1 + ")");

                }
            }
        });


        ln.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et1 == null || et1.getText() == "") {
                    et1.setText("");

                    Toast.makeText(getApplicationContext(), "No operand",
                            Toast.LENGTH_LONG).show();
                } else {
                    op1 = Double.parseDouble(et1.getText() + "");
                    lnOperation = true;
                    et1.setText("ln (" + op1 + ")");
                    tv1.setText("ln(" + op1 + ")");

                }
            }
        });


        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et1 == null || et1.getText() == "") {
                    et1.setText("");

                    Toast.makeText(getApplicationContext(), "No operand",
                            Toast.LENGTH_LONG).show();
                } else {
                    op1 = Double.parseDouble(et1.getText() + "");
                    logOperation = true;
                    et1.setText("log (" + op1 + ")");
                    tv1.setText("log(" + op1 + ")");

                }
            }
        });


        recip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et1 == null || et1.getText() == "") {
                    et1.setText("");

                    Toast.makeText(getApplicationContext(), "No operand",
                            Toast.LENGTH_LONG).show();
                } else {
                    op1 = Double.parseDouble(et1.getText() + "");
                    recipOperation = true;
                    et1.setText("1/(" + op1 + ")");
                    tv1.setText("1/(" + op1 + ")");

                }
            }
        });

        exp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et1 == null || et1.getText() == "") {
                    et1.setText("");

                    Toast.makeText(getApplicationContext(), "No operand",
                            Toast.LENGTH_LONG).show();
                } else {
                    op1 = Double.parseDouble(et1.getText() + "");
                    expOperation = true;
                    et1.setText("e^" + op1);
                    tv1.setText("e^(" + op1 + ")");

                }
            }
        });


        powerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et1 == null || et1.getText() == "") {
                    et1.setText("");

                    Toast.makeText(getApplicationContext(), "No operand",
                            Toast.LENGTH_LONG).show();
                } else {
                    op1 = Double.parseDouble(et1.getText() + "");
                    powerOperation = true;
                    et1.setText(null);
                    tv1.setText(op1 + "^");

                }
            }
        });


        equal.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if (et1 == null || et1.getText() == "") {
                    et1.setText("");

                    Toast.makeText(getApplicationContext(), "No operation",
                            Toast.LENGTH_LONG).show();
                }

                if (squareOperation) {
                    et1.setText(null);
                    et1.setText(op1 * op1 + "");
                    squareOperation = false;
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                        tv1.setText(Html.fromHtml(op1 + "<sup>2</sup>", Html.FROM_HTML_MODE_COMPACT));


                    } else

                    {
                        tv1.setText(Html.fromHtml(op1 + "<sup>2</sup>"));

                    }

                }

                if (powerOperation) {
                    op2 = Double.parseDouble(et1.getText() + "");
                    et1.setText(Math.pow(op1, op2) + "");
                    powerOperation = false;
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                        tv1.setText(Html.fromHtml(op1 + "<sup>" + op2 + "</sup>", Html.FROM_HTML_MODE_COMPACT));


                    } else

                    {
                        tv1.setText(Html.fromHtml(op1 + "<sup>" + op2 + "</sup>"));

                    }

                }

                if (expOperation) {
                    et1.setText(Math.exp(op1) + "");
                    expOperation = false;
                    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.N) {
                        tv1.setText(Html.fromHtml("e<sup>" + op1 + "</sup>", Html.FROM_HTML_MODE_COMPACT));


                    } else

                    {
                        tv1.setText(Html.fromHtml("e<sup>" + op1 + "</sup>"));

                    }

                }

                if (recipOperation) {
                    et1.setText(1 / op1 + "");
                    recipOperation = false;

                    tv1.setText("1/" + op1);

                }

                if (lnOperation) {
                    et1.setText(Math.log(op1) + "");
                    lnOperation = false;
                    tv1.setText("ln(" + op1 + ")");
                }

                if (logOperation) {
                    et1.setText(Math.log10(op1) + "");
                    logOperation = false;
                    tv1.setText("log(" + op1 + ")");
                }

                if (sineOperation) {
                    sineOperation = false;
                    double i = Math.toRadians(op1);

                    et1.setText(Math.sin(i) + "");
                    tv1.setText("sin(" + op1 + ")");

                }

                if (cosOperation) {
                    cosOperation = false;
                    double i = Math.toRadians(op1);

                    et1.setText(Math.cos(i) + "");
                    tv1.setText("cos(" + op1 + ")");
                }

                if (tanOperation) {
                    tanOperation = false;
                    double i = Math.toRadians(op1);
                    et1.setText(Math.tan(i) + "");
                    tv1.setText("tan(" + op1 + ")");

                }

                if (secOperation) {
                    secOperation = false;
                    double i = Math.toRadians(op1);

                    et1.setText((1 / Math.cos(i)) + "");
                    tv1.setText("sec(" + op1 + ")");
                }


                if (cosecOperation) {
                    cosecOperation = false;
                    double i = Math.toRadians(op1);

                    et1.setText((1 / Math.sin(i)) + "");
                    tv1.setText("cosec(" + op1 + ")");
                }


                if (cotOperation) {
                    cotOperation = false;
                    double i = Math.toRadians(op1);

                    et1.setText((1 / Math.tan(i)) + "");
                    tv1.setText("cot(" + op1 + ")");
                }


                if (addition) {
                    op2 = Double.parseDouble(et1.getText() + "");
                    et1.setText(op1 + op2 + "");
                    addition = false;
                    tv1.setText(op1 + " + " + op2);
                }


                if (subtraction) {
                    op2 = Double.parseDouble(et1.getText() + "");
                    et1.setText(op1 - op2 + "");
                    subtraction = false;
                    tv1.setText(op1 + " - " + op2);
                }

                if (multiplication) {
                    op2 = Double.parseDouble(et1.getText() + "");
                    et1.setText(op1 * op2 + "");
                    multiplication = false;
                    tv1.setText(op1 + " X " + op2);
                }


                if (division) {
                    op2 = Double.parseDouble(et1.getText() + "");
                    division = false;
                    tv1.setText(op1 + " / " + op2);
                    if (op2 != 0) {
                        et1.setText(op1 / op2 + "");

                    } else {
                        et1.setText("Infinity");
                        Toast.makeText(getApplicationContext(), "Can't divide by zero",
                                Toast.LENGTH_LONG).show();

                    }
                }

                if(factorial)
                {
                    int a = (int)op1;
                    int i = facto(a);
                    factorial = false;
                    et1.setText(String.valueOf(i));
                    tv1.setText(a + "!");
                }

               
            }
        });

        Log.d(TAG, "onStart");

    }
}