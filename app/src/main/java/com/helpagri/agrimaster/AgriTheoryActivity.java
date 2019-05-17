package com.helpagri.agrimaster;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;

public class AgriTheoryActivity extends AppCompatActivity {

    private TextView textView;
    private WebView webView;
    String myText="<html><body><center><h1>প্রযুক্তির বিবরণ</h1></center>" +
            "<big>প্রযুক্তির নাম :<b>আন্তঃফসল হিসাবে ভুট্টার সাথে পুঁইশাকের চাষ</b><br/><br/>" +
            "<b>বিস্তারিত বিবরণ :</b><br/>" +
            "<b>ফসল :</b> ভুট্টা ও পুঁইশাক <br>" +
            "<b>মাটি ও জাত :</b> জৈব পদার্থ ও পুষ্টি উপাদান সমৃদ্ধ দোঁআশ মাটি ভুট্টা ও পুঁইশাক চাষের জন্য সবচেয়ে উপযোগী। ভুট্টাঃ বারি উদ্ভাবিত যে কোন হাইব্রিড ভুট্টা, পুঁইশাকঃ বারি পুঁইশাক-২<br>" +
            "<b>বপন/রোপন সময় :</b> ফেব্রুয়ারি মাসের শেষ সপ্তাহ থেকে মার্চের শেষ সপ্তাহ সময়কাল (ফাল্গুন মাসের মাঝামাঝি থেকে চৈত্র মাসের মাঝামাঝি) চাষের জন্য উপযুক্ত সময়।<br>" +
            "<b>বপন দূরত্ব ও বপন পদ্ধতি :</b> ভুট্টার স্বাভাবিক সারি (৭৫ সেঃ মিঃ × ২৫ সেঃ মিঃ) + ১ সারি পুঁইশাক অথবা ভুট্টার জোড়া সারি (৩৭.৫/১৫০/৩৭.৫ সেঃ মিঃ) + ৩ সারি পুঁইশাক<br>" +
            "<b>সারের বর্ণনা (কেজি/হেক্টর) :</b> ইউরিয়া ৫৫০ (অতিরিক্ত ৪০), টিএসপি ৩৮০, এমওপি ২৫০, জিপসাম ৪০০, দস্তা সার ১০, বোরিক এসিড ৫ ও গোবর সার ৫০০০ কেজি/হেক্টর<br>" +
            "<b>সার প্রয়োগ পদ্ধতি :</b> ইউরিয়া সারের এক তৃতীয়াংশ ও অন্যান্য সারের সবটুকু শেষ চাষের সময় মাটির সাথে ভালভাবে মিশিয়ে দিতে হবে। ইউরিয়া সারের বাকি দুই তৃতীয়াংশ যথাক্রমে বীজ বপনের ২০ ও ৪০ দিন পর ভুট্টার সারিতে উপরি প্রয়োগ করতে হবে। একই সময় পুঁইশাকেও অতিরিক্ত ৪০ কেজি ইউরিয়া সার দুইভাগ করে দুই কিস্তিতে উপরি প্রয়োগ করতে হবে।<br>" +
            "<b>আগাছা দমন :</b> বীজ গজানোর ২০-২৫ দিন পর প্রথম এবং ৪০-৪৫ দিন পর দ্বিতীয় বার আগাছা পরিস্কার করতে হবে।<br>" +
            "<b>ফসল সংগ্রহ :</b> ভুট্টাঃ মোচা যখন চকচকে খড়ের রং ধারণ করে (বীজ বপনের ১২০-১২৫ দিন পরে) তখন দানার জন্য মোচা সংগ্রহের উপযুক্ত সময়, পুঁইশাকঃ চারা গজানোর পর ৩০-৩৫ দিনে প্রথম শাক উত্তোলন করা যায়।<br>" +
            "<b>ফলন :</b> একক ভুট্টাঃ ৮.১৭,আন্তঃফসল ভুট্টাঃ ৬.৮২-৭.৭৪ এবং আন্তঃফসল পুঁইশাকঃ ১৩.৪৫-১৮.৭৪<br>" +
            "<center><img src=\"file:///android_res/drawable/vitta.gif\" width=\"150\" height=\"100\" /></center><br>" +
            "<center>স্বাভাবিক দুই সারি ভুট্টার মাঝে এক সারি পুঁইশাক</center>"+
            "<center><img src=\"file:///android_res/drawable/vitta2.gif\" width=\"150\" height=\"100\" /></center><br>" +
            "<center>দুই জোড়া সারি ভুট্টার মাঝে তিন সারি পুঁইশাক</center>"+
            "</big></body></html>";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agri_theory);

        textView=(TextView) findViewById(R.id.textViewId);
        webView=(WebView) findViewById(R.id.webViewId);

        webView.loadDataWithBaseURL(null, myText, "text/html", "utf-8", null);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AgriTheoryActivity.this,Button5Activity.class);
                startActivity(intent);
            }
        });
    }
}
