package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class study17activity extends AppCompatActivity {

    PDFView study16;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study16activity);
        study16 = (PDFView) findViewById(R.id.pdfView16);
        study16.fromAsset("part16.pdf").load();
    }
}