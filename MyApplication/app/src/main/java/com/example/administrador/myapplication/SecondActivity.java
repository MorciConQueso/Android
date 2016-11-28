package com.example.administrador.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.d("SecondActivity","onCreate");

        Button buttonTextView = (Button) findViewById(R.id.button_textView);
        buttonTextView.setText(getResources().getString(R.string.textview));
        buttonTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this,TextView_Activity.class);
                startActivity(intent);
            }
        });

        Button buttonEditText = (Button) findViewById(R.id.button_editText);
        buttonEditText.setText(getResources().getString(R.string.edittext));
        buttonEditText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this,EditText_Activity.class);
                startActivity(intent);
            }
        });

        Button buttonCheckBox = (Button) findViewById(R.id.button_checkBox);
        buttonCheckBox.setText(getResources().getString(R.string.checkbox));
        buttonCheckBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this,CheckBox_Activity.class);
                startActivity(intent);
            }
        });

        Button buttonRadioButton = (Button) findViewById(R.id.button_radioButton);
        buttonRadioButton.setText(getResources().getString(R.string.radiobutton));
        buttonRadioButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this,RadioButton_Activity.class);
                startActivity(intent);
            }
        });

        Button buttonSpannable = (Button) findViewById(R.id.button_spannable);
        buttonSpannable.setText(getResources().getString(R.string.objeto_spannable));
        buttonSpannable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this,Spannable_Activity.class);
                startActivity(intent);
            }
        });

        Button buttonButtons = (Button) findViewById(R.id.button_buttons);
        buttonButtons.setText(getResources().getString(R.string.buttons));
        buttonButtons.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this,Buttons_Activity.class);
                startActivity(intent);
            }
        });

        Button buttonImageView = (Button) findViewById(R.id.button_imageView);
        buttonImageView.setText(getResources().getString(R.string.imageview));
        buttonImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this,ImageView_Activity.class);
                startActivity(intent);
            }
        });

        Button buttonSpinner = (Button) findViewById(R.id.button_spinner);
        buttonSpinner.setText(getResources().getString(R.string.spinner));
        buttonSpinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this,Spinner_Activity.class);
                startActivity(intent);
            }
        });

        Button buttonListView = (Button) findViewById(R.id.button_listView);
        buttonListView.setText(getResources().getString(R.string.listview));
        buttonListView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this,ListView_Activity.class);
                startActivity(intent);
            }
        });

        Button buttonGridLayout = (Button) findViewById(R.id.button_gridLayout);
        buttonGridLayout.setText(getResources().getString(R.string.gridLayout));
        buttonGridLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this,GridLayout_Activity.class);
                startActivity(intent);
            }
        });

        Button buttonLinearLayout = (Button) findViewById(R.id.button_LinearLayout);
        buttonLinearLayout.setText(getResources().getString(R.string.linearLayout));
        buttonLinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this,LinearLayout_Activity.class);
                startActivity(intent);
            }
        });

        Button buttonRelativeLayout = (Button) findViewById(R.id.button_RelativeLayout);
        buttonRelativeLayout.setText(getResources().getString(R.string.relativeLayout));
        buttonRelativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this,RelativeLayout_Activity.class);
                startActivity(intent);
            }
        });

        Button buttonTableLayout = (Button) findViewById(R.id.button_tableLayout);
        buttonTableLayout.setText(getResources().getString(R.string.tableLayout));
        buttonTableLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this,TableLayout_Activity.class);
                startActivity(intent);
            }
        });

        Button buttonlistViewEmpleados = (Button) findViewById(R.id.button_listViewEmpleados);
        buttonlistViewEmpleados.setText(getResources().getString(R.string.Empleados));
        buttonlistViewEmpleados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this,Lista_Empleados.class);
                startActivity(intent);
            }
        });

        Button buttonGridView = (Button) findViewById(R.id.button_gridView);
        buttonGridView.setText(getResources().getString(R.string.gridview));
        buttonGridView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this,GridView_Activity.class);
                startActivity(intent);
            }
        });

        Button buttonAsync = (Button) findViewById(R.id.button_Async);
        buttonAsync.setText(getResources().getString(R.string.async));
        buttonAsync.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this,Async_Activity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("SecondActivity","onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("SecondActivity","onStop");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("SecondActivity","onstart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("SecondActivity","onPause");
    }
}
