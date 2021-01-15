package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class study9activity extends AppCompatActivity {

    PDFView study9;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study9activity);
        study9=(PDFView) findViewById(R.id.pdfView9);

    }
}