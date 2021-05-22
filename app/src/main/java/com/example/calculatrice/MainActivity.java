package com.example.calculatrice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.faendir.rhino_android.RhinoAndroidHelper;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,
            btnPlus,btnMinus,btnEqual,btnDot,btnBracket,btnCo,btnSn,btnDiv,btnMultp,btnClear;

    TextView tvInput,tvOutput;
    String process;
    boolean checkBracket=false;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0=findViewById(R.id.btn0);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);

        btnPlus=findViewById(R.id.btnPlus);
        btnMinus=findViewById(R.id.btnMinus);
        btnDiv=findViewById(R.id.btnDiv);
        btnMultp=findViewById(R.id.btnMultp);

        btnCo=findViewById(R.id.btnCo);
        btnSn=findViewById(R.id.btnSn);

        btnClear=findViewById(R.id.btnClear);
        btnDot=findViewById(R.id.btnDot);
        btnEqual=findViewById(R.id.btnEqual);
        btnBracket=findViewById(R.id.btnBracket);

        tvInput=findViewById(R.id.tvInput);
        tvOutput=findViewById(R.id.tvOutput);

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                tvInput.setText("");
                tvOutput.setText("");
            }
        });



        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=tvInput.getText().toString();
                tvInput.setText(process+"0");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=tvInput.getText().toString();
                tvInput.setText(process+"1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=tvInput.getText().toString();
                tvInput.setText(process+"2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=tvInput.getText().toString();
                tvInput.setText(process+"3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=tvInput.getText().toString();
                tvInput.setText(process+"4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=tvInput.getText().toString();
                tvInput.setText(process+"5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=tvInput.getText().toString();
                tvInput.setText(process+"6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=tvInput.getText().toString();
                tvInput.setText(process+"7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=tvInput.getText().toString();
                tvInput.setText(process+"8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=tvInput.getText().toString();
                tvInput.setText(process+"9");
            }
        });



        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=tvInput.getText().toString();
                tvInput.setText(process+"+");
            }
        });

        btnMultp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=tvInput.getText().toString();
                tvInput.setText(process+"x");
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=tvInput.getText().toString();
                tvInput.setText(process+"÷");
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=tvInput.getText().toString();
                tvInput.setText(process+"-");
            }
        });





        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=tvInput.getText().toString();
                tvInput.setText(process+".");
            }
        });

        btnCo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=tvInput.getText().toString();
                tvInput.setText(process+"COS");
            }
        });

        btnSn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                process=tvInput.getText().toString();
                tvInput.setText(process+"SIN");
            }
        });

        btnBracket.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(checkBracket){
                    process=tvInput.getText().toString();
                    tvInput.setText(process+")");
                    checkBracket=false;
                }else{
                    process=tvInput.getText().toString();
                    tvInput.setText(process+"(");
                    checkBracket=true;
                }
                
                

            }
        });


        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });






    }
}