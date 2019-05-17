package com.helpagri.agrimaster;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;

public class B2InstrumentMobileOilDetails extends AppCompatActivity {

    private TextView textView;
    private WebView webView;

    String myText="<html><body><center><h1>প্রযুক্তির বিবরণ</h1></center>" +
            "<big>প্রযুক্তির নাম :<b>মোবাইল তেল নিষ্কাশন যন্ত্র</b><br/><br/>" +
            "<b>বিস্তারিত বিবরণ :</b><br/>" +
            "বাংলাদেশে কয়েক দশক ধরে ভোজ্য তেলের ঘাটতি রয়েছে।মোটভোজ্য তেলের প্রায় শতকরা ৭০ ভাগ বিদেশ থেকে আমদানী করা হয়ে থাকে।বাংলাদেশে উৎপাদিত তৈলবীজ (সরিষা, তিল, সূর্যমুখী, সয়াবীন, চীনাবাদাম, তিসি ইত্যাদি) দ্বারা শতকরা ৩০ ভাগ চাহিদা পূরণ করা হয়ে থাকে। বাজারে প্রচলিত তৈল মিলের কার্যক্ষমতা বেশী (কম পক্ষে ১০ কেজি) হওয়ায় অনেক কৃষক অল্প পরিমাণ তৈলবীজ ভাঙ্গাতে পারেন না।তাছাড়া বাণিজ্যিক তেল মিল গুলি শহর বা উপজেলা পর্যায়ে স্থাপিত। গ্রামাঞ্চলে তেলের মিল বিরল। ফলে কৃষকগণ তৈলবীজ উৎপাদন করা সত্বেওবিশুদ্ধ তেলের স্বাদ থেকে বঞ্চিত হন।কৃষক যাতে তার উৎপন্ন অল্প পরিমাণ (কম পক্ষে ২কেজি) তৈলবীজ তার এলাকায় ভাঙ্গিয়ে বিশুদ্ধ তৈল সংগ্রহ করতে পারেন সেলক্ষে এই মোবাইল তেল নিষ্কাশন যন্ত্রটি উদ্ভাবন করা হয়েছে।<br/>" +
            "<b>বৈশিষ্ট্যসমূহঃ </b><br/>" +
            "১।স্থানীয় কারখানায় যন্ত্রটি সহজে তৈরি করা যায়<br/>" +
            "২।যন্ত্রটি দিয়ে সহজে অতি অল্প সময়ে ও কম খরচে সরিষা, বাদাম, সূর্যমূখী, কালোজিরা প্রভৃতির বীজ থেকে তেলনিষ্কাশন করা সম্ভব <br/>" +
            "৩।যন্ত্রটি পাওয়ার টিলার অথবা ইঞ্জিন দ্বারা চালানো যায়<br/>" +
            "৪।যন্ত্রটি দ্বারা ক্ষুদ্র প্রান্তিক তৈলবীজ চাষী অথবা বাসাবাড়ির লোকজন সর্বনিম্ন ২কেজি দানা ভাঙ্গাতে পারেন <br/>" +
            "৫।যন্ত্রটি পাওয়াটিলার চালিত হওয়ায় সহজে স্থানান্তর যোগ্য <br/>" +
            "৬। কার্যক্ষমতাঃ ১২–২০কেজি/ঘণ্টা<br/>" +
            "৭। ওয়েল রিকভারিঃ৩৫%<br/>" +
            "৮। প্রয়োজনীয় শ্রমিকঃ ২জন<br/>" +
            "<center><img src=\"file:///android_res/drawable/mobileoil.gif\" width=\"150\" height=\"100\" /></center>" +
            "</big></body></html>";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b2_instrument_mobile_oil_details);

        textView = (TextView) findViewById(R.id.textViewId);
        webView = (WebView) findViewById(R.id.webViewId);
        webView.loadDataWithBaseURL(null,myText,"text/html","utf-8",null);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(B2InstrumentMobileOilDetails.this,Button5Activity.class);
                startActivity(intent);
            }
        });
    }
}
