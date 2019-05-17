package com.helpagri.agrimaster;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;

public class Button2UdvidPotolDisease extends AppCompatActivity {

    private TextView textView;
    private WebView webView;
    String myText="<html><body><center><h1>প্রযুক্তির বিবরণ</h1></center>" +
            "<big>প্রযুক্তির নাম :<b>পটলের গীটকৃমি</b><br/><br/>" +
            "<b>বিস্তারিত বিবরণ :</b><br/>" +
            "<b>সনাক্তকারী বৈশিষ্ট্য :</b>" +
            "ফসলের শিকড়ে গিট এর উপস্থিতিই এ রোগের লক্ষণ। ফলে শিকড় স্বাভাবিকভাবে মাটি থেকে পানি ও পুষ্টি সংগ্রহ ও পরিবহন করতে পারে না। বিশেষ করে খরার সময় ঢলে পড়ে, অতি বর্ষায় শিকড়ে পচন হয়, আক্রান্ত গাছের বৃদ্ধি ব্যাহত হয়। গাছ খর্বাকৃতি ও দুর্বল হয়, ফুল ও ফল ধারণ ব্যাহত হয়। ফল বৃদ্ধিপ্রাপ্ত হয় না, গাছ শুকিয়ে মারা যায়।<br>" +
            "<b>দমন ব্যবস্থাপনা :</b><br>" +
            "নতুন পটলের লতা লাগানোর আগে বিঘা প্রতি দেড় টন হারে মুরগির কাচা বিষ্ঠা প্রতি বিঘাতে বা প্রতি মাদায় গর্ত করে প্রতি গর্তে ৫-১০ কেজি হারে প্রয়োগ করে মাটির সাথে ভালোভাবে মিশিয়ে ৩ সপ্তাহ পর্যন্ত পচনের জন্য ফেলে রাখতে হবে। লাগানোর পূর্বে প্রতি গর্তে ১৫-২০ গ্রাম হারে ফুরাডান ৫ জি প্রয়োগ করে লতা লাগাতে হবে। রোগমুক্ত গাছ থেকে লতা সংগ্রহ করতে হবে। রোগাক্রান্ত লতা-পাতা, শিকড় ও ফল সংগ্রহ করে মাটিতে পুতে ফেলতে হবে। শস্য পর্যায় (সরিষা, বাদাম, ভুট্টা, ধান, মরিচ ইত্যাদি) অবলম্বন করতে হবে।<br>" +
            "<center><img src=\"file:///android_res/drawable/potol1.gif\" width=\"150\" height=\"100\" /></center>" +
            "<center>কৃমি আক্রান্ত পটল গাছ ও শিকড় (ছবি-১)</center><br>" +
            "<center><img src=\"file:///android_res/drawable/potol2.gif\" width=\"150\" height=\"100\" /></center>" +
            "<center>কৃমি আক্রান্ত পটল গাছ ও শিকড় (ছবি-২)</center>" +
            "</big></body></html>";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button2_udvid_potol_disease);

        textView=(TextView) findViewById(R.id.textViewId);
        webView=(WebView) findViewById(R.id.webViewId);

        webView.loadDataWithBaseURL(null, myText, "text/html", "utf-8", null);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Button2UdvidPotolDisease.this,Button5Activity.class);
                startActivity(intent);
            }
        });
    }
}
