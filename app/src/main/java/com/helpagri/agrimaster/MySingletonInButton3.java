package com.helpagri.agrimaster;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

public class MySingletonInButton3 {

    private static MySingletonInButton3 mInsatance;
    private RequestQueue requestQueue;
    private static Context mCtx;


    private MySingletonInButton3(Context context)
    {
        mCtx = context;
        requestQueue = getRequestQueue();

    }

    public static synchronized MySingletonInButton3 getInstance(Context context)
    {
        if(mInsatance==null)
        {
            mInsatance = new MySingletonInButton3(context);
        }
        return mInsatance;
    }

    public RequestQueue getRequestQueue() {

        if(requestQueue==null)
        {
            requestQueue = Volley.newRequestQueue(mCtx.getApplicationContext());
        }
        return requestQueue;
    }

    public <T>void addTorequestque(Request<T> request)
    {
        requestQueue.add(request);
    }

}
