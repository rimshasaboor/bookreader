package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class study4activity extends AppCompatActivity {

        PDFView study4;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_study4activity);
            study4=(PDFView) findViewById(R.id.pdfView4);
            study4.fromAsset("part4.pdf").load();
    }
}