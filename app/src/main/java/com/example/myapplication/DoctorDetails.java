package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

public class DoctorDetails extends AppCompatActivity {


    String[] item = {"Դավիդյանց պոլիկլինիկաներ", "Վան ստոմատոլոգիական պոլիկլինիկա", "№17 պոլիկլինիկա", "Արտաշիսյան մանկական պոլիկլինիկա", "Նորագավիթ պոլիկլինիկա"};
    AutoCompleteTextView autoCompleteTextView;
    ArrayAdapter<String> adapterItems;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_details);

        autoCompleteTextView = findViewById(R.id.dropdown_menu);
        adapterItems = new ArrayAdapter<String>(this, R.layout.list_item, item);

        autoCompleteTextView.setAdapter(adapterItems);

        autoCompleteTextView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String item = adapterView.getItemAtPosition(i).toString();
                Toast.makeText(DoctorDetails.this, "Item: "+item, Toast.LENGTH_SHORT).show();
            }
        });
    }
}