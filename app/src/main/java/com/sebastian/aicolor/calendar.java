package com.sebastian.aicolor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class calendar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);
        configureHomec();
        configure3dias();
        configure7dias();
        configure15dias();
        configureBack();
    }
    private void configureHomec(){
        Button homec=(Button)findViewById(R.id.homec);
        homec.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                startActivity(new Intent(calendar.this,notificacion.class));
                //intent try catch

            }
        });
}

    private void configure3dias(){
        Button dias3=(Button)findViewById(R.id.dias_3);
        dias3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                startActivity(new Intent(calendar.this,notificacion.class));
                //intent try catch

            }
        });
    }
    private void configure7dias(){
        Button dias7=(Button)findViewById(R.id.dias_7);
        dias7.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                startActivity(new Intent(calendar.this,notificacion.class));
                //intent try catch

            }
        });
    }
    private void configure15dias(){
        Button dias15=(Button)findViewById(R.id.dias_15);
        dias15.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                startActivity(new Intent(calendar.this,notificacion.class));
                //intent try catch

            }
        });
    }

    private void configureBack(){
        Button button3=(Button)findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                startActivity(new Intent(calendar.this,notificacion.class));
                //intent try catch

            }
        });
    }





}