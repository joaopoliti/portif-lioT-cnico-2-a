package com.example.appgeoespacial;

import androidx.appcompat.app.AppCompatActivity;

import android.app.assist.AssistStructure;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import com.example.appgeoespacial.R;
import com.example.appgeoespacial.TelaConta;

public class MainActivity extends AppCompatActivity {
   RadioButton At, Ab, Abv, Nf, Af, Vl, H;

   @Override
   protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);
       getSupportActionBar().hide();
       At = findViewById(R.id.At);
       Ab = findViewById(R.id.Ab);
       Abv = findViewById(R.id.Abv);
       Nf = findViewById(R.id.Nf);
       Af = findViewById(R.id.Af);
       Vl = findViewById(R.id.Vl);
       H = findViewById(R.id.H);

   }

   public void prosseguir(View pp) {
       Intent i = new Intent (this,Conta.class);
       AssistStructure.ViewNode rat;
       if(At.isChecked()){//formula da area base pela area total At = 2*Ab + N * f
           Conta.conta = 1;
           startActivity(i);
           //formula da area total At = 2
       }
       else if(Ab.isChecked()){//formula da area da base pelo volume Ab = At - n*F /2
           Conta.conta = 2;
           startActivity(i);
       }
       else if(Abv.isChecked()){ //Ab=v/h
           Conta.conta = 3;
           startActivity(i);
       }
       else if(Nf.isChecked()){//forula de numeros de bases F = (At - 2*Ab) / F
           Conta.conta = 4;
           startActivity(i);
       }
       else if(Af.isChecked()){//formula de areas de faces F = (At - 2*Ab) / N
           Conta.conta = 5;
           startActivity(i);
       }
       else if(Vl.isChecked()){ //formula de volume V = Ab*H
           Conta.conta = 6;
           startActivity(i);
       }
       else if(H.isChecked()){//formula da altura H = V/ab
           Conta.conta = 7;
           startActivity(i);
       }
       else {//nenhum foi selecionado
           Toast.makeText(this,"nenhuma opçao foi selecionada",Toast.LENGTH_LONG).show();

       }
   }

}



-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------

  
  
package com.example.appgeoespacial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Tela_conta extends AppCompatActivity {
   static int conta;
   EditText et1, et2, et3;
   TextView r;
   @Override
   protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_tela_conta);
       getSupportActionBar().hide();
       et1 = findViewById(R.id.et1);
       et2 = findViewById(R.id.et2);
       et3 = findViewById(R.id.et3);
       r = findViewById(R.id.r);
       atualizaTela();
   }
   public void atualizaTela() {
       if (conta == 1) {
           et1.setHint("Área da base");
           et2.setHint("Número de faces");
           et3.setHint("Área da face");
       }
       if (conta == 2) {
           et1.setHint("Área da base");
           et2.setHint("Número de faces");
           et3.setHint("Área da face");
       }
       if (conta == 3) {
           et1.setHint("Área da base");
           et2.setHint("Número de faces");
           et3.setHint("Área da face");
       }
       if (conta == 4) {
           et1.setHint("Área da total");
           et2.setHint("Área da base");
           et3.setHint("Área da face");
       }
       if (conta == 5) {
           et1.setHint("Área da total");
           et2.setHint("Área da base");
           et3.setHint("Número de faces");
       } else if (conta == 6) {
           et1.setHint("Digite a área da base");
           et2.setHint("Digite a altura");
           et3.setVisibility(View.INVISIBLE);
       }
       if (conta == 7) {
           et1.setHint("Área da base");
           et2.setHint("Volume");
           et3.setVisibility(View.INVISIBLE);
           ;
       }
   }
       public void calculo(View alberto){
           double a = Double.parseDouble(et1.getText().toString());
           double b = Double.parseDouble(et2.getText().toString());
           double c;
           switch (conta){
               case 1:
                   c = Double.parseDouble(et3.getText().toString());

                   double calc = 2 * a + b * c;
                   r.setText(calc+ "");

               case 2:
                   double calc =
           }
   }
}
