package com.helpagri.agrimaster;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;

public class B2InstrumentCuttingCropsDetails extends AppCompatActivity {

    private TextView textView;
    private WebView webView;
    String myText="<html><body><center><h1>প্রযুক্তির বিবরণ</h1></center>" +
            "<big>প্রযুক্তির নাম :<b>শস্য কর্তন যন্ত্র</b><br/><br/>" +
            "<b>বিস্তারিত বিবরণ :</b><br/>" +
            "বর্তমানে বাংলাদেশের কৃষকদের ধান ও গম চাষে যে সমস্যাগুলি রয়েছে তার মধ্যে ধান/গম কাটা একটি অন্যতম প্রধান সমস্যা। ধান বা গম কাটার মৌসুমে কৃষককে বেশ কয়েকটি কাজ একসাথে করতে হয়। যেমন- ফসল কাটা, মাড়াই করা, ঝাড়াই করা, শুকানো এবং পরবর্তীকালে ফসলের জন্য জমে তৈরি, বীজতলা তৈরি ইত্যাদি। কৃষি শ্রমিকের সংখ্যা হ্রাস পাওয়ায় এসময় শ্রমিকের তীব্র সংকট দেখা দেয়। এ সমস্যা দূরীকরণে স্বচালিত শস্য কর্তন যন্ত্র উদ্ভাবন করা হযেছে। <br/>" +
            "<b>বৈশিষ্ট্যসমূহ :</b>" +
            "১। যন্ত্রটি দিয়ে ধান ও গম কাটা যায়।<br/>" +
            "২। কিছুটা হেলে পড়া ধান বা গমও কাটা যায়।<br/>" +
            "৩। জমিতে কিছুটা পানি থাকলেও যন্ত্রটি দিয়ে ফসল কাটা যায় (এঁটেল মাটি ছাড়া)।<br/>" +
            "৪। কাটা ধান বা গম ডান পাশে সারিবদ্ধভাবে পড়ে যাতে সহজে আঁটি বাঁধা যায়।<br/>" +
            "৫। প্রতি ঘন্টায় জ্বালানি খরচ মাত্র ০.৬ লিটার (ডিজেল)।<br/>" +
            "৬। প্রতি হেক্টর ধান ও গম কাটতে প্রায় ১২০০ টাকা খরচ হয়।<br/>" +
            "৭। একজন লোক সহজেই যন্ত্রটি চালাতে পারে এবং এটি সহজে স্থানান্তর করা যায়।<br/>" +
            "৮। যন্ত্রটি প্রতি ঘন্টায় ০.১৪-০.২০ হেক্টর (৩৫-৫০ শতাংশ) ধান এবং ০.১৮-০.২৪ হেক্টর (৪৫-৬০ শতাংশ) গম কাটতে পারে।<br/>" +
            "৯। যন্ত্রটির বাজার মূল্য ১,৭০,০০০ টাকা<br/>" +
            "<center><img src=\"file:///android_res/drawable/coconut.gif\" width=\"150\" height=\"100\" /></center>" +
            "</big></body></html>";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b2_instrument_cutting_crops_details);

        textView = (TextView) findViewById(R.id.textViewId);
        webView = (WebView) findViewById(R.id.webViewId);
        webView.loadDataWithBaseURL(null,myText,"text/html","utf-8",null);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(B2InstrumentCuttingCropsDetails.this,Button5Activity.class);
                startActivity(intent);
            }
        });
    }
}
