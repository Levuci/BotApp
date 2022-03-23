package com.example.botapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText etPanjang,etLebar,etTinggi;
    public Button btnhitung;
    private TextView tvHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.volumebalock);

        etPanjang = findViewById(R.id.etPanjang);
        etLebar = findViewById(R.id.etLebar);
        etTinggi = findViewById(R.id.etTinggi);
        btnhitung = findViewById(R.id.btnHitung);
        tvHasil = findViewById(R.id.tvHasil);

      //  btnhitung.setOnClickListener(this);

    }

    public void clickHitung(View view) {
        String panjang = etPanjang.getText().toString().trim();
        String lebar = etLebar.getText().toString().trim();
        String tinggi = etTinggi.getText().toString().trim();

        boolean isiankosong = false;

        if (TextUtils.isEmpty(panjang)) {
            isiankosong = true;
            etPanjang.setError("isian panjang tidak boleh kosong");

        }

        if (TextUtils.isEmpty(lebar)) {
            isiankosong = true;
            etLebar.setError("isian lebar tidak boleh kosong");

        }

        if (TextUtils.isEmpty(tinggi)) {
            isiankosong = true;
            etTinggi.setError("isian tinggi tidak boleh kosong");

        }

        if (!isiankosong) {

            double volume = Double.valueOf(panjang) * Double.valueOf(lebar) * Double.valueOf(tinggi);
            tvHasil.setText(String.valueOf(volume));

        }

    }
}