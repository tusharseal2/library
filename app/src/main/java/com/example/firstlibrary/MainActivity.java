package com.example.firstlibrary;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.mylibrary.Library;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Library.simpleToast(this,"Hi This is My First Library");

        Library customView = findViewById(R.id.customView);
        customView.setText1("This is From Another Library");
        customView.setText2("This is From Another Library and its second message");
    }
}