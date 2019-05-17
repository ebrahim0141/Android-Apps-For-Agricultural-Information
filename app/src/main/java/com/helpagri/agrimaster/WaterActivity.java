package com.helpagri.agrimaster;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;

public class WaterActivity extends AppCompatActivity {


    private TextView textView;
    private WebView webView;
    String myText="<html><body><center><h1>প্রযুক্তির বিবরণ</h1></center>" +
            "<big>প্রযুক্তির নাম :<b>কাঁঠাল চাষে সেচ পদ্ধতি</b><br/><br/>" +
            "<b>বিস্তারিত বিবরণ :</b><br/>" +
            "কাঁঠাল বাংলাদেশের জাতীয় ফল। বাংলাদেশের সব জেলাতেই কাঁঠালের চাষ হয়। বর্তমানে বাংলাদেশে কাঁঠালের মোট উৎপাদন প্রায় ৯.৭৫ লক্ষ মেট্রিক টন। কাঁঠাল সাধারণত ভাল নিষ্কাশনযুক্ত মাটিতে ভাল হয়। ইহা একদিকে যেমন জলাবদ্ধতা সহ্য করতে পারে না, অন্যদিকে মাটিতে রসের ঘাটতি হলেও ভাল ফলন দেয় না। কাঁঠাল গ্রীষ্মকালীন ফল বিধায় ইহা শুষ্ক আবহাওয়ার সময়ই চাষাবাদ করা হয়। সাধারণত এ সময়ে বৃষ্টিপাত হয় না বললেই চলে। আমাদের দেশের কৃষকেরা সাধারণত কাঁঠাল গাছে সেচ প্রদান করে না। সে কারণে ফুল আসার সময় হতে ফল ধরা বা বৃদ্ধি পর্যায়ে মাটিতে পরিমিত রস না থাকার কারণে কাঁঠালের উৎপাদন দারুণভাবে ব্যাহত হয়। বিগত ৪-৫ বৎসর যাবত গাজীপুর জেলার শ্রীপুর এলাকায় গবেষণার মাধ্যমে দেখা যায়, প্রতি বৎসর অক্টোবর মাসে একবার সার প্রয়োগসহ ফূল আসার সময় হতে ফল পাকার সময় পর্যন্ত প্রতি ১৫ দিন অন্তর সেচ দিলে সেচবিহীন গাছের চেয়ে ৩.০-৩.৫ গুণ ফলন বেশি হয়।<br>" +
            "<b>সারের ব্যবহার</b><br>" +
            "অক্টোবর মাসে নিম্নোক্ত হারে সার প্রদান করে একটি স্বাভাবিক সেচ দিতে হয়। প্রতিটি ফলন্ত গাছের জন্য সারের মাত্রা নিম্নরূপ:<br>" +
            " <table border = \"1\">" +
            "         <tr>" +
            "            <td><b>সারের নাম</b></td>" +
            "            <td><b>পরিমাণ/গাছ প্রতি</b></td>" +
            "         </tr>" +
            "         <tr>" +
            "            <td>গোবর/কম্পোস্ট</td>" +
            "            <td>৩০কেজি</td>" +
            "         </tr>" +
            "         <tr>" +
            "            <td>ইউরিয়া</td>" +
            "            <td>১০০০-১১০০গ্রাম</td>" +
            "         </tr>" +
            "         <tr>" +
            "            <td>টিএসপি</td>" +
            "            <td>১৫০০গ্রাম</td>" +
            "         </tr>" +
            "         <tr>" +
            "            <td>এমওপি</td>" +
            "            <td>১০০০-১১০০গ্রাম</td>" +
            "         </tr>" +
            "         <tr>" +
            "            <td>জিপসাম</td>" +
            "            <td>২৫০গ্রাম</td>" +
            "         </tr>" +
            "      </table>" +
            "<br/>" +
            "গাছের গোড়া থেকে ২-২.৫ মিটার দূরে বৃত্তাকার আকারে ডিবলিং পদ্ধতিতে (গর্ত করে) এ সার প্রয়োগ করলে ভাল হয়। এতে শিকড়ের কোন ক্ষতি হয় না।<br>" +
            "<b>সেচ প্রয়োগ :</b>গাছের গোড়া হতে ২ থেকে ৩ মিটার দূরে বৃত্তাকার বেসিন তৈরি করে পানি প্রয়োগ করতে হয়। গভীর বা হস্তাচালিত নলকূপ হতে পলিথিন হুস পাইপের সাহায্যে পানি বৃত্তাকার বেসিনে প্রয়োগ করাই উত্তম। সেচ এমনভাবে প্রয়োগ করতে হয় যেন শিকড়ের ১মি গভীর পর্যন্ত মাটি ভালভাবে ভেজে। অতিরিক্ত সেচের দরুন ৫-৭ ঘন্টার বেশি সময় যেন গাছের গোড়ায় জলাবদ্ধতা না থাকে সেদিকে খেয়াল রাখতে হবে।<br>" +
            "<b>সেচ প্রয়োগে ফলনের প্রভাব :</b> গবেষণার ফলাফলে দেখা গেছে, গাছে ফুল আসা হতে শুরু করে ফল পাকা পর্যন্ত প্রতি ১৫ দিন অন্তর সেচ দিলে সেচেবিহীন গাছের তুলনায় প্রায় ৩.০-৩.৫ গুণ ফলন বেশি পাওয়া যায়। শুধুমাত্র ফুল আসার সময় এবং ফল ধরার সময় ২ বার সেচ প্রয়োগ করলেও সেচবিহীন গাছের চেয়ে প্রায় ২ গুণ ফলন বেশি পাওয়া সম্ভব।<br>" +
            "<center><img src=\"file:///android_res/drawable/kathal1.gif\" width=\"150\" height=\"100\" /></center><br>" +
            "<center>সেচবিহীন কাঁঠাল গাছ-১</center><br>"+
            "<center><img src=\"file:///android_res/drawable/kathal2.gif\" width=\"150\" height=\"100\" /></center><br>" +
            "<center>সেচকৃত কাঁঠাল গাছ-২</center>"+
            "</big></body></html>";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_water);

        textView=(TextView) findViewById(R.id.textViewId);
        webView=(WebView) findViewById(R.id.webViewId);

        webView.loadDataWithBaseURL(null, myText, "text/html", "utf-8", null);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WaterActivity.this,Button5Activity.class);
                startActivity(intent);
            }
        });
    }
}
