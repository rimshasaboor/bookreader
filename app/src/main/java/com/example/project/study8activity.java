package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class study8activity extends AppCompatActivity {

    PDFView study8;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study8activity);
        study8=(PDFView) findViewById(R.id.pdfView8);
        study8.fromAsset("part8.pdf").load();
    }
}