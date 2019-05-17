package com.helpagri.agrimaster;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class BotanyActivity extends AppCompatActivity {

    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_botany);

        listView =(ListView) findViewById(R.id.listViewId);
        final String[] techSelector = getResources().getStringArray(R.array.tech_selector2);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.udbit_instrument_simple_view,R.id.textViewId,techSelector);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String value = techSelector[position];
                if(position == 0){
                    Intent intent = new Intent(BotanyActivity.this,Button2UdvidMosurMool.class);
                    startActivity(intent);
                }
                if(position == 1){
                    Intent intent = new Intent(BotanyActivity.this,Button2UdvidDisease.class);
                    startActivity(intent);
                }
                if(position == 2){
                    Intent intent = new Intent(BotanyActivity.this,Button2UdvidTomatooBegun.class);
                    startActivity(intent);
                }
                if(position == 3){
                    Intent intent = new Intent(BotanyActivity.this,Button2UdvidChulaDisease.class);
                    startActivity(intent);
                }
                if(position == 4){
                    Intent intent = new Intent(BotanyActivity.this,Button2UdvidLebuDisease.class);
                    startActivity(intent);
                }
                if(position == 5){
                    Intent intent = new Intent(BotanyActivity.this,Button2UdvidPotolDisease.class);
                    startActivity(intent);
                }
            }
        });

    }
}
