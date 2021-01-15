package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class study5activity extends AppCompatActivity {

        PDFView study5;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_study5activity);
            study5=(PDFView) findViewById(R.id.pdfView5);
            study5.fromAsset("part5.pdf").load();
    }
}