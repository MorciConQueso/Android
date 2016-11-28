package com.example.administrador.myapplication;

import android.content.Context;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;

/**
 * Created by Administrador on 23/11/2016.
 */

public class Async {
    private static AsyncHttpClient client = new AsyncHttpClient();
    private static  final int TIMEOUT = 60000;

    public static void get(Context context, String url, RequestParams params, boolean requiredAuth, AsyncHttpResponseHandler responseHandler){
        client.setTimeout(TIMEOUT);
        client.get(url,params,responseHandler);

    }



}
