package com.helpagri.agrimaster;

import android.content.DialogInterface;
import android.content.Intent;
import android.preference.DialogPreference;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class Button1Activity extends AppCompatActivity {


     private Button button;
     String[] typesOfCrops1;
     private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button1);

       typesOfCrops1 = getResources().getStringArray(R.array.types_of_crops1);
       spinner =(Spinner) findViewById(R.id.spinnerId);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.fosol1_sample_view,R.id.textViewId,typesOfCrops1);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if(position==1) {
                    Intent intent = new Intent(Button1Activity.this,PaddyActivity.class);
                    startActivity(intent);
                }

                if(position==2) {
                    Intent intent = new Intent(Button1Activity.this,IkkhuActivity.class);
                    startActivity(intent);
                }

                if(position==3) {
                    Intent intent = new Intent(Button1Activity.this,JuteActivity.class);
                    startActivity(intent);
                }

                if(position==4) {
                    Intent intent = new Intent(Button1Activity.this,VuttaActivity.class);
                    startActivity(intent);
                }

                if(position==5) {
                    Intent intent = new Intent(Button1Activity.this,PaddyActivity.class);
                    startActivity(intent);
                }

                if(position==6) {
                    Intent intent = new Intent(Button1Activity.this,PaddyActivity.class);
                    startActivity(intent);
                }

                if(position==7) {
                    Intent intent = new Intent(Button1Activity.this,PaddyActivity.class);
                    startActivity(intent);
                }

                if(position==8) {
                    Intent intent = new Intent(Button1Activity.this,PaddyActivity.class);
                    startActivity(intent);
                }

                if(position==9) {
                    Intent intent = new Intent(Button1Activity.this,PaddyActivity.class);
                    startActivity(intent);
                }

                if(position==10) {
                    Intent intent = new Intent(Button1Activity.this,PaddyActivity.class);
                    startActivity(intent);
                }

                if(position==11) {
                    Intent intent = new Intent(Button1Activity.this,PaddyActivity.class);
                    startActivity(intent);
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
