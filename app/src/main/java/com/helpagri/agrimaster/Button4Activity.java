package com.helpagri.agrimaster;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Button4Activity extends AppCompatActivity {

    private ListView listView;
    String[] questionAnstList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button4);


        listView = (ListView) findViewById(R.id.listViewId);
        questionAnstList = getResources().getStringArray(R.array.question_ans_list);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.button4_sample_view,R.id.textViewId,questionAnstList);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                String value = questionAnstList[position];
                if(position == 0) {
                    Intent intent = new Intent(Button4Activity.this, Button41Activity.class);
                    startActivity(intent);
                }
            }
        });
    }
}
