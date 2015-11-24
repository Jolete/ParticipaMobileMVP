package com.example.jarenas.participamobile.presentation.view.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.jarenas.participamobile.R;

public class LanguageListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_languages);
    }

    public static Intent getCallingIntent(Context context) {
        return new Intent(context, LanguageListActivity.class);
    }
}
