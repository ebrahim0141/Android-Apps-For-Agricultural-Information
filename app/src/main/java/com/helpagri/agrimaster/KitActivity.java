package com.helpagri.agrimaster;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class KitActivity extends AppCompatActivity {

    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kit);


        listView =(ListView) findViewById(R.id.listViewId);
        final String[] techSelector = getResources().getStringArray(R.array.tech_selector3);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.kit_instrument_sample_view,R.id.textViewId,techSelector);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String value = techSelector[position];
                if(position == 0){
                    Intent intent = new Intent(KitActivity.this,activity_button2_kit_coffy_diseases.class);
                    startActivity(intent);
                }
                if(position == 1){
                    Intent intent = new Intent(KitActivity.this,activity_button2_kit_cool_diseases.class);
                    startActivity(intent);
                }
                if(position == 2){
                    Intent intent = new Intent(KitActivity.this,activity_button2_kit_kakrool_tomatoo_diseases.class);
                    startActivity(intent);
                }
                if(position == 3){
                    Intent intent = new Intent(KitActivity.this,activity_button2_kit_kola_diseases.class);
                    startActivity(intent);
                }
                if(position == 4){
                    Intent intent = new Intent(KitActivity.this,activity_button2_kit_morich_diseases.class);
                    startActivity(intent);
                }
            }
        });

    }
}
