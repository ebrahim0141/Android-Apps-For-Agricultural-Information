package com.helpagri.agrimaster;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;

public class B2InstrumentFallShudonDetails extends AppCompatActivity {

    private TextView textView;
    private WebView webView;

    String myText="<html><body><center><h1>প্রযুক্তির বিবরণ</h1></center>" +
            "<big>প্রযুক্তির নাম :<b>ফল শোধন যন্ত্র</b><br/><br/>" +
            "<b>বিস্তারিত বিবরণ :</b><br/>" +
            "বাংলাদেশে প্রচুর পরিমাণে ফল উৎপন্ন হয়। প্রধান ফলের মধ্যে আম, কলা, পেঁপে, পেয়ারা, কাঁঠালও আনারস ইত্যাদি রয়েছে। এফলগুলোর জীবনকাল খুব কম ও উচ্চ পচনশীল। যেমন আম ও কলা এ্যানথ্রাকনোস রোগের মাধ্যমে দ্রুত নষ্ট হয়ে যায়।পাকা আম ৭/৮দিনের বেশী স্বাভাবিক অবস্থায় রাখা যায় না।তদ্রুপ পাকা কলা ৬/৭ দিনের বেশী রাখা যায় না।তাই, আমাদের দেশে সংগ্রহোত্তর অপচয় ২০–৩০%। এ অপচয়রোধে অনেক সময় রাসায়নিক দ্রব্য ব্যবহার করা হয় যা স্বাস্থ্য বা পরিবেশের জন্য ক্ষতিকর। পরিপক্ক ফলের জীবনকাল বাড়ানোর ও অপচয় কমানোর জন্য রাসায়নিক দ্রব্য ছাড়া গরম পানিতে শোধন করে ফলের জীবনকাল বৃদ্ধি করে এর অপচয় কমানো যায়। এ লক্ষ্যে ফল শোধন যন্ত্রটি উদ্ভাবন করা হয়েছে।<br/>" +
            "<b>বৈশিষ্ট্যসমূহঃ</b><br/>" +
            "১।বড় আকারের ফল শোধন যন্ত্রে ২কিলোওয়াটের ১০টি বৈদ্যুতিক হিটারের মাধ্যম পানিকে গরম করা হয় <br/>" +
            "২।ছোট আকারের ফলশোধন যন্ত্রে ২কিলোওয়াটের ৬টি বৈদ্যুতিক হিটারের মাধ্যম পানিকে গরম করা হয় <br/>" +
            "৩।তাপমাত্রা নিয়ন্ত্রণের জন্য ডিজিটাল তাপমাত্রা নিয়ন্ত্রক ব্যবহার করা হয়েছে <br/>" +
            "৪।ফল ভর্তি প্লাস্টিক ক্রেট বহনের জন্য মটর চালিত কনভেয়ার রোলার ব্যবহার করা হয়েছে <br/>" +
            "৫।যন্ত্রটি দিয়ে নিরবচ্ছিন্ন ভাবে আম শোধন করা যায় <br/>" +
            "৬।যন্ত্রটি চালানোর জন্য ৪ জন শ্রমিকের প্রয়োজন হয়<br/>" +
            "৭। এ য্ন্ত্র দিয়ে আমকে সুষমভাবে ৫৩ – ৫৫ ডিগ্রি সেলসিয়াস তাপমাত্রার পানিতে ৫–৭ মিনিট ডুবিয়ে শোধন করা হয় <br/>" +
            "৮।এ য্ন্ত্র দিয়ে কলাকে সুষমভাবে ৫৩–৫৫ ডিগ্রি সেলসিয়াস তাপমাত্রায় পানিতে ৫–৯মিনিট ডুবিয়ে শোধন করা হয়<br/>" +
            "৯।শোধনকৃত আম ৭–৮দিনের পরিবর্তে ১০–১২ দিন পর্যন্ত টাটকা থাকে এবং গায়ের রং উজ্জ্বল হয়<br/>" +
            "১০।শোধনকৃত কলা ৬–৭ দিনের পরিবর্তে ৮–১০ দিন পর্যন্ত টাটকা থাকে এবং গায়ের রং উজ্জ্বল হয় <br/>" +
            "১১। কার্যক্ষমতা –আমের জন্যঃ ১০০০ কেজি/ঘন্টা (বড়যন্ত্র); ৫০০ কেজি/ঘন্টা (ছোটযন্ত্র)<br/>" +
            "কলার জন্যঃ ৬০০ কেজি/ঘন্টা (বড়যন্ত্র); ৩০০ কেজি/ঘন্টা (ছোটযন্ত্র)<br/>" +
            "১২। শোধন খরচ –আমের জন্যঃ ০.৩১ টাকা/কেজি (বড়যন্ত্র); ৫০০ টাকা/কেজি (ছোটযন্ত্র)<br/>" +
            "কলার জন্যঃ ০.৩৮ টাকা/কেজি (বড়যন্ত্র); ০.৬৩ টাকা/কেজি (ছোটযন্ত্র)<br/>" +
            "১৩। যন্ত্রটির বাজার মূল্য : ১,৫০,০০০ টাকা (বড়যন্ত্র); ১,০০,০০০ টাকা (ছোটযন্ত্র)<br/>" +
            "<center><img src=\"file:///android_res/drawable/fruit.gif\" width=\"150\" height=\"100\" /></center>" +
            "</big></body></html>";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b2_instrument_fall_shudon_details);

        textView = (TextView) findViewById(R.id.textViewId);
        webView = (WebView) findViewById(R.id.webViewId);
        webView.loadDataWithBaseURL(null,myText,"text/html","utf-8",null);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(B2InstrumentFallShudonDetails.this,Button5Activity.class);
                startActivity(intent);
            }
        });
    }
}
