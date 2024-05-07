package com.example.mylibrary;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class Library extends LinearLayout {

    private EditText editText1, editText2;

    public Library(Context context) {
        super(context);
        init(context);
    }

    public Library(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public Library(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    private void init(Context context) {
        LayoutInflater.from(context).inflate(R.layout.custom_view_layout, this);
        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
    }

    public String getText1() {
        return editText1.getText().toString();
    }

    public String getText2() {
        return editText2.getText().toString();
    }

    public void setText1(String text) {
        editText1.setText(text);
    }

    public void setText2(String text) {
        editText2.setText(text);
    }

    public static void simpleToast(Context context, String msg){
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }
}
