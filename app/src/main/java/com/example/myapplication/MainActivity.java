package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editTextNumber1;
    private EditText editTextNumber2;
    private EditText editTextNumber3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextNumber1 = findViewById(R.id.editTextText);
        editTextNumber2 = findViewById(R.id.editTextText2);
        editTextNumber3 = findViewById(R.id.editTextText3);
    }

    public void somar(View view){
        int x = Integer.parseInt(editTextNumber1.getText().toString());
        int y = Integer.parseInt(editTextNumber2.getText().toString());
        int soma = x + y;
        editTextNumber3.setText(Integer.toString(soma));
    }

    public void abrirJanela(){
        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);

        int x = Integer.parseInt(editTextNumber1.getText().toString());
        int y = Integer.parseInt(editTextNumber2.getText().toString());
        int soma = x + y;
        String msg = Integer.toString(soma);

        intent.putExtra("soma",msg);
        startActivity(intent);
    }

}