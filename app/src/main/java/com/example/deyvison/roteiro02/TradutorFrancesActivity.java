package com.example.deyvison.roteiro02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TradutorFrancesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tradutor_frances);

        TextView textView = (TextView)findViewById(R.id.repostaFrancesView);

        Intent i = getIntent();

        if(i != null){
            Bundle b = i.getExtras();

            if(b != null){
                String entrada = b.getString("cor");

                if(entrada.equalsIgnoreCase("AZUL")){
                    textView.setText("Azul em francês é bleu");
                }else if(entrada.equalsIgnoreCase("AMARELO")){
                    textView.setText("Amarelo em francês é jaune!");
                }else{
                    textView.setText("Vermelho em francês é rouge!");
                }
            }
        }

        ((Button)findViewById(R.id.botaoVoltarFrances)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
