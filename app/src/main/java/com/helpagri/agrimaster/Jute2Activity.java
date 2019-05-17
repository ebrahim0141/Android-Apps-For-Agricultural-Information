package com.helpagri.agrimaster;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Jute2Activity extends AppCompatActivity {

    String[] nameOfCrops;
    private Spinner spinner;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jute2);

        nameOfCrops = getResources().getStringArray(R.array.bjri_jute);
        spinner =(Spinner) findViewById(R.id.spinnerId);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.jute2_sample_view,R.id.textViewId,nameOfCrops);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if(position==1) {
                    Intent intent = new Intent(Jute2Activity.this,BjriDeshiJuteActivity.class);
                    startActivity(intent);
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
