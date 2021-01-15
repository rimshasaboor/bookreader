package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class study15activity extends AppCompatActivity {

    PDFView study15;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study15activity);
        study15=(PDFView) findViewById(R.id.pdfView15);
        study15.fromAsset("part15.pdf").load();

    }
}