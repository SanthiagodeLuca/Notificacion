package com.sebastian.aicolor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        configureBackButton();
        configureBack();
    }


    private void configureBackButton(){
        Button va_notificacion2=(Button)findViewById(R.id.va_notificacion);
        va_notificacion2.setOnClickListener(new View.OnClickListener(){

                @Override
                public void onClick(View view){
                startActivity(new Intent(MainActivity.this,notificacion.class));
                //intent try catch

        }
    });


    }
    private void configureBack(){
        Button va_notificacion2=(Button)findViewById(R.id.va_notificacion6);
        va_notificacion2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                startActivity(new Intent(MainActivity.this,notificacion.class));
                //intent try catch

            }
        });


    }
}