package com.example.administrador.myapplication;

import android.app.ProgressDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;

import cz.msebera.android.httpclient.Header;

public class Async_Activity extends AppCompatActivity {

    private TextView textView;
    private ProgressDialog dialog = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_async_);

        Button conect = (Button) findViewById(R.id.conectar);
        Button conectLib = (Button) findViewById(R.id.conectarLib);
        textView = (TextView) findViewById(R.id.response);

        conect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Task task = new Task(Async_Activity.this);
                task.execute();
            }
        });

        conectLib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RequestParams params = new RequestParams();
                params.put("","");
                params.put("north","44.1");
                params.put("south","9.9");
                params.put("east","22.4");
                params.put("west","55.2");
                params.put("lang","de");
                params.put("username","demo");

                Async.get(Async_Activity.this, "http://api.geonames.org/citiesJSON", params, false, new AsyncHttpResponseHandler() {
                    @Override
                    public void onStart() {
                        super.onStart();
                        dialog = new ProgressDialog(Async_Activity.this);
                        dialog.setMessage("Conectando...");
                        dialog.setCancelable(false);
                        dialog.show();
                    }

                    @Override
                    public void onSuccess(int statusCode, Header[] headers, byte[] responseBody) {
                        String response = new String(responseBody);
                        writeResponse(response);
                        if(dialog.isShowing()){
                            dialog.dismiss();

                        }
                    }

                    @Override
                    public void onFailure(int statusCode, Header[] headers, byte[] responseBody, Throwable error) {

                    }
                });

            }
        });

    }

    public void writeResponse(String response) {
        textView.setText(response);
    }
}
