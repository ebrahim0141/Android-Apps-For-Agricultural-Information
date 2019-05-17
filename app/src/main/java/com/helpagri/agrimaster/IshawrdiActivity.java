package com.helpagri.agrimaster;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;

public class IshawrdiActivity extends AppCompatActivity {


    private TextView textView;
    private WebView webView;

    String myText ="<center><h1> জাতের বিবরণ</h1></center>" +
            "<body><big>ফসলের নাম :<b> ইক্ষু</b><br/> জাতের নাম :<b>ঈশ্বরদী ২৯</b><br/><br/>"+
            "<b>জাত পরিচিতি :</b>" +
            "ব্রি ধান ৪৩ ব্রি উদ্ভাবিত বোনা আউশ ধানের একটি জাত।" +
            "জাতটি ২০০৪ সালে জাতীয় বীজবোর্ড অনুমোদন লাভ করে।<br/><br/>" +
            "<b>জাতের বৈশিষ্ট্য :</b>" +
            "</big> </body>";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ishawrdi);


        textView=(TextView) findViewById(R.id.textViewId);
        webView=(WebView) findViewById(R.id.webViewId);

        webView.loadDataWithBaseURL(null, myText, "text/html", "utf-8", null);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IshawrdiActivity.this,Button5Activity.class);
                startActivity(intent);
            }
        });
    }
}
