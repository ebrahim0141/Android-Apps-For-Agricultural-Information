package com.helpagri.agrimaster;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;

public class Button2UdvidChulaDisease extends AppCompatActivity {

    private TextView textView;
    private WebView webView;
    String myText="<html><body><center><h1>প্রযুক্তির বিবরণ</h1></center>" +
            "<big>প্রযুক্তির নাম :<b>ছোলার ঢলে পড়া বা উইল্ট</b><br/><br/>" +
            "<b>বিস্তারিত বিবরণ :</b><br/>" +
            "সনাক্তকারী বৈশিষ্ট্য :<br>" +
            "• চারা অবস্থায় আক্রান্ত হলে গাছ হঠাৎ করে ঢলে পড়ে কিন্তু গাছের পাতার রং এর কোন পরিবর্তন হয়।<br>" +
            "• পূর্ণ বয়স্ক গাছ এই রোগে আক্রান্ত হলে প্রথমে গাছের পাতা হলুদ হয় এবং আস্তে আস্তে গাছ নেতিয়ে পড়ে এবং পরিশেষে গাছ মারা যায়।<br>" +
            "<b>দমন ব্যবস্থাঃ</b><br>" +
            "আংশিক পচাঁ মুরগীর বিষ্ঠা ৫ টন/হেঃ হারে বীজ বপনের কমপক্ষে ২১ দিন পূর্বে প্রয়োগ করে মাটির সাথে ভালভাবে পচাঁতে হবে। অতঃপর প্রোভেক্স নামক ছত্রাকনাশক প্রতি কেজি বীজে ২.৫ গ্রাম হারে মিশিয়ে শোধন করে বীজ বপন করতে হবে। চারা গাজানোর ২০-২৫ দিন পর একবার এবং ৩৫-৪০ দিন পর দ্বিতীয় বার প্রোভেক্স নামক ছত্রাকনাশক২ গ্রাম প্রতি লিটার পানিতে মিশিয়ে গাছের গোড়ায় মাটি ভালভাবে ভিজিয়ে দিতে হবে।<br>" +
            "<center><img src=\"file:///android_res/drawable/chola.gif\" width=\"150\" height=\"100\" /></center>" +
            "</big></body></html>";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button2_udvid_chula_disease);

        textView=(TextView) findViewById(R.id.textViewId);
        webView=(WebView) findViewById(R.id.webViewId);

        webView.loadDataWithBaseURL(null, myText, "text/html", "utf-8", null);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Button2UdvidChulaDisease.this,Button5Activity.class);
                startActivity(intent);
            }
        });
    }
}
