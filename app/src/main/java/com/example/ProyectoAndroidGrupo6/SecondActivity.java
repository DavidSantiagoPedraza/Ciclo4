package com.example.ProyectoAndroidGrupo6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        //Activar el soporte para la ActionBar: Es decir hacer que muestre el boton
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getParametros();
    }

    //Destruir la Aplicación: Nos dice que hacer cuando se presiona el boton
    public void onBackPressed() {
        finish();
    }

    //Aberiguar cual boton fue el que se presiono
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int id = menuItem.getItemId();

        if(id == android.R.id.home) {
            onBackPressed();
            return true;
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public void getParametros(){
        Bundle extras= getIntent().getExtras();
        String mng = extras.getString("mensaje");
        int year = extras.getInt("year");
        Toast.makeText(this, mng +" "+ year, Toast.LENGTH_SHORT).show();
    }

    public void goToActivityMain(View view) {
        Intent newIntent = new Intent(this, MainActivity.class);
        newIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(newIntent);
    }
}