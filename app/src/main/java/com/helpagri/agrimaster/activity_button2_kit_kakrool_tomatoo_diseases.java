package com.helpagri.agrimaster;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;

public class activity_button2_kit_kakrool_tomatoo_diseases extends AppCompatActivity {

    private TextView textView;
    private WebView webView;
    String myText="<html><body><center><h1>প্রযুক্তির বিবরণ</h1></center>" +
            "<big>প্রযুক্তির নাম :<b>কাকরোল, টমেটো ও শসা থেকে কীটনাশকের অবশিষ্টাংশ দূরীকরণ</b><br/><br/>" +
            "<b>বিস্তারিত বিবরণ :</b><br/>" +
            "<b>ফসলের নামঃ </b>কাকরোল, টমেটো ও শসা <br>" +
            "সবজি মানুষের দেহের প্রয়োজনীয় পুষ্টি উপাদানের একটি গুরুত্বপূর্ণ উৎস। দূর্ভাগ্যবশতঃ সবজি ফসল প্রায়ই পোকামাকড় ও রোগজীবানু দ্বারা আক্রান্ত হয় যা সবজির উৎপাদন ও মান নিয়ন্ত্রনে ব্যপক ক্ষতিকর প্রভাব ফেলে। সবজির উৎপাদন বৃদ্ধি ও ক্ষতি নিয়ন্ত্রনের জন্য রাসায়নিক কীটনাশক ব্যাপকভাবে ব্যবহার হচ্ছে যার অবশিষ্টাংশ ভোক্তার স্বাস্থ্যের উপর ক্ষতিকর প্রভাব ফেলে। এই ক্ষতির পরিমান কমিয়ে আনার জন্য সবজি থেকে কীটনাশকের অবশিষ্টাংশ অপসারন করা জরুরী। বিভিন্ন প্রক্রিয়াজাতকরন কৌশল বা পদ্ধতি ব্যবহার করে কীটনাশকের অবশিষ্টাংশ কিছুটা হলেও অপসারন করা যায়। কাকরোল, টমেটো ও শসা থেকে কীটনাশকের অবশিষ্টাংশ অপসাণ তথা দূরীকরন রান্নাঘরে সহজলভ্য কিছু উপাদান যেমন খাবার লবন ও ভিনেগার দ্বারা সহজেই করা যেতে পারে। তাছাড়া, খোসা ছাড়ানোর মাধ্যমে শসা হতে অর্গানোফসফরাস কীটনাশকের যথা- ডাইমেথয়েড, ক্লোরপাইরিফস, কুইনালফস, ডায়াজিনন, ম্যালাথিয়ন এবং ফেনিট্রোথিয়নের অবশিষ্টাংশ অপসারন করা যায় যা নিম্নে আলোচনা করা হলো।<br>" +
            "<b>খাবার লবন + খোসা ছাড়ানো :</b> বাজার থেকে কিনে আনা শসা পরিস্কার পানি দিয়ে ধুয়ে নিতে হবে → প্রতি লিটার পানিতে ২০ গ্রাম হারে লবন যোগ করে লবনপানি তৈরী করতে হবে → তৈরীকৃত লবনপানিতে শসা ১৫ মিনিট ডুবিয়ে রাখতে হবে → চাকু দিয়ে শসার খোসা ছাড়াতে হবে →পরিস্কার পানি দিয়ে খোসা ছাড়ানো শসা ধুয়ে ফেলতে হবে। এই পদ্ধতিতে ৮৫% পর্যন্ত ক্লোরপাইরিফস, কুইনালফস, ডায়াজিনন, ম্যালাথিয়ন এবং ফেনিট্রোথিয়নের অবশিষ্টাংশ অপসারন করা সম্ভব।<br>" +
            "<b>ভিনেগার দ্বারা :</b> বাজার থেকে কিনে আনা কাকরোল ও টমেটো পরিস্কার পানি দিয়ে ধুয়ে নিতে হবে → প্রতি লিটার পানিতে ২০ মিলি হারে এসিটিক এসিড বা ভিনেগার যোগ করে ভিনেগার-পানি তৈরী করতে হবে → তৈরীকৃত ভিনেগার-পানিতে কাকরোল ও টমেটো ১৫ মিনিট ডুবিয়ে রাখতে হবে → পরিস্কার পানি দিয়ে কাকরোল ও টমেটো ধুয়ে নিতে হবে → পানিতে ১৫ মিনিট রান্না করতে হবে।<br>" +
            "এই পদ্ধতিতে ৮০% পর্যন্ত ডাইমেথয়েড, ক্লোরপাইরিফস, কুইনালফস, ডায়াজিনন, ম্যালাথিয়ন এবং ফেনিট্রোথিয়নের অবশিষ্টাংশ অপসারন করা সম্ভব।<br>" +
            "<center><img src=\"file:///android_res/drawable/kakrol.gif\" width=\"150\" height=\"100\" /></center>" +
            "</big></body></html>";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button2_kit_kakrool_tomatoo_diseases);

        textView=(TextView) findViewById(R.id.textViewId);
        webView=(WebView) findViewById(R.id.webViewId);

        webView.loadDataWithBaseURL(null, myText, "text/html", "utf-8", null);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity_button2_kit_kakrool_tomatoo_diseases.this,Button5Activity.class);
                startActivity(intent);
            }
        });
    }
}
