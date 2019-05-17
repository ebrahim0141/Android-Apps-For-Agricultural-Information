package com.helpagri.agrimaster;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;

public class activity_button2_kit_coffy_diseases extends AppCompatActivity {


    private TextView textView;
    private WebView webView;
    String myText="<html><body><center><h1>প্রযুক্তির বিবরণ</h1></center>" +
            "<big>প্রযুক্তির নাম :<b>কপি জাতীয় ফসলের বিভিন্ন পাতা-খেকো পোকার সমন্বিত দমন ব্যবস্থাপনা</b><br/><br/>" +
            "<b>বিস্তারিত বিবরণ :</b><br/>" +
            "<b>ফসলের নামঃ </b>শিম <br>" +
            "<b>পোকার নামঃ </b>সাধারণ কাটুই পোকা বা প্রোডেনিয়া ক্যাটারপিলার এবং সুরুই পোকা বা ডায়মন্ড ব্যাক মথ<br>" +
            "<b>পোকার বৈশিষ্ট্য ও ক্ষতির ধরণ: </b>বিভিন্ন পাতা খেকো পোকা যেমন-সাধারণ কাটুই পোকা বা প্রোডেনিয়া ক্যাটারপিলার এবং সুরুই পোকা বা ডায়মন্ড ব্যাক মথ বাঁধাকপির মারাত্মক ক্ষতিসাধন করে থাকে। অনুরূপভাবে সাধারণ কাটুই পোকা বা প্রোডেনিয়া ক্যাটারপিলার ফুলকপি উৎপাদনেরও বড় অন্তরায়।<br>" +
            "<b>দমন ব্যবস্থাপনা:</b> বাংলাদেশ কৃষি গবেষণা ইনস্টিটিউটের কীটতত্ত্ব বিভাগ কর্তৃক উদ্ভাবিত নিম্নোক্ত আইপিএম পদ্ধতি ব্যবহারের মাধ্যমে উক্ত পোকাসমূহ কার্যকরীভাবে, কম খরচে ও পরিবেশসম্মত উপায়ে দমন করা সম্ভব।<br>" +
            "ক) যান্ত্রিক উপায়ে দমন: সাধারণ কাটুই পোকা এবং ডায়মন্ড ব্যাক মথ এর ডিম / কীড়া আক্রমণের প্রথমাবস্থায় দু-একটি পাতায় দলবদ্ধভাবে থাকে। উক্ত সময় আক্রান্ত পাতার পোকাগুলিকে ২-৩ বার হাত বাছাই করে মেরে ফেললে এই সব পোকা অনেকাংশে দমন করা সম্ভবপর হয়।<br>" +
            "খ) সাধারণ কাটুই পোকার জন্য সেক্স ফেরোমন ফাঁদের ব্যবহার: সেক্স ফেরোমন ব্যবহার করে প্রচুর পরিমাণে সাধারণ কাটুই পোকার পুরুষ পোকা আকৃষ্ট করা সম্ভব। পানি ফাঁদের মাধ্যমে উক্ত ফেরোমন ব্যবহার করে আকৃষ্ট পোকা সমূহকে মেরে ফেলা যায়। সেক্স ফেরোমন ফাঁদ বাঁধাকপি/ফুলকপির জমিতে চারা লাগানোর ১ সপ্তাহের মধ্যে ২০ মিটার দূরে দূরে স্থাপন করতে হবে।<br>" +
            "গ) আক্রমনের মাত্রা বেশী হলে জৈব বালাইনাশক এসএনপিভি প্রতি লিটার পানিতে ০.২ মি:গ্রা: পরিমান মিশিয়ে জমিতে স্প্রে করতে হবে।<br>" +
            "গ) উপকারী পোকামাকড় অবমুক্তকরণ: সম্ভবপর হলে প্রতি সপ্তাহে একবার করে ডিম নষ্টকারী পরজীবী পোকা, ট্রাইকোগ্রামা কাইলোনিজ (হেক্টরপ্রতি এক গ্রাম পরজীবী পোকা আক্রান্ত ডিম, যেখান থেকে ৪০,০০০ হতে ৪৫,০০০ পূর্ণাঙ্গ ট্রাইকোগ্রামা বের হয়ে আসবে) ও কীড়া নষ্টকারী পরজীবী পোকা, ব্রাকন হেবিটর (হেক্টরপ্রতি এক বাংকার বা ৮০০-১২০০টি পূর্ণাঙ্গ পোকা) পর্যায়ক্রমিকভাবে বাঁধাকপি/ফুলকপির জমিতে মুক্তায়িত করতে হবে।<br>" +
            "ঘ) এলাকা ভিত্তিক সমন্বিত উদ্যোগ: উপরোক্ত পদ্ধতিটির সামগ্রিক সফলতার জন্য সংশ্লিষ্ট এলাকার সকল চাষীদের সমন্বিত উদ্যোগ গ্রহণ খুবই জরুরী।<br>"+
            "<center><img src=\"file:///android_res/drawable/coffy.gif\" width=\"150\" height=\"100\" /></center><br/>" +
            "<center>সাধারণ কাটুই পোকা</center><br>" +
            "<center><img src=\"file:///android_res/drawable/coffy2.gif\" width=\"150\" height=\"100\" /></center><br/>" +
            "<center>পোকা আক্রান্ত বাঁধাকপি</center><br>" +
            "<center><img src=\"file:///android_res/drawable/coffy3.gif\" width=\"150\" height=\"100\" /></center><br/>" +
            "<center>সুরুই পোকা আক্রান্ত বাঁধাকপির পাতা</center><br>" +
            "<center><img src=\"file:///android_res/drawable/coffy4.gif\" width=\"150\" height=\"100\" /></center><br/>" +
            "<center>বাঁধাকপির জমিতে স্থাপিত ফেরোমন ফাঁদ</center>" +
            "</big></body></html>";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button2_kit_coffy_diseases);


        textView=(TextView) findViewById(R.id.textViewId);
        webView=(WebView) findViewById(R.id.webViewId);

        webView.loadDataWithBaseURL(null, myText, "text/html", "utf-8", null);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity_button2_kit_coffy_diseases.this,Button5Activity.class);
                startActivity(intent);
            }
        });
    }
}
