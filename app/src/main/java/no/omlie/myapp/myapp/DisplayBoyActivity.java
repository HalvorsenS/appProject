package no.omlie.myapp.myapp;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by oml35 on 24-Feb-17.
 */
public class DisplayBoyActivity {
    private ArrayList<String> todo;
    private Random rand;

    public void main(String[] args){
        initboy();
        rand = new Random();
        int index = rand.nextInt(todo.size());
        String str = todo.get(index);
    }

    public void initboy(){
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
    }
}
