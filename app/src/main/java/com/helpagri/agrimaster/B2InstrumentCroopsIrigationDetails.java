package com.helpagri.agrimaster;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;

public class B2InstrumentCroopsIrigationDetails extends AppCompatActivity {

    private TextView textView;
    private WebView webView;

    String myText="<html><body><center><h1> প্রযুক্তির বিবরণ </h1></center>" +
            "<big>প্রযুক্তির নাম :<b> শক্তি চালিত শস্য মাড়াই যন্ত্র </b><br/><br/>" +
            "<b>বিস্তারিত বিবরণ :</b><br/>" +
            "বাংলাদেশের সব এলাকায় সাধারণত কৃষক ধান কাটার পর হাতে পিটিয়ে বা গরুর সাহায্যে (মলন) মাড়াই করে থাকে। এতে অনেক বেশি শ্রমিক লাগে বলে মাড়াই খরচ বেড়ে যায়। বৃষ্টির সময় সনাতন পদ্ধতিতে মাড়াই করা যায় না বলে প্রচুর ধান ও গম নষ্ট হয় এবং গুণগতমান কমে যায়। ফলে বাজার মূল্য হ্রাস পায়। দেশে ধান ও গমের উৎপাদন আগের তুলনায় অনেক বেড়ে গেছে। ফলে সনাতন পদ্ধতিতে বা পা-চালিত মাড়াই যন্ত্র দিয়ে মাড়াই করা দুরুহ হয়ে পড়েছে। সেজন্য শক্তি চালিত শস্য মাড়াই যন্ত্র উদ্ভাবন করা হয়েছে।<br/>" +
            "<b>বৈশিষ্ট্যসমূহ :</b><br/>" +
            "১। এ য্ন্ত্র দিয়ে ধান, গম এ ডাল শস্য মাড়াই করা যায়। <br/>" +
            "২। এ যন্ত্রটি দিয়ে ৫০-৭০ সেমি দৈর্ধ্যের শস্য মাড়াইয়ে অপেক্ষাকৃত ভাল ফল পাওয়া যায়। <br/>" +
            "৩। কম আর্দ্রতা সম্পন্ন ফসল মাড়াইয়ে ব্যবহার করলে যন্ত্রটির মাড়াই ক্ষমতা বৃদ্ধি পায়।<br/>" +
            "৪। যন্ত্রটি উচ্চ মাত্রায় শ্রম এবং অর্থ সাশ্রয়ী।<br/>" +
            "৫। মাড়াই ক্ষমতা পা-চালিত মাড়াই যন্ত্রের চেয়ে প্রায় ৮ গুণ বেশি।<br/>" +
            "৬। যন্ত্রটি প্রতি ঘন্টায় ৯৩০ কেজি ধান ও ৩৪০ কেজি গম মাড়াই করতে পারে।<br/>" +
            "৭। যন্ত্রটির বাজার মূল্য ৩৬,০০০ টাকা (ইঞ্জিন/মটর ছাড়া)।<br/>" +
            "<center><img src=\"file:///android_res/drawable/powermachine.gif\" width=\"150\" height=\"100\" /></center>" +
            "</big></body></html>";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b2_instrument_croops_irigation_details);

        textView = (TextView) findViewById(R.id.textViewId);
        webView = (WebView) findViewById(R.id.webViewId);
        webView.loadDataWithBaseURL(null,myText,"text/html","utf-8",null);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(B2InstrumentCroopsIrigationDetails.this,Button5Activity.class);
                startActivity(intent);
            }
        });
    }
}
