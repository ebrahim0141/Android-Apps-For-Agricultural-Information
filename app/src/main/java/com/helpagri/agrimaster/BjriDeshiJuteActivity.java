package com.helpagri.agrimaster;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;

public class BjriDeshiJuteActivity extends AppCompatActivity {


    private TextView textView;
    private WebView webView;
    String myText="<html><body><center><h1>জাতের বিবরণ</h1></center>" +
            "<big>ফসলের নাম :<b>পাট</b>" +
            "<b>জাতের নাম :</b> বিজেআরআই দেশী পাট-৬<br>" +
            "<b>বৈশিষ্ট্য :</b><br>" +
            "বিজেআরআই কর্তৃক এ উন্নত দেশী পাটের জাতটি প্রচলিত জাত সিভিএল-১ এবং আশু পরিপক্ক হএয়া একটি লোকাল রেস- ফুলেশ্বরি এর মধ্যে সংকরায়ণের মাধ্যমে উদ্ভাবন করা হয় এবং জাতীয় বীজ বোর্ড কর্তৃক ১৯৯৫ সালে ছাড়করণের অনুমোদন দেয়া হয়।<br>" +
            "<b>জাতের বৈশিষ্ট্য :</b><br>" +
            "১। পাতা সিভিএল-১ জাতের চেয়ে সরু, পাতার ফলকের কিনারা ঢেউ খেলানো( ৪৫-৬০ দিন বয়সী গাছে সুষ্পষ্ট ভাবে বোঝা যায়, পরিণত পাতায় এ ঢেউ খেলানো ভাবটা)<br>" +
            "২। এ জাতটি ৯০-৯৫ দিনে পরিণত হয় অর্থাৎ ফুল আসে।<br>" +
            "৩। তে-ফসলী শস্যক্রমের জন্য খুব উপযোগী।<br>" +
            "৪। সঠিক সময়ে বপন এবং সুষ্ঠ পরিচর্যা করে হেক্টর প্রতি ২.৫০-৩.০০ টন শুকানো আঁশ পাওয়া যায়।<br>" +
            "<b>বপনের সময় :</b> ১লা চৈত্র- ৩০শে চৈত্র<br>" +
            "<b>মাড়াইয়ের সময় :</b> বপনের ১২০ দিন পর<br>" +
            "</big></body></html>";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bjri_deshi_jute);

        textView=(TextView) findViewById(R.id.textViewId);
        webView=(WebView) findViewById(R.id.webViewId);

        webView.loadDataWithBaseURL(null, myText, "text/html", "utf-8", null);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(BjriDeshiJuteActivity.this,Button5Activity.class);
                startActivity(intent);
            }
        });
    }
}
