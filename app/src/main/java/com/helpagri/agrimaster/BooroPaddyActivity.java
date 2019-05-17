package com.helpagri.agrimaster;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class BooroPaddyActivity extends AppCompatActivity {

    private Spinner spinner;
    String[] booroPaddy;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booro_paddy);

        spinner=(Spinner) findViewById(R.id.spinnerId);
        booroPaddy=getResources().getStringArray(R.array.booro_paddy);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.booro_paddy_sample_view,R.id.textViewId,booroPaddy);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

                if(position==1)
                {
                    Intent intent = new Intent(BooroPaddyActivity.this,BinaDhan8Activity.class);
                    startActivity(intent);
                }

                else if(position==2)
                {
                    Intent intent = new Intent(BooroPaddyActivity.this,BinaDhan10Activity.class);
                    startActivity(intent);
                }

                else if(position==3)
                {
                    Intent intent = new Intent(BooroPaddyActivity.this,BianDhan14Activity.class);
                    startActivity(intent);
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}
