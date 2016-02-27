package com.example.deyvison.roteiro02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((Button)findViewById(R.id.botaoTraduzir)).setOnClickListener(new Traduzir("TRADUZIR",null));

    }

    private class Traduzir implements View.OnClickListener{
        private String action;
        private String category;

        Traduzir(String action,String category){
            this.action = action;
            this.category = category;
        }

        @Override
        public void onClick(View v) {
            EditText editText = ((EditText)findViewById(R.id.corEntrada));
            String valor = editText.getText().toString();
            if(!valor.equalsIgnoreCase("Azul") && !valor.equalsIgnoreCase("Vermelho") && !valor.equalsIgnoreCase("Amarelo")){
                View focus = null;
                editText.setError("Entrada inválida!");
                focus = editText;
                focus.requestFocus();
            }else{
                Intent i = new Intent(this.action);
                if(this.category != null)
                    i.addCategory(this.category);
                Bundle b = new Bundle();
                b.putString("cor", valor);
                i.putExtras(b);
                startActivity(i);
            }
        }
    }
}
