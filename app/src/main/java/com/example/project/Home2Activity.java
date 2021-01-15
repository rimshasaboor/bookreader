package com.example.project;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Home2Activity extends AppCompatActivity {
    BottomNavigationView bv;
    Button study1;
    Button study2;
    Button study3;
    Button study4;
    Button study5;
    Button study16;
    Button study6;
    Button study7;
    Button study8;
    Button study9;
    Button study10;
    Button study11;
    Button study12;
    Button study13;
    Button study15;
    Button study17;
    Button study18;
    Button study14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home2);
        bv = findViewById(R.id.nav);
        bv.setSelectedItemId(R.id.home);
        study1 = (Button) findViewById(R.id.study1);

        bv.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                switch (menuItem.getItemId()) {

                    case R.id.home:
                        return true;
                    case R.id.contact:
                        startActivity(new Intent(getApplicationContext(), ContactActivity.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.feedback:
                        startActivity(new Intent(getApplicationContext(), FeedbackActivity.class));
                        overridePendingTransition(0, 0);
                        return true;

                }
                return false;
            }

        });
        study1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home2Activity.this, study1activity.class);
                startActivity(intent);

            }
        });

        study2 = (Button) findViewById(R.id.study2);
        study2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home2Activity.this,study2activity.class);
                startActivity(intent);

            }
        });
        study3 = (Button) findViewById(R.id.study3);
        study3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home2Activity.this,study3activity.class);
                startActivity(intent);

            }
        });
        study4 = (Button) findViewById(R.id.study4);
        study4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home2Activity.this,study4activity.class);
                startActivity(intent);

            }
        });
        study5 = (Button) findViewById(R.id.study5);
        study5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home2Activity.this,study5activity.class);
                startActivity(intent);

            }
        });
        study6 = (Button) findViewById(R.id.study6);
        study6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home2Activity.this,study6activity.class);
                startActivity(intent);


            }
        });
        study7 = (Button) findViewById(R.id.study7);
        study7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home2Activity.this, study7activity.class);
                startActivity(intent);
            }
        });
        study8 = (Button) findViewById(R.id.study8);
        study8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home2Activity.this, study8activity.class);
                startActivity(intent);
            }
        });
        study9 = (Button) findViewById(R.id.study9);
        study9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home2Activity.this, study9activity.class);
                startActivity(intent);
            }
        });
        study10 = (Button) findViewById(R.id.study10);
        study10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home2Activity.this, study10activity.class);
                startActivity(intent);
            }
        });
        study11 = (Button) findViewById(R.id.study11);
        study11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home2Activity.this, study11activity.class);
                startActivity(intent);
            }
        });
        study12 = (Button) findViewById(R.id.study12);
        study12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home2Activity.this, study12activity.class);
                startActivity(intent);
            }
        });
        study13 = (Button) findViewById(R.id.study13);
        study13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home2Activity.this, study13activity.class);
                startActivity(intent);
            }
        });
        study14 = (Button) findViewById(R.id.study14);
        study14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home2Activity.this, study14activity.class);
                startActivity(intent);
            }
        });
        study15 = (Button) findViewById(R.id.study15);
        study15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home2Activity.this, study15activity.class);
                startActivity(intent);
            }
        });
        study16 = (Button) findViewById(R.id.study16);
        study16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home2Activity.this, study16activity.class);
                startActivity(intent);
            }
        });
        study17 = (Button) findViewById(R.id.study17);
        study17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home2Activity.this, study17activity.class);
                startActivity(intent);
            }
        });
        study18 = (Button) findViewById(R.id.study18);
        study18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Home2Activity.this, study18activity.class);
                startActivity(intent);
            }
        });
    }
}
