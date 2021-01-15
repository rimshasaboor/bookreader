package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class study12activity extends AppCompatActivity {

    PDFView study12;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study12activity);
        study12=(PDFView) findViewById(R.id.pdfView12);
        study12.fromAsset("part12.pdf").load();

    }
}