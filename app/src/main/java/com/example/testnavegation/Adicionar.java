package com.example.testnavegation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Adicionar extends AppCompatActivity {

    Spinner spData;
    Button btnProximo;

    TextView txtDuracao;

    //sppiner
    String [] datasConclusao = new String[]{"Dentro de um ano." , "Até o final deste ano.", "Dentro de nove meses.",
    "Dentro de seis meses.", "Dentro de três meses.", "Em uma data específica."};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adicionar);

        txtDuracao = findViewById(R.id.txtDuracao);

        btnProximo = findViewById(R.id.btnProximo);


        spData = findViewById(R.id.spData);

        //pegar data
        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");
        String data = formatoData.format(new Date());
        //pegar data






        preencherData();

        btnProximo.setOnClickListener((v) -> {
            String dataSpineer = spData.getSelectedItem().toString();

            //manipulação da seleção do Spinner
            if (spData.getSelectedItem().toString().equals("Dentro de um ano.")) {
                txtDuracao.setText("1 ano " + data);
            }
            if (spData.getSelectedItem().toString().equals("Até o final deste ano.")){
                txtDuracao.setText("final do ano " + data);
            }
            if (spData.getSelectedItem().toString().equals("Dentro de nove meses.")){
                txtDuracao.setText("9 meses " + data);
            }
            if (spData.getSelectedItem().toString().equals("Dentro de seis meses.")){
                txtDuracao.setText("6 meses " + data);
            }
            if (spData.getSelectedItem().toString().equals("Dentro de três meses.")){
                txtDuracao.setText("3 meses " + data);
            }
            if (spData.getSelectedItem().toString().equals("Em uma data específica.")){
                txtDuracao.setText("Em Produção");
            }
            //manipulação da seleção do Spinner

            //Teste
            //txtDuracao.setText(dataSpineer +  data);
            //Teste
        });

    }

    private void preencherData() {
//spineer
        spData.setAdapter(new ArrayAdapter<String>(getApplicationContext(),
                androidx.appcompat.R.layout.support_simple_spinner_dropdown_item,
                datasConclusao
                ));
    }
}