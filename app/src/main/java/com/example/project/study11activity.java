package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class study11activity extends AppCompatActivity {

    PDFView study11;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study11activity);
        study11=(PDFView) findViewById(R.id.pdfView11);
        study11.fromAsset("part11.pdf").load();
    }
}