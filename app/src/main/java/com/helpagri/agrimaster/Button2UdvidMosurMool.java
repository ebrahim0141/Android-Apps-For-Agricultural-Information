package com.helpagri.agrimaster;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;

public class Button2UdvidMosurMool extends AppCompatActivity {


    private TextView textView;
    private WebView webView;
    String myText="<html><body><center><h1>প্রযুক্তির বিবরণ</h1></center>" +
            "<big>প্রযুক্তির নাম :<b>মসুরের গোড়া পচা রোগ</b><br/><br/>" +
            "<b>বিস্তারিত বিবরণ :</b><br/>" +
            "সনাক্তকারী বৈশিষ্ট্য :<br>" +
            "• এ রোগ গাছের চারা বয়সে বেশী সংক্রামিত হয়।<br>"+
            "• চারা অবস্থায় এ রোগ হলে গাছ হঠাৎকরে মারা যায়।<br>" +
            "• বয়স্ক গাছ আক্রান্ত হলে গাছের পাতা ক্রমান্বয়ে হলুদ রং ধারণ করে, গাছ ঢলে পড়ে ও শুকিয়ে যায়।<br>" +
            "• মাটি ভেঁজা থাকলে গাছের গোড়ায় ছএাকের সাদা মাইসেলিয়াম ও সরিষার দানার ন্যায় স্কেলেরোসিয়াম দেখা যায়।<br> " +
            "<b>দমন ব্যবস্থাঃ</b><br>" +
            "আংশিক পচাঁ মুরগীর বিষ্ঠা ৫ টন/হেঃ হারে বীজ বপনের কমপক্ষে ২১ দিন পূর্বে প্রয়োগ করে মাটির সাথে ভালভাবে পচাঁতে হবে। অতঃপর প্রোভেক্স (প্রতি কেজি বীজে ২.৫ গ্রাম হারে) নামক ছত্রাকনাশক মিশিয়ে বীজ শোধন করে বীজ বপন করতে হবে। চারা গাজানোর ২০-২৫ দিন পর একবার এবং ৩৫-৪০ দিন পর দ্বিতীয় বার প্রোভেক্স নামক ছত্রাকনাশক ২ গ্রাম প্রতি লিটার পানিতে মিশিয়ে গাছের গোড়ায় মাটি ভালভাবে ভিজিয়ে দিতে হবে। ফসলের পরিত্যক্ত অংশ পুড়িয়ে ফেলতে হবে।"+
            "</big></body></html>";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button2_udvid_mosur_mool);

        textView=(TextView) findViewById(R.id.textViewId);
        webView=(WebView) findViewById(R.id.webViewId);

        webView.loadDataWithBaseURL(null, myText, "text/html", "utf-8", null);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Button2UdvidMosurMool.this,Button5Activity.class);
                startActivity(intent);
            }
        });
    }
}

