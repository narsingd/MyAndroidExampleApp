package com.example.ndyavani.exampleapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void loginFunction(View view){

        EditText nameEditText = (EditText)findViewById(R.id.nameEditText);
        EditText passwordEditText = (EditText)findViewById(R.id.passwordEditText);

        Log.i("info", "Butten Pressed");
        Log.i("Name", nameEditText.getText().toString());
        Log.i("Password", passwordEditText.getText().toString());
        Toast.makeText(this, "Hello " + nameEditText.getText().toString() + " !!" , Toast.LENGTH_SHORT).show();
    }
}
