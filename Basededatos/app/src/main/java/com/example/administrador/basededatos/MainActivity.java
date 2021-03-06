package com.example.administrador.basededatos;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.sql.SQLInput;

public class MainActivity extends AppCompatActivity {
    EditText name;
    EditText code;
    Button buttonInsert;
    Button buttonUpdate;
    Button buttonDelete;
    Button buttonQuery;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (EditText) findViewById(R.id.edit1);
        code = (EditText) findViewById(R.id.edit2);

        buttonInsert = (Button) findViewById(R.id.insertar);
        buttonInsert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombre = name.getText().toString();
                String codigo = code.getText().toString();
                ContentValues values = new ContentValues();
                    values.put("nombre",nombre);
                    values.put("codigo",codigo);

                ConnectionDB.insert(getApplicationContext(),"Usuarios",values);
//
//                SQLiteDatabase db = ConnectionDB.getConnectionWrite(getApplicationContext());
//                db.beginTransaction();
//
//                try{
//                    //Una forma
//                    //db.execSQL("INSERT INTO Usuarios (nombre, codigo) VALUE ('"+nombre+"',"+codigo+")");
//                    ContentValues values = new ContentValues();
//                    values.put("nombre",nombre);
//                    values.put("codigo",codigo);
//                    db.insert("Usuarios",null,values);
//                    db.setTransactionSuccessful();
//                }catch (SQLException ex){
//                    ex.printStackTrace();
//                }finally{
//                    db.endTransaction();
//                    db.close();
//                }
//
            }
        });

        buttonUpdate = (Button) findViewById(R.id.actualizar);
        buttonUpdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombre = name.getText().toString();
                String codigo = code.getText().toString();
                ContentValues values = new ContentValues();
                    values.put("nombre", nombre);

                ConnectionDB.update(getApplicationContext(),"Usuarios",values,"codigo=?",new String[]{codigo});

//                SQLiteDatabase db = ConnectionDB.getConnectionWrite(getApplicationContext());
//                db.beginTransaction();
//                try{
//                    db.execSQL("UPDATE Usuarios SET nombre = '"+nombre+"' WHERE codigo = "+codigo);
//                    ContentValues values = new ContentValues();
//                    values.put("nombre", nombre);
//                    db.update("Usuarios",values,"codigo=?",new String[]{codigo});
//                    db.setTransactionSuccessful();
//                }catch(SQLException ex){
//                    ex.printStackTrace();
//                }finally{
//                    db.endTransaction();
//                    db.close();
//                }
            }
        });

        buttonDelete = (Button) findViewById(R.id.borrar);
        buttonDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String codigo = code.getText().toString();

                ConnectionDB.delete(getApplicationContext(),"Usuarios","codigo=?",new String[]{codigo});
//                SQLiteDatabase db = ConnectionDB.getConnectionWrite(getApplicationContext());
//                db.beginTransaction();
//                try{
//                    //db.execSQL("DELETE FROM Usuarios WHERE code=?"+codigo);
//                    db.delete("Usuarios","code=?",new String[]{codigo});
//                    db.setTransactionSuccessful();
//                }catch(SQLException ex){
//                    ex.printStackTrace();
//                }finally{
//                    db.endTransaction();
//                    db.close();
//                }
            }
        });

        buttonQuery = (Button) findViewById(R.id.consulta);
        buttonQuery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ecodigo = code.getText().toString();
                String data = "";
                SQLiteDatabase db = ConnectionDB.getConnectionQuery(getApplicationContext());
                //Una forma
                //Cursor cursor = db.rawQuery("SELECT * FROM Usuarios", null);
                Cursor cursor = db.query("Usuarios", new String[]{"nombre","codigo"},"codigo=?",new String[]{ecodigo},null,null,null);

                int columnName = cursor.getColumnIndex("nombre");
                int columnCode = cursor.getColumnIndex("codigo");
                while(cursor.moveToNext()){
                    String nombre = cursor.getString(columnName);
                    String codigo = String.valueOf(cursor.getInt(columnCode));
                    data += nombre +" "+ codigo +"\n";
                }
                text.setText(data);
                db.close();
            }
        });

        text = (TextView) findViewById(R.id.textView);
    }

}
