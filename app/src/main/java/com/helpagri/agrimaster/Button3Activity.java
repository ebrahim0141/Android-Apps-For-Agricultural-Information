package com.helpagri.agrimaster;

import android.content.DialogInterface;
import android.support.annotation.NonNull;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Button3Activity extends AppCompatActivity {

    Button button;
    EditText Name,Email,Mobile_Num,Occupation,Subject,DetailsExp;
    String server_url = "http://192.168.1.103/update_info.php";
    AlertDialog.Builder builder;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button3);

        button = (Button) findViewById(R.id.bn);
        Name = (EditText) findViewById(R.id.name);
        Email = (EditText) findViewById(R.id.email);
        Mobile_Num = (EditText) findViewById(R.id.mobile_num);
        Occupation = (EditText) findViewById(R.id.occupation);
        Subject = (EditText) findViewById(R.id.subject);
        DetailsExp = (EditText) findViewById(R.id.detailsExp);
        builder = new AlertDialog.Builder(Button3Activity.this);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final String name,email,mobile_number,ocupation,subject,details;
                name = Name.getText().toString();
                email = Email.getText().toString();
                mobile_number = Mobile_Num.getText().toString();
                ocupation = Occupation.getText().toString();
                subject = Subject.getText().toString();
                details = DetailsExp.getText().toString();
                StringRequest stringRequest = new StringRequest(Request.Method.POST, server_url,
                        new Response.Listener<String>() {
                            @Override
                            public void onResponse(String response) {
                                builder.setTitle("Server Response");
                                builder.setMessage("আপনার প্রশ্নটি পেয়েছি বিশেষজ্ঞের মতামত পাওয়া মাত্রই উত্তর পাবেন। ");
                                builder.setPositiveButton("ok", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        Name.setText("");
                                        Email.setText("");
                                        Mobile_Num.setText("");
                                        Occupation.setText("");
                                        Subject.setText("");
                                        DetailsExp.setText("");
                                    }
                                });
                                AlertDialog alertDialog = builder.create();
                                alertDialog.show();

                            }
                        }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Toast.makeText(Button3Activity.this, "Error..", Toast.LENGTH_SHORT).show();
                        error.printStackTrace();
                    }

                }) {

                    @Override
                    protected Map<String, String> getParams() throws AuthFailureError {
                        Map<String, String> params = new HashMap<String, String>();
                        params.put("name", name);
                        params.put("email", email);
                        params.put("mobile_number", mobile_number);
                        params.put("ocupation", ocupation);
                        params.put("subject", subject);
                        params.put("details", details);
                        return params;

                    }
                };

                MySingletonInButton3.getInstance(Button3Activity.this).addTorequestque(stringRequest);

            }
        });
    }
}
