package com.example.encuestaursus;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class encuesta_body extends AppCompatActivity {

    public Button RecomendarFamiliaS = (Button) findViewById(R.id.btnRecomendarFamiliar_yes);
    public Button RecomendarFamiliaN = (Button) findViewById(R.id.btnRecomendarFamiliar_No);

    public int puntoRecomendacionS, puntoRecomendacionN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encuesta_body);


        RecomendarFamiliaN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                puntoRecomendacionN++;

                /*Intent myIntent = new Intent(getApplicationContext(), );

                startActivity(myIntent);*/

            }
        });

        RecomendarFamiliaS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                puntoRecomendacionS++;

                /*Intent myIntent = new Intent(getApplicationContext());

                startActivity(myIntent);*/
            }
        });







    }

}
