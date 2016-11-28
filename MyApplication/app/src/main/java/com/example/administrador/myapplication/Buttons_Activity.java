package com.example.administrador.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class Buttons_Activity extends AppCompatActivity {
    int vecesOn = 0;
    int vecesOff = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttons_);

        final ToggleButton toggleButton = (ToggleButton) findViewById(R.id.toggleButton);
        final TextView textView = (TextView) findViewById(R.id.textView);
        final TextView textView2 = (TextView) findViewById(R.id.textView4);

        toggleButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(toggleButton.isChecked()){
                    vecesOn++;
                    textView.setText(("Botón encendido "+vecesOn + "veces"));
                }else{
                    vecesOff++;
                    textView2.setText(("Botón apagado "+vecesOff+ "veces"));
                }
            }
        });
        vecesOn = 0;
        vecesOff = 0;
        final Switch buttonSwitch = (Switch) findViewById(R.id.switch1);
        final TextView text1 = (TextView) findViewById(R.id.textView5);
        final TextView text2 = (TextView) findViewById(R.id.textView6);

        buttonSwitch.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(buttonSwitch.isChecked()){
                    vecesOn++;
                    text1.setText(("Botón encendido "+vecesOn + "veces"));
                }else{
                    vecesOff++;
                    text2.setText(("Botón encendido "+vecesOn + "veces"));
                }
            }
        });
    }
}
