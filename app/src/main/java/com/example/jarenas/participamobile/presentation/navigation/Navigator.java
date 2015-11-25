package com.example.jarenas.participamobile.presentation.navigation;

import android.content.Context;
import android.content.Intent;

import com.example.jarenas.participamobile.presentation.view.activities.CategoryListActivity;
import com.example.jarenas.participamobile.presentation.view.activities.CouncilListActivity;
import com.example.jarenas.participamobile.presentation.view.activities.LanguageListActivity;
import com.example.jarenas.participamobile.presentation.view.activities.ProductDetailsActivity;
import com.example.jarenas.participamobile.presentation.view.activities.ProductListActivity;
import com.example.jarenas.participamobile.presentation.view.activities.SettingsListActivity;

/**
 * Created by jarenas on 24/11/2015.
 *
 * Class used to navigate through the application.
 */


public class Navigator {

    public Navigator () {}

    /**
     * Goes to the notification category list screen.
     *
     * @param context A Context needed to open the destiny activity.
     */
    public void navigateToCategoryList(Context context) {
        if (context != null) {
            Intent intentToLaunch = CategoryListActivity.getCallingIntent(context);
            context.startActivity(intentToLaunch);
        }
    }

    /**
     * Goes to the council list screen.
     *
     * @param context A Context needed to open the destiny activity.
     */
    public void navigateToCouncilList(Context context) {
        if (context != null) {
            Intent intentToLaunch = CouncilListActivity.getCallingIntent(context);
            context.startActivity(intentToLaunch);
        }
    }

    /**
     * Goes to the language list screen.
     *
     * @param context A Context needed to open the destiny activity.
     */
    public void navigateToLanguageList(Context context) {
        if (context != null) {
            Intent intentToLaunch = LanguageListActivity.getCallingIntent(context);
            context.startActivity(intentToLaunch);
        }
    }

    /**
     * Goes to the product list screen.
     *
     * @param context A Context needed to open the destiny activity.
     */
    public void navigateToProductList(Context context) {
        if (context != null) {
            Intent intentToLaunch = ProductListActivity.getCallingIntent(context);
            context.startActivity(intentToLaunch);
        }
    }

    /**
     * Goes to the product details screen.
     *
     * @param context A Context needed to open the destiny activity.
     */
    public void navigateToProductDetails(Context context) {
        if (context != null) {
            Intent intentToLaunch = ProductDetailsActivity.getCallingIntent(context);
            context.startActivity(intentToLaunch);
        }
    }

    /**
     * Goes to the language list screen.
     *
     * @param context A Context needed to open the destiny activity.
     */
    public void navigateToSettingsList(Context context) {
        if (context != null) {
            Intent intentToLaunch = SettingsListActivity.getCallingIntent(context);
            context.startActivity(intentToLaunch);
        }
    }
}
