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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Context context = getApplicationContext();


        Button spotify = (Button) findViewById(R.id.button);
        spotify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CharSequence text = "This will start my Spotify App!";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        Button scores = (Button) findViewById(R.id.button2);
        scores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CharSequence text = "This will start my Scores App!";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        Button library = (Button) findViewById(R.id.button3);
        library.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CharSequence text = "This will start my Library App!";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        Button buildItBigger = (Button) findViewById(R.id.button4);
        buildItBigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CharSequence text = "This will start my Build It Bigger App!";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        Button xyz = (Button) findViewById(R.id.button5);
        xyz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CharSequence text = "This will start my XYZ Reader App!";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

        Button capstone = (Button) findViewById(R.id.button6);
        capstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CharSequence text = "This will start my Capstone App!";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
