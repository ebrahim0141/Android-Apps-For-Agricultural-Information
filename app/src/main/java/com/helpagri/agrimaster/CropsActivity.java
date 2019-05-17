package com.helpagri.agrimaster;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.TextView;

public class CropsActivity extends AppCompatActivity {

    private TextView textView;
    private WebView webView;
    String myText="<html><body><center><h1>প্রযুক্তির বিবরণ</h1></center>" +
            "<big>প্রযুক্তির নাম :<b>ডাবের পানি সংরক্ষণ</b><br/><br/>" +
            "<b>বিস্তারিত বিবরণ :</b><br/>" +
            "নারিকেল বাংলাদেশের অন্যতম প্রধান অর্থকরী ফসল হিসেবে পরিচিত। দেশের প্রায় সব জেলাতেই এটি জন্মায়, তবে দক্ষিণাঞ্চলে বিশেষ করে উপকূলীয় জেলাসমূহে এর উৎপাদন বেশি। বাংলাদেশে উৎপাদিত মোট নারিকেলের শতকরা ৩০-৪০ভাগ কচি ডাব হিসেবে ব্যবহৃত হয়। কচি ডাবের শাঁসে স্নেহ ও খনিজ জাতীয় পর্দাথের পরিমাণ বেশি থাকে। খনিজ পদার্থের মধ্যে যথেষ্ট পরিমাণে পটাসিয়াম, সোডিয়াম ও ফসফরাস থাকে। মূলত কচি ডাবের ভিতরের তরল পদার্থই ডাবের পানি হিসেবে পরিচিত। এই পানি ৯৯ ভাগ চর্বিমুক্ত এবং কম ক্যালরিযুক্ত। প্রচলিতভাবে উন্নত দেশের ডাবের পানি কোমল ও সতেজ পানীয় হিসেবে ব্যবহার করা হয়ে থাকে। আমাদের দেশে গ্রীষ্মকালে এর চাহিদা ব্যাপক। কচি ডাবের পানি শরীরকে ঠান্ডা ও দেহের তাপমাত্রা ঠিক রাখে। এ ছাড়াও ডায়েরিয়ায় আক্রান্ত, বয়স্ক এবং বৃদ্ধ লোকের জন্য ডাবের পানি খুবই কার্যকর। আমাদের দেশে প্রক্রিয়াজাতকৃত ডাবের পানির বাণিজ্যিক চাহিদা আছে। ডাবের পানি প্রক্রিয়াজাত করার জন্য প্রথমে ভালমানের কচি ডাব সংগ্রহ করে পরিস্কার পানিতে দৌত করতে হয়। অতঃপর ডাব থেকে পানি বের করে মসৃণ কাপড়ে ছেকে নিতে হবে যাতে কোন আঁশ বা শাঁস না থাকে। এখন পরিস্কার ডাবের পানি একটি কাঁচের বিকার বা কনটেইনারে নিয়ে ৯৫-১০০০ সেন্টিগ্রেড তাপমাত্রায় ১০ মিটিন ওয়াটার বাথে রেখে পাস্তুরাইজেশন করেত হবে। পাস্তুরাইজেশনকৃত ডাবের পানির সাথে ১০০পিপিএম পটাসিয়াম মেটাবাইসালফাইট এবং ০.০৫% কার্বক্সিমিথাইল সেলুলোজ যোগ করতে হবে যাতে কোন অবশিষ্টাংশ বা দ্রব্যাদি বোতলের নিচে পড়ে না থাকে। পরিশেষে গরম পানিতে ফুটানো কাঁচের বোতলে গরম অবস্থায় ডাবের পানি ভর্তি করে স্বাভাবিক তাপমাত্রায় শুষ্ক ঠান্ডা জায়গায় সংরক্ষণ করা হয়। এই প্রক্রিয়ায় ডাবের পানি প্রায় ৬-৮ মাস সহজে সংরক্ষণ করা যায়<br>"+
            "<center><img src=\"file:///android_res/drawable/coconautwater.gif\" width=\"150\" height=\"100\" /></center><br>" +
            "<center>ডাবের পানি সংরক্ষণ</center>"+
            "</big></body></html>";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crops);

        textView=(TextView) findViewById(R.id.textViewId);
        webView=(WebView) findViewById(R.id.webViewId);

        webView.loadDataWithBaseURL(null, myText, "text/html", "utf-8", null);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CropsActivity.this,Button5Activity.class);
                startActivity(intent);
            }
        });
    }
}
