package com.helpagri.agrimaster;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;

public class activity_button2_kit_morich_diseases extends AppCompatActivity {


    private TextView textView;
    private WebView webView;
    String myText="<html><body><center><h1>প্রযুক্তির বিবরণ</h1></center>" +
            "<big>প্রযুক্তির নাম :<b>মরিচের ফলছিদ্রকারী পোকা এর সমন্বিত ব্যবস্থাপনা</b><br/><br/>" +
            "<b>বিস্তারিত বিবরণ :</b><br/>" +
            "<b>ফসলের নাম :</b>মরিচ<br>" +
            "<b>পোকার নামঃ</b> মরিচের ফলছিদ্রকারী পোকা<br>" +
            "<b>সনাক্তকারী বৈশিষ্ট্যঃ</b>" +
            "পোকার বৈশিষ্ট ও ক্ষতির ধরনঃ এরা বহুভোজী পোকা (Polyphagous pest) পোকা। কীড়া সাধারনত ফলের বৃন্তের কাছে ছোট ছিদ্র করে ফলের মধ্যে ঢুকে পড়ে ভিতরের অংশ খায়। একই কীড়া একাধিক ফলে আক্রমন করতে পারে। ক্ষতিগ্রস্ত ফলের ভিতরে পোকার বিষ্ঠা ও পচন দেখা যায়। আক্রান্ত ফল নির্ধারিত সময়ের পূর্বেই পেকে যায়। আক্রান্ত ফলে ছিদ্র দেখে সহজেই এই পোকার উপস্থিতি বোঝা যায়।<br>" +
            "<b>দমন ব্যবস্থাপনা:</b><br>" +
            "কীটতত্ত্ব বিভাগ, বারি কর্তৃক সাম্প্রতিক কালে উদ্ভাবিত নিম্নোক্ত আইপিএম পদ্ধতি ব্যবহারের মাধ্যমে উপরোক্ত পোকা সমূহ সহজে পরিবেশসম্মতভাবে দমন করা সম্ভব।<br>" +
            "ক) ফেরোমন ফাঁদের ব্যবহার: মরিচের জমিতে চারা রোপনের দুই সপ্তাহ পরে ২০ মিটার দূরে দূরে সেক্স ফেরোমন ফাঁদ স্থাপন করতে হবে।<br>" +
            "খ) উপকারী পোকা অবমুক্তকরণ: প্রতি সপ্তাহে একবার করে কীড়া নষ্টকারী পরজীবী পোকা, ব্রাকন হেবিটর (হেক্টরপ্রতি এক বাংকার বা ৮০০-১২০০টি পূর্ণাঙ্গ পোকা) সরিষার জমিতে মুক্তায়িত করতে হবে।<br>" +
            "গ) আক্রমণের মাত্রা বেশি হলে জৈব বালাইনাশক এসএনপিভি প্রতি লিটার পানিতে ০.২গ্রাম হারে মিশিয়ে স্প্রে করতে হবে।<br>" +
            "<center><img src=\"file:///android_res/drawable/morich.gif\" width=\"150\" height=\"100\" /></center><br>" +
            "<center>ফল ছিদ্রকারি পোকা আক্রান্ত মরিচ</center><br>"+
            "<center><img src=\"file:///android_res/drawable/morich2.gif\" width=\"150\" height=\"100\" /></center><br>" +
            "<center>মরিচের জমিতে স্থাপিত সেক্স ফেরোমন ফাঁদ</center>"+
            "</big></body></html>";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button2_kit_morich_diseases);

        textView=(TextView) findViewById(R.id.textViewId);
        webView=(WebView) findViewById(R.id.webViewId);

        webView.loadDataWithBaseURL(null, myText, "text/html", "utf-8", null);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity_button2_kit_morich_diseases.this,Button5Activity.class);
                startActivity(intent);
            }
        });
    }
}
