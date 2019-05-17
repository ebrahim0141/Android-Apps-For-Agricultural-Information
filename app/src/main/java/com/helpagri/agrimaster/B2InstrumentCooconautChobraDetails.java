package com.helpagri.agrimaster;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;

public class B2InstrumentCooconautChobraDetails extends AppCompatActivity {

    private TextView textView;
    private WebView webView;
    String myText="<html><body><center><h1>প্রযুক্তির বিবরণ</h1></center>" +
            "<big>প্রযুক্তির নাম :<b>নারিকেলের ছোবড়া ছাড়ানো যন্ত্র</b><br/><br/>" +
            "<b>বিস্তারিত বিবরণ :</b><br/>" +
            "নারিকেল বাংলাদেশের খুব সুপরিচিত ও জনপ্রিয় ফল। ইহা উপকূলীয় অঞ্চলে অধিক হারে উৎপাদিত হয়। সাধারণত গ্রামাঞ্চলে হাতের সাহায্যে ধারালো লোহা অথবা সারাশির সাহায্যে নারিকেলের ছোবড়া ছাড়ানো হয় যা সময় সাপেক্ষ ও কষ্ট সাধ্য। এই কাজের জন্য দক্ষ শ্রমিকের ও প্রয়োজন। ফলে সকল আকারের ও স্বল্প সময়ে অধিক হারে নারিকেলের ছোবড়া ছাড়ানোর জন্য শক্তি চালিত নারিকেলের ছোবড়া ছাড়ানো যন্ত্রটি উদ্ভাবন করা হয়েছে।<br/>" +
            "<b>বৈশিষ্ট্যসমুহঃ</b><br/>" +
            "১। যন্ত্রটি দিয়ে সহজে ও দ্রুত সকল আকারের নারিকেলের ছোবড়া ছাড়ানো যায় <br/>" +
            "২। এই যন্ত্র দিয়ে প্রচলতি পদ্ধতির তুলনায় দ্বিগুণ পরমিাণ নারিকেলের ছোবড়া ছাড়ানো যায় <br/>" +
            "৩। একশত নারিকেলের খোসা ছাড়াতে খরচ হয় ৪০ টাকা <br/>" +
            "৪। যন্ত্রটি প্রচলিত পদ্ধতির তুলনায় ৫৭% খরচ এবং৫০% সময় সাশ্রয় করে <br/>" +
            "৫। স্থানীয় সেবা প্রদানকারীগণ যন্ত্রটি ভাড়া খাটিয়ে আর্থিকভাবে লাভবান হবেন <br/>" +
            "৬। যন্ত্রটির কার্যক্ষমতাঃ৩০০টি নারিকেল/ঘন্টা<br/>" +
            "৭। ছোবড়া ছাড়ানোর খরচঃপ্রতি নারিকেল ৪০পয়সা মাত্র <br/>" +
            "৮। যন্ত্রটির বাজার মূল্যঃ ৭৫,০০০টাকা" +
            "<center><img src=\"file:///android_res/drawable/coconutchobra.gif\" width=\"150\" height=\"100\" /></center><br/>" +
            "</big></body></html>";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b2_instrument_cooconaut_chobra_details);

        textView=(TextView) findViewById(R.id.textViewId);
        webView=(WebView) findViewById(R.id.webViewId);

        webView.loadDataWithBaseURL(null, myText, "text/html", "utf-8", null);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(B2InstrumentCooconautChobraDetails.this,Button5Activity.class);
                startActivity(intent);
            }
        });
    }
}
