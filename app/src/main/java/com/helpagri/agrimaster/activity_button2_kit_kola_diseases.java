package com.helpagri.agrimaster;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;

public class activity_button2_kit_kola_diseases extends AppCompatActivity {



    private TextView textView;
    private WebView webView;
    String myText="<html><body><center><h1>প্রযুক্তির বিবরণ</h1></center>" +
            "<big>প্রযুক্তির নাম :<b>কলার পাতা ও ফলের বিটল পোকা এর সমন্বিত দমন ব্যবস্থাপনা</b><br/><br/>" +
            "<b>বিস্তারিত বিবরণ :</b><br/>" +
            "<b>ফসলের নাম :</b>কলা <br>" +
            "<b>পোকার বৈশিষ্ট্য ও ক্ষতির ধরণ:</b> কলার পাতা ও ফলের বিটল পোকা (Nodostoma viridipennis Mots.) সারা বাংলাদেশব্যাপী কলা চাষে যথেষ্ট ক্ষতি করে থাকে। পূর্বে অমৃতসাগর কলাতেই এর আক্রমণের হার সর্বাধিক হত। তবে বর্তমানে প্রায় সব জাতের কলাতেই এ পোকার প্রাদুর্ভাব দেখা যায়। বিশেষত: বর্ষা মৌসুমে কোন ধরনের দমন ব্যবস্থা গ্রহণ না করলে শতকরা ১০০ ভাগ পর্যন্ত কলা এ পোকার দ্বারা আক্রান্ত হতে পারে। তবে শুষ্ক মৌসুম বা শীতকালে আক্রামণের হার বেশ কম হতে দেখা যায়। কারণ উক্ত সময় বেশীর ভাগ পোকা কীড়া অবস্থায় মাটির নীচে শীতনিদ্রা যায়। কলার মুড়ি ফসলে আক্রমণের হার সর্বাধিক হয়ে থাকে।<br>" +
            "<b> দমন ব্যবস্থাপনা:</b> কীটতত্ত্ব বিভাগ, বারি কর্তৃক উদ্ভাবিত নিম্নোক্ত আইপিএম পদ্ধতি ব্যবহারের মাধ্যমে উপরোক্ত পোকা সহজে পরিবেশসম্মতভাবে দমন করা সম্ভব:<br>" +
            "ক) পর্যায়ক্রমিক ফসলের চাষ: যে সমস্ত বাগানে পোকার আক্রমণ হার অত্যন্ত বেশী সেখানে পরবর্তী বছর জমি উত্তমরুপে চাষ করে অন্য ফসল আবাদ করা একান্ত বাঞ্ছনীয়। তৃতীয় বছর উক্ত জমিতে পুনরায় কলা চাষ করা যেতে পারে।<br>" +
            "খ) পলিথিন ব্যাগিং: কলার মোচা বের হওয়ার সাথে সাথে ও ছড়িতে কলা বের হওয়ার পূর্বেই ১০৫ সে:মি: লম্বা ও ৭৫সে:মি: প্রস্থের দু’মুখ খোলা একটি পলিথিন ব্যাগের একমুখ মোচার ভিতর ঢুকিয়ে বেঁধে দিতে হবে, অন্য মুখ খোলা রাখতে হবে। বাতাস চলাচলের জন্য পলিথিন ব্যাগটিতে ২০-৩০টি ছোট ছোট ছিদ্র রাখা বাঞ্ছনীয়। পলিথিন ব্যাগিং দ্বারা এ পোকা দমন অত্যন্ত কার্যকরী ও নিরাপদ বলে প্রতীয়মান হয়েছে।<br>" +
            "গ) কীটনাশক দ্বারা পোকা দমন: মোচা বের হওয়ার ৫দিন আগে একবার, মোচা বের হওয়ার সাথে সাথে একবার, ছড়িতে প্রথম কলা বের হওয়ার পর একবার এবং সম্পূর্ণ কলা বের হওয়ার পর আরো একবার, মোট চারবার অনুমোদিত কীটনাশক স্প্রে করলে এই পোকা দমন সম্ভব। কীটনাশক, ডায়াজিনন ৬০ইসি (প্রতি লিটার পানিতে ২ মি:লি) বা সেভিন ৮৫ ডাব্লিওপি (প্রতি লিটার পানিতে ১.৫ গ্রাম) বা মিপসিন ৭৫ ডাব্লিও পি (প্রতি লিটার পানিতে ১ গ্রাম) স্প্রে করে ভাল ফল পাওয়া যায়।<br>" +
            "<center><img src=\"file:///android_res/drawable/kola1.gif\" width=\"150\" height=\"100\" /></center><br>" +
            "<center>বিটল আক্রান্ত কলা</center><br>"+
            "<center><img src=\"file:///android_res/drawable/kola2.gif\" width=\"150\" height=\"100\" /></center><br>" +
            "<center>পূর্ণাঙ্গ বিটল পোকা</center>"+
            "<center><img src=\"file:///android_res/drawable/kola3.gif\" width=\"150\" height=\"100\" /></center><br>" +
            "<center>কলার কাঁদির পলিথিন ব্যাগিং</center><br>"+
            "<center><img src=\"file:///android_res/drawable/kola4.gif\" width=\"150\" height=\"100\" /></center><br>" +
            "<center>পোকামুক্ত কলার কাঁদি</center>"+
            "</big></body></html>";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button2_kit_kola_diseases);


        textView=(TextView) findViewById(R.id.textViewId);
        webView=(WebView) findViewById(R.id.webViewId);

        webView.loadDataWithBaseURL(null, myText, "text/html", "utf-8", null);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity_button2_kit_kola_diseases.this,Button5Activity.class);
                startActivity(intent);
            }
        });
    }
}
