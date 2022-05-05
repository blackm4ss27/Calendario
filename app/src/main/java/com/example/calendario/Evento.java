package com.example.calendario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;

public class Evento extends AppCompatActivity {

    DatePicker bFecha;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evento);
        bFecha = (DatePicker) findViewById(R.id.dpFecha);
    }

    public void fecha(View view) {
    }
}