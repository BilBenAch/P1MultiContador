package com.example.p1multicontador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int contadorGeneral;
    int cont1;
    int cont2;
    int cont3;
    int cont4;

    TextView contadorAll;
    Button resetAll;

    TextView contador1;
    Button augmentar1;
    Button reset1;

    TextView contador2;
    Button augmentar2;
    Button reset2;

    TextView contador3;
    Button augmentar3;
    Button reset3;

    TextView contador4;
    Button augmentar4;
    Button reset4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contadorAll = findViewById(R.id.contadorAll);
        resetAll = findViewById(R.id.resetAll);

        contador1 = findViewById(R.id.contador1);
        augmentar1 = findViewById(R.id.augmentar1);
        reset1 = findViewById(R.id.reset1);

        contador2 = findViewById(R.id.contador2);
        augmentar2 = findViewById(R.id.augmentar2);
        reset2 = findViewById(R.id.reset2);

        contador3 = findViewById(R.id.contador3);
        augmentar3 = findViewById(R.id.augmentar3);
        reset3 = findViewById(R.id.reset3);

        contador4 = findViewById(R.id.contador4);
        augmentar4 = findViewById(R.id.augmentar4);
        reset4 = findViewById(R.id.reset4);


        resetAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contadorGeneral = 0;
                cont1 = 0;
                cont2 = 0;
                cont3 = 0;
                cont4 = 0;
                contadorAll.setText(""+ contadorGeneral + " ");
                contador1.setText(""+ cont1 + " ");
                contador2.setText(""+ cont2 + " ");
                contador3.setText(""+ cont3 + " ");
                contador4.setText(""+ cont4 + " ");
            }
        });


        augmentar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cont1++;
                contadorGeneral++;
                contador1.setText(""+ cont1 + " ");
                contadorAll.setText(""+ contadorGeneral + " ");
            }
        });
        reset1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cont1 = 0;
                contador1.setText(""+ cont1 + " ");
            }
        });
        reset2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cont2 = 0;
                contador2.setText(""+ cont2 + " ");
            }
        });
        reset3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cont3 = 0;
                contador3.setText(""+ cont3 + " ");
            }
        });

        reset4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cont4 = 0;
                contador4.setText(""+ cont4 + " ");
            }
        });

        augmentar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cont2++;
                contadorGeneral++;
                contador2.setText(""+ cont2 + " ");
                contadorAll.setText(""+ contadorGeneral + " ");
            }
        });

        augmentar3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cont3++;
                contadorGeneral++;
                contador3.setText(""+ cont3 + " ");
                contadorAll.setText(""+ contadorGeneral + " ");
            }
        });

        augmentar4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cont4++;
                contadorGeneral++;
                contador4.setText(""+ cont4 + " ");
                contadorAll.setText(""+ contadorGeneral + " ");
            }
        });


    }
}