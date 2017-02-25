package com.example.simon.myapplication;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static String logtag = "Compliment me";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button maleButton = (Button)findViewById(R.id.male);
        Button femaleButton = (Button)findViewById(R.id.female);

        maleButton.setOnClickListener(maleListener);
        femaleButton.setOnClickListener(femaleListener);
    }

    private OnClickListener maleListener = new OnClickListener(){
        public void onClick(View v){
            Log.d(logtag, "Button clicked - maleButton");
            Toast.makeText(MainActivity.this, "Button clicked - button male", Toast.LENGTH_SHORT).show();
            Log.d(logtag, "Button ended - maleButton");
        }
    };

    private OnClickListener femaleListener = new OnClickListener(){
        public void onClick(View v){
            Log.d(logtag, "Button clicked - femaleButton");
            Toast.makeText(MainActivity.this, "Button clicked - febutton male", Toast.LENGTH_SHORT).show();
            Log.d(logtag, "Button ended - femaleButton");
        }
    };

    @Override
    protected void onStart(){
        Log.d(logtag, "Started");
        super.onStart();
    }

    @Override
    protected void onResume(){
        Log.d(logtag, "Resumed");
        super.onResume();
    }

    @Override
    protected void onPause(){
        Log.d(logtag, "Paused");
        super.onPause();
    }

    @Override
    protected void onStop(){
        Log.d(logtag, "Stopped");
        super.onStop();
    }

    @Override
    protected void onDestroy(){
        Log.d(logtag, "Destroyed");
        super.onDestroy();
    }

}
