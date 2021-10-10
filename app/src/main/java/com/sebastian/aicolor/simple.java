package com.sebastian.aicolor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class simple extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple);
        configureHome();
        configureCalendar();
        configureBack();
    }


    private void configureHome(){
        Button home3=(Button)findViewById(R.id.home3);
        home3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                startActivity(new Intent(simple.this,MainActivity.class));
                //intent try catch

            }
        });


    }
    private void configureBack(){
        Button back=(Button)findViewById(R.id.button10);
        back.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                startActivity(new Intent(simple.this,MainActivity.class));
                //intent try catch

            }
        });


    }
    private void configureCalendar(){
        Button calendario=(Button)findViewById(R.id.button2);
        calendario.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view){
                startActivity(new Intent(simple.this,calendar.class));
                //intent try catch

            }
        });


    }
}
