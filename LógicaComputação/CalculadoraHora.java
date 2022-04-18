package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText Hi, Hf, Mi, Mf;
    TextView RH, RM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        Hi = findViewById(R.id.Hi);
        Hf = findViewById(R.id.Mi);
        Mi = findViewById(R.id.Hf);
        Mf = findViewById(R.id.Mf);
        RH = findViewById(R.id.RH);
        RM = findViewById(R.id.RM);
    }
    public void soma(View patolino){
        int hi = Integer.parseInt(Hi.getText().toString());
        int hf = Integer.parseInt(Hf.getText().toString());
        int mi = Integer.parseInt(Mi.getText().toString());
        int mf = Integer.parseInt(Mf.getText().toString());

        int resm = mi + mf;
        int resh = hi + hf;

        while (resm > 59){
            resh ++;
            resm = resm - 60;
        }

        RH.setText(resh +" Horas");
        RM.setText(resm +" Minutos");

        }

    public void subtrai(View potato){
        int hi = Integer.parseInt(Hi.getText().toString());
        int hf = Integer.parseInt(Hf.getText().toString());
        int mi = Integer.parseInt(Mi.getText().toString());
        int mf = Integer.parseInt(Mf.getText().toString());

        int resm = 0, resh;
        while(mi > 59){
            hi ++;
            mi = mi - 60;
        }
        while(mf > 59){
            hf ++;
            mf = mf - 60;
        }


        if (hf >= hi) {
            resh = hf - hi;
            if(mf >= mi){
                resm = mf - mi;
            }
            else{
                resm = mi - mf;
            }
        }
        else{
            resh = hi - hf;
            resm = mi - mf;
        }


        while (resm > 59){
            resh ++;
            resm = resm - 60;
        }

        RH.setText(resh +" Horas");
        RM.setText(resm +" Minutos");
    }
}
