package com.example.miclaseholaworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        getParametros();
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