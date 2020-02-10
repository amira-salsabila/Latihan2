package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private Button btnSin, btnCos, btnCosec, btnSec, btnLog;
    private TextView tvHasil;
    private EditText etInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSin = findViewById(R.id.btnSin);
        btnCos = findViewById(R.id.btnCos);
        btnCosec = findViewById(R.id.btnCosec);
        btnSec = findViewById(R.id.btnSecan);
        btnLog = findViewById(R.id.btnLog);
        etInput = findViewById(R.id.input);
        tvHasil = findViewById(R.id.tv_hasil);

        btnSin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sInput = etInput.getText().toString();

                    double input = Double.parseDouble(sInput);

                    double hasil = Math.sin(input);

                    String sHasil = String.valueOf(hasil);
                    tvHasil.setText(sHasil);
                } catch (NumberFormatException nfe) {
                    Toast.makeText(getApplicationContext(), "Please Input the Number", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnCos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sInput = etInput.getText().toString();

                    double input = Double.parseDouble(sInput);

                    double hasil = Math.cos(input);

                    String sHasil = String.valueOf(hasil);
                    tvHasil.setText(sHasil);
                } catch (NumberFormatException nfe) {
                    Toast.makeText(getApplicationContext(), "Please Input the Number", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnCosec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sInput = etInput.getText().toString();

                    double input = Double.parseDouble(sInput);

                    double hasil = 1 / Math.sin(input);

                    String sHasil = String.valueOf(hasil);
                    tvHasil.setText(sHasil);
                } catch (NumberFormatException nfe) {
                    Toast.makeText(getApplicationContext(), "Please Input the Number", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnSec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sInput = etInput.getText().toString();

                    double input = Double.parseDouble(sInput);

                    double hasil = 1 / Math.cos(input);

                    String sHasil = String.valueOf(hasil);
                    tvHasil.setText(sHasil);
                } catch (NumberFormatException nfe) {
                    Toast.makeText(getApplicationContext(), "Please Input the Number", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String sInput = etInput.getText().toString();

                    double input = Double.parseDouble(sInput);

                    double hasil = Math.log10(input);

                    String sHasil = String.valueOf(hasil);
                    tvHasil.setText(sHasil);
                } catch (NumberFormatException nfe) {
                    Toast.makeText(getApplicationContext(), "Please Input the Number", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
