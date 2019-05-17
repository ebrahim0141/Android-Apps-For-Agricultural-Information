package com.helpagri.agrimaster;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class PaddyActivity extends AppCompatActivity {

    String[] nameOfCrops;
    private Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paddy);

        nameOfCrops = getResources().getStringArray(R.array.name_of_crops);
        spinner =(Spinner) findViewById(R.id.spinnerId);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.paddy_simple_view,R.id.textViewId,nameOfCrops);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if(position==1) {
                    Intent intent = new Intent(PaddyActivity.this,AoushPaddyActivity.class);
                    startActivity(intent);
                }
                else if(position==2)
                {
                    Intent intent = new Intent(PaddyActivity.this,AmonPaddyActivity.class);
                    startActivity(intent);
                }
                else if(position==3) {
                    Intent intent = new Intent(PaddyActivity.this,BooroPaddyActivity.class);
                    startActivity(intent);
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
