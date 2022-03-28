package com.example.membuatlist;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityLihatData extends AppCompatActivity {
    TextView tvnama, tvnomor;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihatdata);

        tvnama = findViewById(R.id.tvNamaKontak);
        tvnomor = findViewById(R.id.tvNomorTelepon);

        Bundle bundle = getIntent().getExtras();
        String nama = bundle.getString("a");

        switch(nama)
        {
            case "Udin":
                tvnama.setText("Udin jamaludin");
                tvnomor.setText("081234567823");
                break;
            case "Siti":
                tvnama.setText("Siti Maimunah");
                tvnomor.setText("081324345665");
                break;
            case "Budi":
                tvnama.setText("Budi Budiman");
                tvnomor.setText("082134566543");
                break;
            case "Ani":
                tvnama.setText("Ani Ramadani");
                tvnomor.setText("081923435676");
                break;
            case "Jamal":
                tvnama.setText("Jamaludin");
                tvnomor.setText("085237648576");
                break;
        }
    }

}
