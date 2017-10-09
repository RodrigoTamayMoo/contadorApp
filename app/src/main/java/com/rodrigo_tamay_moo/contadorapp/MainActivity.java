package com.rodrigo_tamay_moo.contadorapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    private Button mBotonContar, mBotonReiniciar;
    private EditText mTextoContar;
    int mcontar = 0;

    @Override
    protected void onCreate (Bundle savedInstance) {
        super.onCreate(savedInstance);
        setContentView(R.layout.activity_main);

        mBotonContar = (Button)findViewById(R.id.buton_contar);
        mBotonReiniciar = (Button)findViewById(R.id.buton_reiniciar);
        mTextoContar = (EditText) findViewById(R.id.incrementar_valor);

        mBotonContar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mcontar++;
                mTextoContar.setText(mcontar+"");

            }
        });
    }





}
