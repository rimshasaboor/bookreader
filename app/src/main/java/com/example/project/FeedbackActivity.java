package com.example.project;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
public class FeedbackActivity extends AppCompatActivity {

    RatingBar r1;
    BottomNavigationView bv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);
        bv = findViewById(R.id.nav);
        bv.setSelectedItemId(R.id.feedback);
        final EditText edit1 = (EditText) findViewById(R.id.ee1);

        r1 = (RatingBar) findViewById(R.id.ratingBar2);
        final Button b1 = (Button) findViewById(R.id.b4);

        bv.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

                switch (menuItem.getItemId()) {

                    case R.id.home:
                        startActivity(new Intent(getApplicationContext(), Home2Activity.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.contact:
                        startActivity(new Intent(getApplicationContext(), ContactActivity.class));
                        overridePendingTransition(0, 0);
                        return true;
                    case R.id.feedback:
                        return true;

                }
                return false;
            }

        });

        r1.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                if (rating == 0) {
                    edit1.setText("very dissatisfied");
                } else if (rating == 1) {
                    edit1.setText("Dissatisfied");
                } else if (rating == 2 || rating == 3) {
                    edit1.setText("OK");
                } else if (rating == 4) {
                    edit1.setText("satisfied");
                } else {
                    edit1.setText("very satisfied");
                }
            }
        });

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_SEND);
                i.setType("message/html");
                i.putExtra(Intent.EXTRA_EMAIL, new String("rimsha.saboor30@gmail.com"));
                i.putExtra(Intent.EXTRA_SUBJECT, "FEEDBACK FROM APP");
                i.putExtra(Intent.EXTRA_TEXT, "message:" + edit1.getText());
                try {
                    startActivity(Intent.createChooser(i, "please select email"));

                } catch (ActivityNotFoundException ex) {

                    Toast.makeText(FeedbackActivity.this, "there are no email clients", Toast.LENGTH_SHORT).show();

                }
            }

        });
    }
        public void showNotification(View v) {
            String title = "Notfication";
            String message = " tHANKS FOR GIVING FEEDBACK";
            NotificationManager mNotificationManager =
                    (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
            if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
                NotificationChannel channel = new NotificationChannel("YOUR_CHANNEL_ID", "YOUR_CHANNEL_NAME",
                        NotificationManager.IMPORTANCE_DEFAULT);
                channel.setDescription("YOUR_NOTIFICATION_CHANNEL_DISCRIPTION");
                mNotificationManager.createNotificationChannel(channel);
            }
            NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(getApplicationContext(), "YOUR_CHANNEL_ID")
                    .setSmallIcon(R.mipmap.ic_launcher_round)
                    .setContentTitle(title)
                    .setContentText(message)
                    .setAutoCancel(true);
            Intent intent = new Intent(getApplicationContext(), Home2Activity.class);
            PendingIntent pi = PendingIntent.getActivity(this, 0, intent, PendingIntent.FLAG_UPDATE_CURRENT);
            mBuilder.setContentIntent(pi);
            mNotificationManager.notify(0, mBuilder.build());
    }
}

