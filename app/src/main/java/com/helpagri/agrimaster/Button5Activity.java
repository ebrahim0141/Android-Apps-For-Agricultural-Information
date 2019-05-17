package com.helpagri.agrimaster;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Button5Activity extends AppCompatActivity {

    private ListView listView;
    String[] technologiestList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button5);

        listView = (ListView) findViewById(R.id.listViewId);
        technologiestList = getResources().getStringArray(R.array.technologiest_list);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.button5_simple_view,R.id.textViewId,technologiestList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String value = technologiestList[position];
                if(position == 0) {
                    Intent intent = new Intent(Button5Activity.this, Button51Activity.class);
                    startActivity(intent);
                }
                else if(position == 1) {
                    Intent intent = new Intent(Button5Activity.this,Button52Activity.class);
                    startActivity(intent);
                }
                else if(position == 2) {
                    Intent intent = new Intent(Button5Activity.this,Button53Activity.class);
                    startActivity(intent);
                }
                else if(position == 3) {
                    Intent intent = new Intent(Button5Activity.this,Button54Activity.class);
                    startActivity(intent);
                }
                else if(position == 4) {
                    Intent intent = new Intent(Button5Activity.this,Button55Activity.class);
                    startActivity(intent);
                }
                else if(position == 5) {
                    Intent intent = new Intent(Button5Activity.this,Button56Activity.class);
                    startActivity(intent);
                }
                else if(position == 6) {
                    Intent intent = new Intent(Button5Activity.this,Button57Activity.class);
                    startActivity(intent);
                }
                else if(position == 7) {
                    Intent intent = new Intent(Button5Activity.this,Button58Activity.class);
                    startActivity(intent);
                }
                else if(position == 8) {
                    Intent intent = new Intent(Button5Activity.this,Button59Activity.class);
                    startActivity(intent);
                }
                else if(position == 9) {
                    Intent intent = new Intent(Button5Activity.this,Button510Activity.class);
                    startActivity(intent);
                }

            }
        });

    }
}
