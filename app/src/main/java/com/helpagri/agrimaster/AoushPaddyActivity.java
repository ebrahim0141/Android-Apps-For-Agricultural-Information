package com.helpagri.agrimaster;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class AoushPaddyActivity extends AppCompatActivity {

    private Spinner spinner;
    String[] aoushPaddy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aoush_paddy);

        aoushPaddy = getResources().getStringArray(R.array.aoush_paddy);
        spinner =(Spinner) findViewById(R.id.spinnerId);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.aoush_paddy_sample_view,R.id.textViewId,aoushPaddy);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if(position==1)
                {
                    Intent intent = new Intent(AoushPaddyActivity.this,Bri43Activity.class);
                    startActivity(intent);
                }

                else if(position==2)
                {
                    Intent intent = new Intent(AoushPaddyActivity.this,Bri48Activity.class);
                    startActivity(intent);
                }

                else if(position==3)
                {
                    Intent intent = new Intent(AoushPaddyActivity.this,Bri55Activity.class);
                    startActivity(intent);
                }

                else if(position==4)
                {
                    Intent intent = new Intent(AoushPaddyActivity.this,Bri65Activity.class);
                    startActivity(intent);
                }

            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
