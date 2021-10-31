package com.example.ProyectoAndroidGrupo6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Methodo onCreated", Toast.LENGTH_LONG).show();
        Log.i("Esto es una prueba", "Error");

    }

    public void goToActivitySecond(View view) {
        Intent newIntent = new Intent(this, SecondActivity.class);
        newIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP); //Borra todas las instancias y deja la ultima que se dejo
        newIntent.putExtra("mensaje", "Hola, Buenos dias Tripulante" );
        newIntent.putExtra("year", 2021);
        startActivity(newIntent);
    }

    protected void onStart() {
        super.onStart();
        Toast.makeText(this, "Methodo onStart", Toast.LENGTH_LONG).show();

    }

    protected void onResume() {
        super.onResume();
        Toast.makeText(this, "Methodo onResume", Toast.LENGTH_LONG).show();

    }

    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "Methodo onPause", Toast.LENGTH_LONG).show();

    }

    protected void onStop() {
        super.onStop();
        Toast.makeText(this, "Methodo onStop", Toast.LENGTH_LONG).show();

    }

    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this, "Methodo onRestart", Toast.LENGTH_LONG).show();

    }

    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this, "Methodo onDestroy", Toast.LENGTH_LONG).show();

    }
}