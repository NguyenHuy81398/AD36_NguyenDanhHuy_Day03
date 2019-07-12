package com.example.ad36_nguyendanhhuy_day03;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;

public class AddActivity extends AppCompatActivity {
    Contact contactAdd;
    Spinner spinner;
    Button btnAddNew;
    EditText etName, etNumber;
    Boolean spIcon;
    ArrayList<Boolean> img;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        setTitle("THÊM MỚI");

        spinner = findViewById(R.id.spIcon);
        btnAddNew = findViewById(R.id.btnAddNew);
        etName = findViewById(R.id.etName);
        etNumber = findViewById(R.id.etNumber);

        img = new ArrayList<>();
        img.add(true);
        img.add(false);

        ArrayAdapter<Boolean> arrayAdapter = new ArrayAdapter<>(getBaseContext(),android.R.layout.simple_list_item_1, img);
        spinner.setAdapter(arrayAdapter);

        btnAddNew.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = etName.getText().toString();
                String number = etNumber.getText().toString();
                Boolean icon = Boolean.valueOf(spinner.getSelectedItem().toString());

                Intent intentAdd = new Intent(getBaseContext(), MainActivity.class);
                intentAdd.putExtra("name", name);
                intentAdd.putExtra("number", number);
                intentAdd.putExtra("icon", icon);

                startActivity(intentAdd);
                finish();
            }
        });
    }
}
