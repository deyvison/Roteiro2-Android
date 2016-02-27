package com.example.deyvison.roteiro02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

public class TradutorInglesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tradutor_ingles);

        TextView textView = (TextView) findViewById(R.id.respostaInglesView);

        Intent i = getIntent();

        if(i != null){
            Bundle b = i.getExtras();

            if(b != null){

                String entrada = b.getString("cor");

                if(entrada.equalsIgnoreCase("AZUL")){
                    textView.setText("Azul em inglês é Blue!");
                }else if(entrada.equalsIgnoreCase("AMARELO")){
                    textView.setText("Amarelo em inglês é Yellow!");
                }else {
                    textView.setText("Vermelho em inglês é Red!");
                }


            }
        }
    }
}
