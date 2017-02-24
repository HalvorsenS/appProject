package no.omlie.myapp.myapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.util.ArrayList;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> todo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);

    }


    public ArrayList<String> initgirl(){
        todo = new ArrayList<>();
        todo.add("You might be bored of hearing these 3 words, but i can’t resist saying it again - You look beautiful!");
        todo.add("I like the way you dress, you know how to choose clothes.");
        todo.add("I like your hair cut, is it original.");
        todo.add("You're beautiful all the time, but when you smile like that, I swear my world stops.");
        todo.add("You look just like your mom.");
        todo.add("I knew you were pretty, but I didn’t know you were so deep…");
        todo.add("Wow … you black dress is adding to your gorgeousness.");
        todo.add("What I like about you, is your energy. You have positive energy. Beauty is a common thing, but for people with positive energy, that’s rare.");
        todo.add("You haven't worn make up all week? Damn, you are gorgeous!");
        todo.add("I think I could have fun in HELL with you.");
        todo.add("I don't know from where to start praising you.");
        todo.add("It's been my pleasure to see the beauty.");
        todo.add("Went around 360 degrees, saw nothing better than you.");
        todo.add("You have a freckle on your neck. Did you know that? It's rather cute.");
        todo.add("I adore you.");
        return todo;
    }

    public ArrayList<String> initboy(){
        todo = new ArrayList<>();
        todo.add("You look just like your mom.");
        todo.add("You are so handsome!");
        todo.add("Powerful!");
        todo.add("You are the strongest of all!");
        todo.add("You are the best of the best!");
        todo.add("You are incomparable!");
        todo.add("Your charm is irresistible!");
        todo.add("You are so seductive!");
        todo.add("Your smile…wow!");
        todo.add("You make me laugh like no other!");
        todo.add("You are my cup of tea!");
        todo.add("Wow - you really have been working out.");
        todo.add("There's such warmth in your eyes.");
        return todo;
    }
    public void displayText(View view) {

    }
}
