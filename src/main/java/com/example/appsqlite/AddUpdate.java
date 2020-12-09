package com.example.appsqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import de.hdodenhof.circleimageview.CircleImageView;

public class AddUpdate extends AppCompatActivity {

    private FloatingActionButton fabSave;
    private CircleImageView civPhoto;
    private EditText etBrand, etModel, etSerialNumber, etImei, etCompany, etProperties, etPrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_update);

        fabSave = findViewById(R.id.fabSave);
        civPhoto = findViewById(R.id.civPhoto);
        etBrand = findViewById(R.id.etBrand);
        etModel = findViewById(R.id.etModel);
        etSerialNumber = findViewById(R.id.etSerialNumber);
        etImei = findViewById(R.id.etImei);
        etCompany = findViewById(R.id.etCompany);
        etProperties = findViewById(R.id.etProperties);
        etPrice = findViewById(R.id.etPrice);

        fabSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                insertData();
            }
        });
    }

    private void insertData() {

    }
}