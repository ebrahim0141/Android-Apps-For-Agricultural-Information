package com.helpagri.agrimaster;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class AmonPaddyActivity extends AppCompatActivity {

    private Spinner spinner;
    String[] amonPaddy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amon_paddy);

        spinner=(Spinner) findViewById(R.id.spinnerId);
        amonPaddy=getResources().getStringArray(R.array.amon_paddy);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.aoush_paddy_sample_view,R.id.textViewId,amonPaddy);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if(position==1)
                {
                    Intent intent = new Intent(AmonPaddyActivity.this,Bri53Activity.class);
                    startActivity(intent);
                }

                else if(position==2)
                {
                    Intent intent = new Intent(AmonPaddyActivity.this,Bri54Activity.class);
                    startActivity(intent);
                }

                else if(position==3)
                {
                    Intent intent = new Intent(AmonPaddyActivity.this,Bri56Activity.class);
                    startActivity(intent);
                }

                else if(position==4)
                {
                    Intent intent = new Intent(AmonPaddyActivity.this,Bri57Activity.class);
                    startActivity(intent);
                }

            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

    }
}
