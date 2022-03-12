package com.abulkalam.arrayadapter_with_spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {  // IMPLEMENTING AdapterView
    Spinner simple_Spinner;
    String[] animal_List = {"Lion", "Tiger", "Leopard", "Bear", "Rhinos", "Deer", "Zebra", "Hyena",
            "Elephant" , "Tiger", "Leopard", "Bear", "Rhinos", "Deer", "Zebra", "Hyena", "Elephant",
            "Lion", "Tiger", "Leopard", "Bear", "Rhinos", "Deer", "Zebra", "Hyena",
            "Elephant" , "Tiger", "Leopard", "Bear", "Rhinos", "Deer", "Zebra", "Hyena", "Elephant",
            "Lion", "Tiger", "Leopard", "Bear", "Rhinos", "Deer", "Zebra", "Hyena",
            "Elephant" , "Tiger", "Leopard", "Bear", "Rhinos", "Deer", "Zebra", "Hyena", "Elephant"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        simple_Spinner = findViewById(R.id.simple_Spinner);
        simple_Spinner.setOnItemSelectedListener(this);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_spinner_item, animal_List); //slight change
        //Adding dropdown style to spinner item in adapter
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        simple_Spinner.setAdapter(arrayAdapter);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        Toast.makeText(this, animal_List[position], Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        //TODO Auto-generated method stub
    }
}