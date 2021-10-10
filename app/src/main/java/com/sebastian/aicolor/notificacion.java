package com.sebastian.aicolor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class notificacion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notificacion);
        configureHome();
        configureCalendar();
        configureBack();
        configureSimple();
        configureInformation();
        configureAlert();
    }

    private void configureHome(){
        Button home2=(Button)findViewById(R.id.home);
        home2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                startActivity(new Intent(notificacion.this,MainActivity.class));
                //intent try catch

            }
        });


    }
    private void configureSimple(){
        Button basura=(Button)findViewById(R.id.basura);
        basura.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                startActivity(new Intent(notificacion.this,simple.class));
                //intent try catch

            }
        });


    }
    private void configureBack(){
        Button back=(Button)findViewById(R.id.button5);
        back.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                startActivity(new Intent(notificacion.this,MainActivity.class));
                //intent try catch

            }
        });


    }
    private void configureInformation(){
        Button information=(Button)findViewById(R.id.information);
        information.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                startActivity(new Intent(notificacion.this,simboloAEmergente.class));
                //intent try catch

            }
        });


    }private void configureAlert(){
        Button alert=(Button)findViewById(R.id.butt);
        alert.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                startActivity(new Intent(notificacion.this,simboloEmergente.class));
                //intent try catch

            }
        });


    }

    private void configureCalendar(){
        Button calendario=(Button)findViewById(R.id.button17);
        calendario.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                startActivity(new Intent(notificacion.this,calendar.class));
                //intent try catch

            }
        });


    }
}