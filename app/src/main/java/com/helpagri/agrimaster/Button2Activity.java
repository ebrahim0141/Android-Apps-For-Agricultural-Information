package com.helpagri.agrimaster;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Button2Activity extends AppCompatActivity {

    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button2);

        listView =(ListView) findViewById(R.id.listViewid);
        final String[] techSelector = getResources().getStringArray(R.array.tech_selector);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.button1_sample_view,R.id.textViewId,techSelector);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String value = techSelector[position];
                if(position == 0) {
                    Intent intent = new Intent(Button2Activity.this, AgriInstruments.class);
                    startActivity(intent);
                }
                else if(position == 1) {
                    Intent intent = new Intent(Button2Activity.this,BotanyActivity.class);
                    startActivity(intent);
                }
                else if(position == 2) {
                    Intent intent = new Intent(Button2Activity.this,KitActivity.class);
                    startActivity(intent);
                }
                else if(position == 3) {
                    Intent intent = new Intent(Button2Activity.this,WaterActivity.class);
                    startActivity(intent);
                }
                else if(position == 4) {
                    Intent intent = new Intent(Button2Activity.this,CropsActivity.class);
                    startActivity(intent);
                }
                else if(position == 5) {
                    Intent intent = new Intent(Button2Activity.this,AgriTheoryActivity.class);
                    startActivity(intent);
                }
                else {
                    Intent intent = new Intent(Button2Activity.this,PossibilityActivity.class);
                    startActivity(intent);
                }

            }
        });
    }
}

