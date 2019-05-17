package com.helpagri.agrimaster;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;

public class B2InstrumentRisingIncooconathDetails extends AppCompatActivity {

    private TextView textView;
    private WebView webView;

    String myText="<html><body><center><h1>প্রযুক্তির বিবরণ</h1></center>" +
            "<big>প্রযুক্তির নাম :<b>নারিকেল গাছে উঠা যন্ত্র</b><br/><br/>" +
            "<b>বিস্তারিত বিবরণ :</b><br/>" +
            "বাংলাদেশে নারিকেল খুবই জনপ্রিয় ও সুপরিচিত ফল। বর্তমানে বাংলাদেশের মোট উৎপাদনের ৮০% নারিকেল দেশের দক্ষিণাঞ্চলে উৎপাদিত হয়। যদিও এর জনপ্রিয়তা বিস্তৃত তবুও এখন পর্যন্ত নারিকেল পাড়ার কাজটি যন্ত্রের ব্যবহার ছাড়া করা হয় যা খুবই ঝুঁকিপূর্ণ। এভাবে নারিকেল গাছে উঠলে অধিকাংশ সময়ই হাত পা ও বুক ছিলে যায়। এই কাজটি করার জন্য একজন দক্ষ শ্রমিকেরও প্রয়োজন হয়। নারিকেল গাছে উঠা যন্ত্রের মাধ্যমে একজন শ্রমিক খুব সহজে ও নিরাপদে নারিকেল গাছে উঠে নারিকেল পাড়া বা ডাল পরিষ্কার করতে পারে।<br/>" +
            "<b>বৈশিষ্ট্যসমুহঃ</b><br/>" +
            "১। যন্ত্রটি ব্যবহার করে সহজে গাছে উঠা যায়<br/>" +
            "২। স্থানীয় কারখানায় সহজে যন্ত্রটি তৈরি করা যায়<br/>" +
            "৩। যন্ত্রটির ব্যবহার সহজ ও নিরাপদ<br/>" +
            "৪। যন্ত্রটি চালনার জন্য একজন লোকের প্রয়োজন হয়<br/>" +
            "৫। যন্ত্রটি সহজে বহনযোগ্য<br/>" +
            "৬। যন্ত্রটির ওজনঃ ৯ কেজি<br/>" +
            "৭। যন্ত্রটির বাজার মূল্যঃ ১০,০০০ টাকা<br/>" +
            "<center><img src=\"file:///android_res/drawable/coconut.gif\" width=\"150\" height=\"100\" /></center>" +
            "</big></body></html>";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b2_instrument_rising_incooconath_details);

        textView = (TextView) findViewById(R.id.textViewId);
        webView = (WebView) findViewById(R.id.webViewId);
        webView.loadDataWithBaseURL(null,myText,"text/html","utf-8",null);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(B2InstrumentRisingIncooconathDetails.this,Button5Activity.class);
                startActivity(intent);
            }
        });
    }
}
