package com.sebastian.aicolor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class simboloEmergente extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simbolo_emergente);
        configureAceptar();
        configureCancelar();
    }



    private void configureCancelar(){
        Button cancelar=(Button)findViewById(R.id.button13);
        cancelar.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                startActivity(new Intent(simboloEmergente.this,notificacion.class));
                //intent try catch

            }
        });
    }

    private void configureAceptar(){
        Button aceptar=(Button)findViewById(R.id.button7);
        aceptar.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                startActivity(new Intent(simboloEmergente.this,notificacion.class));
                //intent try catch

            }
        });
    }
}