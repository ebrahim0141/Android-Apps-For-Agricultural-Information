package com.helpagri.agrimaster;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

public class Button510Activity extends AppCompatActivity {

    private TextView textView,phoneNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button510);

        textView = (TextView) findViewById(R.id.textViewId);
        phoneNumber = (TextView) findViewById(R.id.phoneNumberId);
        textView.setMovementMethod(LinkMovementMethod.getInstance());

        phoneNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("+8801712274933"));
                startActivity(callIntent);
            }
        });
    }
}
