package com.example.project;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class ContactActivity extends AppCompatActivity {

    BottomNavigationView bv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
        bv = findViewById(R.id.nav);
        bv.setSelectedItemId(R.id.contact);

        TextView join = (TextView) findViewById(R.id.join);

        bv.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                switch (menuItem.getItemId()) {

                    case R.id.home:
                        startActivity(new Intent(getApplicationContext(), Home2Activity.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.contact:
                        return true;
                    case R.id.feedback:
                        startActivity(new Intent(getApplicationContext(), FeedbackActivity.class));
                        overridePendingTransition(0, 0);
                        return true;
                }
                return false;
            }

        });

        join.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/sana.afzal.735944"));
                startActivity(intent);

            }
        });

        TextView join2 = (TextView) findViewById(R.id.join2);
        join2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/i_sana_afzal/"));
                startActivity(intent);

            }
        });

        TextView join3 = (TextView) findViewById(R.id.join3);
        join3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.twitter.com/Ahlala_Zeqaad"));
                startActivity(intent);

            }
        });

    }
}