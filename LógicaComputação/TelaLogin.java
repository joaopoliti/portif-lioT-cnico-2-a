package com.example.apppoliti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText campo, senha ;
    ArrayList<Usuario> lista = new ArrayList<>();
    Usuario encontrado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        campo = findViewById(R.id.frase);
        senha = findViewById(R.id.senha);
        Usuario u1 = new Usuario ("badzera", "310", 1);
        Usuario u2 = new Usuario("Lulubilu<3", "tatu",2);
        Usuario u3 = new Usuario("Bequi", "hentai123",3);
        lista.add(u1);
        lista.add(u2);
        lista.add(u3);
    }
    public boolean verificaUsuario(String login, String senha){
        for(Usuario pessoa : lista){
            if(login.equals(pessoa.login) && senha.equals(pessoa.senha)){
                encontrado = pessoa;
                return true;
            }

        }
        return false;
    }
    public void clickDoBotao(View v) {
        String texto = campo.getText().toString();
        String pass = senha.getText().toString();
        if(verificaUsuario(texto,pass)){
            Toast.makeText(this, "Bem vindo, "+texto,Toast.LENGTH_LONG).show();
            mudaTela();

        }
        else{
            Toast.makeText(this, "login oh senha inválida!",Toast.LENGTH_LONG).show();
        }
    }

    public void mudaTela(){
        if (encontrado.perfil == 1){
            Intent i = new Intent(this, Tela2.class);
            startActivity(i);

        }
        else if(encontrado.perfil == 2){
            Intent i = new Intent(this, TelaAdm.class);
            TelaAdm.list = lista;
            startActivity(i);
        }
    }
    public void registro(View v){
        TelaAdm.list = lista;
        Intent i = new Intent(this, TelaAdm.class);
        startActivity(i);

    }
}
