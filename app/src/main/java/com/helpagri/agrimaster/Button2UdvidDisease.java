package com.helpagri.agrimaster;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;

public class Button2UdvidDisease extends AppCompatActivity {

    private TextView textView;
    private WebView webView;
    String myText = "<html><body><center><h1>প্রযুক্তির বিবরণ</h1></center>" +
            "<big>প্রযুক্তির নাম :<b>কলার পানামা রোগ</b><br/><br/>" +
            "<b>বিস্তারিত বিবরণ :</b><br/>" +
            "সনাক্তকারী বৈশিষ্ট্য :<br>" +
            "• নীচের পাতার কিনারা হলুদ হয় ও পত্রফলক পত্রবৃন্ত থেকে ভেঙ্গে ঝুলে পড়ে।<br>" +
            "• কোন কোন সময় গাছ লম্বালম্বিভাবে ফেটেও যেতে পারে এবং ভুয়াকান্ডের ভিতরের অংশ হলদে বাদামী রং ধারণ করে। গাছ ফলন ক্ষমতা হারিয়ে ফেলে ও মারা যায়।<br>" +
            "<b>দমন ব্যবস্থাপনা :</b><br>" +
            "রোগমুক্ত চারা ব্যবহার করতে হবে। কলার জমিতে পানি নিষ্কাশনের সুব্যবস্থা রাখাতে হবে। চারা লাগানোর পূর্বে অটোস্টিন(২.৫ গ্রাম/লিটার হারে) দিয়ে চারা শোধন করতে হবে। এই রোগে আক্রান্ত জমিতে পরবর্তি ৩-৪ বছর কলা চাষ করা যাবে না।<br>" +
            "<center><img src=\"file:///android_res/drawable/kola.gif\" width=\"150\" height=\"100\" /></center><br/>" +
            "</big></body></html>";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button2_udvid_disease);

        textView = (TextView) findViewById(R.id.textViewId);
        webView = (WebView) findViewById(R.id.webViewId);

        webView.loadDataWithBaseURL(null, myText, "text/html", "utf-8", null);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Button2UdvidDisease.this, Button5Activity.class);
                startActivity(intent);
            }
        });
    }
}

