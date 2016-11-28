package com.example.administrador.myapplication;

import android.net.Uri;
import android.os.AsyncTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Administrador on 23/11/2016.
 */

public class Task extends AsyncTask<Void,Void,String> {

    private final Async_Activity activity;

    public Task(Async_Activity activity) {
        this.activity = activity;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected void onPostExecute(String response) {
        super.onPostExecute(response);
        if(response != null){
            activity.writeResponse(response);
        }

    }

    @Override
    protected String doInBackground(Void... params) {
        HttpURLConnection urlConnection = null;
        BufferedReader reader = null;
        String response;

        Uri uri = Uri.parse("http://api.geonames.org/citiesJSON").buildUpon()
                .appendQueryParameter("north","44.1")
                .appendQueryParameter("south","9.9")
                .appendQueryParameter("east","22.4")
                .appendQueryParameter("west","55.2")
                .appendQueryParameter("lang","de")
                .appendQueryParameter("username","demo")
                .build();

        try {
            URL url = new URL(uri.toString());

            urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setRequestMethod("GET");
            urlConnection.connect();

            InputStream input = urlConnection.getInputStream();
            StringBuffer buffer = new StringBuffer();
            if(input == null){
                return null;
            }
            reader = new BufferedReader(new InputStreamReader(input));
            String line;
            while((line = reader.readLine()) != null){
                buffer.append(line +"\n");
            }

            if(buffer.length() == 0){
                return null;
            }

            response = buffer.toString();
            return response;

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
