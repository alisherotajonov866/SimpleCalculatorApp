package ru.startandroid.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText etNum1 ;
    private EditText etNum2 ;
    private Button btnPlus ;
    private Button btnMinus ;
    private Button btnKopaytiruv ;
    private Button btnBolish ;
    private Button btnDaraja;
    private Button btnMOD;
    private TextView tvAnswer ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNum1 = (EditText) findViewById(R.id.etNum1) ;
        etNum2 = (EditText) findViewById(R.id.etNum2) ;
        btnPlus = (Button) findViewById(R.id.btnPlus) ;
        btnMinus = (Button) findViewById(R.id.btnMinus) ;
        btnKopaytiruv = (Button) findViewById(R.id.btnKopaytiruv) ;
        btnBolish = (Button) findViewById(R.id.btnBolish) ;
        btnDaraja = (Button) findViewById(R.id.btnDaraja) ;
        btnMOD = (Button) findViewById(R.id.btnMod) ;
        tvAnswer = (TextView) findViewById(R.id.tvAnswer) ;


        btnPlus.setOnClickListener(oclBtn);
        btnMinus.setOnClickListener(oclBtn);
        btnKopaytiruv.setOnClickListener(oclBtn);
        btnBolish.setOnClickListener(oclBtn);
        btnDaraja.setOnClickListener(oclBtn);
        btnMOD.setOnClickListener(oclBtn);

    }
    View.OnClickListener oclBtn = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            double number1,number2,x ;
            number1 = Integer.parseInt(etNum1.getText().toString()) ;
            number2 = Integer.parseInt(etNum2.getText().toString()) ;
            switch (v.getId()){
                case R.id.btnPlus:
                    x = number1+number2 ;
                    tvAnswer.setText("Answer: "+String.valueOf(x));
                    break;
                case R.id.btnMinus:
                    x = number1-number2 ;
                    tvAnswer.setText("Answer: "+String.valueOf(x));
                    break;
                case R.id.btnKopaytiruv:
                    x = number1*number2 ;
                    tvAnswer.setText("Answer: "+String.valueOf(x));
                    break;
                case R.id.btnBolish:
                    x = number1/number2 ;
                    tvAnswer.setText("Answer: "+String.valueOf(x));
                    break;
                case R.id.btnDaraja:
                    x = Math.pow(number1,number2) ;
                    tvAnswer.setText("Answer: "+String.valueOf(x));
                    break;
                case R.id.btnMod:
                    x = number1%number2 ;
                    tvAnswer.setText("Answer: "+String.valueOf(x));
                    break;

            }
        }
    } ;


}