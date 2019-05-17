package com.helpagri.agrimaster;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;

public class activity_button2_kit_cool_diseases extends AppCompatActivity {


    private TextView textView;
    private WebView webView;
    String myText="<html><body><center><h1>প্রযুক্তির বিবরণ</h1></center>" +
            "<big>প্রযুক্তির নাম :<b>কুলের ফল ছিদ্রকারী উইভিল পোকার সমন্বিত দমন ব্যবস্থাপনা</b><br/><br/>" +
            "<b>বিস্তারিত বিবরণ :</b><br/>" +
            "<b>ফসলের নামঃ </b>কুল <br>" +
            "<b>পোকার নামঃ</b> ফল ছিদ্রকারী উইভিল পোকা<br>" +
            "<b>পোকার বৈশিষ্ট ও ক্ষতির ধরনঃ</b> ফল ছিদ্রকারী উইভিল পোকা কুল গাছের মারাত্মক ক্ষতিকারক পোকা। বিগত কয়েক বছর থেকে দেশের বিভিন্ন স্থানে কুলের উন্নতজাত সমূহে এ পোকার ব্যাপক আক্রমণ লক্ষ্য করা যাচ্ছে। স্ত্রী পোকা কুলের গায়ে মুখের শুঁড়ের সাহায্যে চিরে ডিম পাড়ে। ডিম ফুটে কীড়া বের হয় এবং কীড়াগুলি ফলের শাঁসের মধ্যে আঁকাবাঁকা সুড়ঙ্গ তৈরী করে খেতে থাকে। আক্রান্ত ফল কাটলে শাঁসে কীড়ার তৈরী আঁকাবাঁকা সুড়ঙ্গ, সুড়ঙ্গে কীড়া কর্তৃক নির্গত মল পোকার পুত্তলী বা পূর্ণাঙ্গ পোকা দেখা যায়। আক্রান্ত কুল খাবার অনুপোযুক্ত হয়ে যায়।<br>" +
            "<b>দমন ব্যবস্থাপনা:</b> বাংলাদেশ কৃষি গবেষণা ইনস্টিটিউট উদ্ভাবিত নিম্নোক্ত পদ্ধতি ব্যবহারের মাধ্যমে উক্ত পোকাসমূহ কম খরচে ও কার্যকরীভাবে উপায়ে দমন করা সম্ভব।<br>" +
            "ক) পরিষ্কার পরিচ্ছন্ন চাষাবাদ: কুল বাগানের আশে পাশের ঝোপ জঙ্গল এবং বাগানের আগাছা পরিস্কার করতে হবে। কুল গাছে অসময়ের ফুল ও কুঁড়ি নষ্ট করে ফেলতে হবে। কুল গাছে প্রাথমিক পর্যায়ে আক্রান্ত ফলগুলি সংগ্রহ করে (পূর্ণ বয়স্ক পোকা আক্রান্ত ফল থেকে বের হওয়ার পূর্বে) লার্ভা বা পিউপা বা পূর্ণ বয়স্ক পোকাসহ ধ্বংস করে ফেলতে হবে।<br>" +
            "খ) কীটনাশক ব্যবহার: গাছে ফুল ধরার আগে কার্বারিল ৮৫ ডব্লিউপি জাতীয় কীটনাশক (প্রতি লিটার পানিতে ১.৫ গ্রাম) একবার এবং পরাগায়নের পর ফলধারণ শুরু হওয়ার সাথে সাথে একবার সাইপারমেথ্রিন ১০ইসি জাতীয় কীটনাশক (প্রতি লিটার পানিতে ১.০ মিলি হারে) স্প্রে করতে হবে।<br>" +
            "<center><img src=\"file:///android_res/drawable/cool.gif\" width=\"150\" height=\"100\" /></center><br/>" +
            "<center>পূর্ণাঙ্গ উইভিল পোকা</center><br>" +
            "<center><img src=\"file:///android_res/drawable/cool2.gif\" width=\"150\" height=\"100\" /></center><br/>" +
            "<center>পোকা আক্রান্ত কুল</center><br>" +
            "<center><img src=\"file:///android_res/drawable/cool3.gif\" width=\"150\" height=\"100\" /></center><br/>" +
            "<center>ফলের ভিতরে পোকার কীড়া</center><br>" +
            "<center><img src=\"file:///android_res/drawable/cool4.gif\" width=\"150\" height=\"100\" /></center><br/>" +
            "<center>ফলের ভিতরে পূর্ণাঙ্গ পোকা</center>" +
            "</big></body></html>";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button2_kit_cool_diseases);

        textView=(TextView) findViewById(R.id.textViewId);
        webView=(WebView) findViewById(R.id.webViewId);

        webView.loadDataWithBaseURL(null, myText, "text/html", "utf-8", null);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity_button2_kit_cool_diseases.this,Button5Activity.class);
                startActivity(intent);
            }
        });
    }
}
