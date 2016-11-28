package com.example.administrador.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class RadioButton_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio_button_);

        RadioGroup group = (RadioGroup) findViewById(R.id.radioGroup);
        final TextView text = (TextView) findViewById(R.id.textView7);
        group.check(R.id.radioButton2);
        //group.clearCheck();
        int id = group.getCheckedRadioButtonId();//Devuelve cuál está marcado. Si no -1

        group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                text.setText("El seleccionado es "+ checkedId);
                if(checkedId == R.id.radioButton2){
                    text.setText("Opción2");
                }
            }
        });

    }
}
