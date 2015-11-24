package com.example.jarenas.participamobile.presentation.view.activities;

import android.app.Activity;
import android.os.Bundle;

import com.example.jarenas.participamobile.presentation.navigation.Navigator;

/**
 * Created by jarenas on 25/11/2015.
 */

public abstract class BaseActivity extends Activity {
    private Navigator navigator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

}
