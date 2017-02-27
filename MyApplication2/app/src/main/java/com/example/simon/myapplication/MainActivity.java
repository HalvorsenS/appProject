package com.example.simon.myapplication;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private static String logtag = "Compliment me";
    private static final int TAKE_PIC = 1;
    private Uri imageUri;
    private ArrayList<String> commentMale = new ArrayList<>(Arrays.asList("You look just like your mom.",
            "You are so handsome!",
            "Powerful!",
            "You are the strongest of all!",
            "You are the best of the best!",
            "You are incomparable!",
            "Your charm is irresistible!",
            "You are so seductive!",
            "Your smile…wow!",
            "You make me laugh like no other!",
            "You are my cup of tea!",
            "Wow - you really have been working out.",
            "There's such warmth in your eyes."));
    private ArrayList<String> commentFemale = new ArrayList<>(Arrays.asList("You might be bored of hearing these 3 words, but i can’t resist saying it again - You look beautiful!",
            "I like the way you dress, you know how to choose clothes.",
            "I like your hair cut, is it original.",
            "You're beautiful all the time, but when you smile like that, I swear my world stops.",
            "You look just like your mom.",
            "I knew you were pretty, but I didn’t know you were so deep…",
            "Wow … your black dress is adding to your gorgeousness.",
            "You haven't worn make up all week? Damn, you are gorgeous!",
            "I think I could have fun in HELL with you.",
            "I don't know from where to start praising you.",
            "It's been my pleasure to see the beauty.",
            "Went around 360 degrees, saw nothing better than you.",
            "You have a freckle on your neck. Did you know that? It's rather cute.",
            "I adore you."));
    Random r;

    private String getRandomComment(ArrayList<String> a){
        r = new Random();
        int rand = r.nextInt(a.size());
        String comment = a.get(rand);
        return comment;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button maleButton = (Button)findViewById(R.id.male);
        Button femaleButton = (Button)findViewById(R.id.female);
        maleButton.setOnClickListener(maleListener);
        femaleButton.setOnClickListener(femaleListener);
    }

    //Beskrivende kommentar
    private OnClickListener maleListener = new OnClickListener(){
        public void onClick(View v){
            Log.d(logtag, "Button clicked - maleButton");
            Toast.makeText(MainActivity.this, "Button clicked - button male", Toast.LENGTH_SHORT).show();
            Log.d(logtag, "Button ended - maleButton");
            takePhoto(v);
            TextView cm = (TextView) findViewById(R.id.comment);
            cm.setText(getRandomComment(commentMale));
        }
    };

    //Beskrivende kommentar
    private OnClickListener femaleListener = new OnClickListener(){
        public void onClick(View v){
            Log.d(logtag, "Button clicked - femaleButton");
            Toast.makeText(MainActivity.this, "Button clicked - button female", Toast.LENGTH_SHORT).show();
            Log.d(logtag, "Button ended - femaleButton");
            takePhoto(v);
            TextView cm = (TextView) findViewById(R.id.comment);
            cm.setText(getRandomComment(commentFemale));
        }
    };

    //Beskrivende kommentar
    private void takePhoto(View v){
        Intent i = new Intent("android.media.action.IMAGE_CAPTURE");
        File photo = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_PICTURES), "pic.png");
        imageUri = Uri.fromFile(photo);
        i.putExtra(MediaStore.EXTRA_OUTPUT, imageUri);
        startActivityForResult(i, TAKE_PIC);
    }

    //Beskrivende kommentar
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent intent){
        super.onActivityResult(requestCode, resultCode, intent);

        if (resultCode == Activity.RESULT_OK){
            Uri selectedImg = imageUri;
            getContentResolver().notifyChange(selectedImg, null);

            ImageView imageView = (ImageView)findViewById(R.id.image_camera);
            ContentResolver cr = getContentResolver();
            Bitmap bitmap;

            try{
                bitmap = MediaStore.Images.Media.getBitmap(cr, selectedImg);
                imageView.setImageBitmap(bitmap);
                Toast.makeText(MainActivity.this, selectedImg.toString(), Toast.LENGTH_LONG).show();
            }catch (Exception e){
                Log.e(logtag, e.toString());
            }
        }
    }


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
