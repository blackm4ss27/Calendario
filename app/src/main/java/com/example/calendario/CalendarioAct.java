package com.example.calendario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CalendarioAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendario);
    }

    public void evento(View view) {
        Intent evento = new Intent(CalendarioAct.this,Evento.class);
        startActivity(evento);
    }

    public void salir(View view) {
        finish();
    }
}