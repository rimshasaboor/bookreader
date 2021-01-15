package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class study7activity extends AppCompatActivity {

    PDFView study7;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_study7activity);
        study7=(PDFView) findViewById(R.id.pdfView7);
        study7.fromAsset("part7.pdf").load();

    }
}