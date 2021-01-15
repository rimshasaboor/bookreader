package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class study14activity extends AppCompatActivity {

    PDFView study14;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study14activity);
        study14=(PDFView) findViewById(R.id.pdfView14);
        study14.fromAsset("part14.pdf").load();

    }
}