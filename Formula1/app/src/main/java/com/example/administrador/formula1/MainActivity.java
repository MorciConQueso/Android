package com.example.administrador.formula1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    public Serializable PILOTO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listaPilotos = (ListView) findViewById(R.id.listView);

        List<Piloto> pilotos = new ArrayList<Piloto>();
        pilotos.add(new Piloto(1,"Pepe",R.drawable.ic_alemania));
        pilotos.add(new Piloto(2,"Quasimodo",R.drawable.ic_alemania));
        pilotos.add(new Piloto(3,"Lorenzo",R.drawable.ic_alemania));
        pilotos.add(new Piloto("Eufrasio",R.drawable.ic_australia,"10/02/1980","Australiano",23,3,10));

        Adapter_List adapter = new Adapter_List(this,pilotos);
        listaPilotos.setAdapter(adapter);


        listaPilotos.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String itemSeleccionado = parent.getItemAtPosition(position).toString();

                Intent intent = new Intent(MainActivity.this,Detail_Activity.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable("Piloto",PILOTO);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });
    }
}
