package com.helpagri.agrimaster;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class AgriInstruments extends AppCompatActivity {

    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agri_instruments);

        listView =(ListView) findViewById(R.id.listViewId);
        final String[] techSelector = getResources().getStringArray(R.array.tech_selector1);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.agri_instrument_simple_view,R.id.textViewId,techSelector);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String value = techSelector[position];
                if(position == 0){
                    Intent intent = new Intent(AgriInstruments.this,B2InstrumentMangoDetails.class);
                    startActivity(intent);
                }
                if(position == 1){
                    Intent intent = new Intent(AgriInstruments.this,B2InstrumentUreaDetails.class);
                    startActivity(intent);
                }
                if(position == 2){
                    Intent intent = new Intent(AgriInstruments.this,B2InstrumentCuttingCropsDetails.class);
                    startActivity(intent);
                }
                if(position == 3){
                    Intent intent = new Intent(AgriInstruments.this,B2InstrumentFallShudonDetails.class);
                    startActivity(intent);
                }
                if(position == 4){
                    Intent intent = new Intent(AgriInstruments.this,B2InstrumentRisingIncooconathDetails.class);
                    startActivity(intent);
                }
                if(position == 5){
                    Intent intent = new Intent(AgriInstruments.this,B2InstrumentCooconautChobraDetails.class);
                    startActivity(intent);
                }
                if(position == 6){
                    Intent intent = new Intent(AgriInstruments.this,B2InstrumentMobileOilDetails.class);
                    startActivity(intent);
                }
                if(position == 7){
                    Intent intent = new Intent(AgriInstruments.this,B2InstrumentCroopsIrigationDetails.class);
                    startActivity(intent);
                }
                if(position == 8){
                    Intent intent = new Intent(AgriInstruments.this,B2InstrumentHighSpeedRotariDetails.class);
                    startActivity(intent);
                }
                if(position == 9){
                    Intent intent = new Intent(AgriInstruments.this,B2InstrumrntAloUttolonDetails.class);
                    startActivity(intent);
                }
            }
        });
    }
}
