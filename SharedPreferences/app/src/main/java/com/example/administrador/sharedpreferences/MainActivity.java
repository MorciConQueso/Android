package com.example.administrador.sharedpreferences;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editText = (EditText) findViewById(R.id.editText);
        Button button = (Button) findViewById(R.id.button);
        TextView textView = (TextView) findViewById(R.id.textView);

        final SharedPreferences prefenrences = getSharedPreferences("preferencias", Context.MODE_PRIVATE);
        String valor = prefenrences.getString("name","Inserte nombre");
        textView.setText(valor);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String valor = editText.getText().toString();
                SharedPreferences.Editor editor = prefenrences.edit();
                editor.putString("name",valor);
                editor.commit();

            }
        });

        Button butonActivity = (Button) findViewById(R.id.Actividad);
        butonActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Ejercicio.class);
                startActivity(intent);
            }
        });

    }
}
