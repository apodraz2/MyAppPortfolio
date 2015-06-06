package com.podraza.android.myappportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    Context context;


    private Toast mAppToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void showToast(View v) {

        switch (v.getId()) {
            case R.id.spotify:
            case R.id.scores:
            case R.id.library:
            case R.id.build_it_bigger:
            case R.id.xyz:
            case R.id.capstone:
                displayToast(((Button)v).getText().toString());
                break;
        }
    }

    public void displayToast(String text) {

        if(mAppToast !=null){
            mAppToast.cancel();
        }

        context = getApplicationContext();

        int duration = Toast.LENGTH_SHORT;

        mAppToast = Toast.makeText(context, text, duration);
        mAppToast.show();
    }
}
