package com.example.project;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    EditText name, pass, idd ;
    Button bt1,bt2,bt3;
    SQLiteOpenHelper OpenHelper;
    SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (EditText) findViewById(R.id.e1);
        pass = (EditText) findViewById(R.id.e2);
        idd = (EditText) findViewById(R.id.e);
        bt1 = (Button) findViewById(R.id.b1);
        bt2 = (Button) findViewById(R.id.b2);
        bt3 = (Button) findViewById(R.id.b3);
        OpenHelper = new DatabaseHelper(this);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                if(name.getText().toString().equals("") || pass.getText().toString().equals("")) {
                    Toast.makeText(MainActivity.this, "Fill the empty fields!", Toast.LENGTH_LONG).show();
                }
                else {
                    String username = name.getText().toString();
                    String password = pass.getText().toString();
                    db = OpenHelper.getWritableDatabase();
                    sign(username, password);

                    Intent in= new Intent(MainActivity.this, Home2Activity.class);
                    in.putExtra("mail",username);
                    in.putExtra("pass", password);
                    startActivity(in);
                }
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = name.getText().toString();
                String password = pass.getText().toString();
                db = OpenHelper.getWritableDatabase();
                update(username, password);
                Toast.makeText(MainActivity.this, "Update Successfully", Toast.LENGTH_LONG).show();
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                db = OpenHelper.getWritableDatabase();
                String id = idd.getText().toString();
                delete(id);
                Toast.makeText(getApplicationContext(), "Delete Successfully", Toast.LENGTH_LONG).show();
            }
        });

    }

    public void sign(String username, String password) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(DatabaseHelper.COL_2, username);
        contentValues.put(DatabaseHelper.COL_3, password);
        long id = db.insert(DatabaseHelper.TABLE_NAME, null, contentValues);
    }
    public boolean delete(String id){
        return db.delete(DatabaseHelper.TABLE_NAME, DatabaseHelper.COL_1 + "=?", new  String[]{id} ) >0;
    }
    public boolean update(String username, String password) {
        ContentValues contentValues = new ContentValues();
        contentValues.put(DatabaseHelper.COL_2, username);
        contentValues.put(DatabaseHelper.COL_3, password);
        db = OpenHelper.getWritableDatabase();
        String id= idd.getText().toString();
        return db.update(DatabaseHelper.TABLE_NAME, contentValues,DatabaseHelper.COL_1 + "=?", new  String[]{id} ) >0;
    }
}