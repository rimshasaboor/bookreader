package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class study13activity extends AppCompatActivity {

    PDFView study13;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study13activity);
        study13=(PDFView) findViewById(R.id.pdfView13);
        study13.fromAsset("part13.pdf").load();

    }
}