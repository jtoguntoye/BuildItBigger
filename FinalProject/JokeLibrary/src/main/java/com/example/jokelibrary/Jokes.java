package com.example.jokelibrary;

import java.util.Random;

public class Jokes {
    public Jokes(){ }


    public  static final String[] JokeString = {"Teacher: How did you find that doctor was fake?\n" +
            "John: Because he had a good handwriting!\n" +
            "\n",
            "Jack: What is the carpet telling the floor?\n" +
                    "segun: I've got you covered",
            "A: Do you want to hear a dirty joke?\n" +
                    "B: Ok\n" +
                    "A: A white horse fell in the mud. ",
            "In a restaurant:\n" +
                    "\n" +
                    "Customer: Waiter, waiter! There is a frog in my soup!!!\n" +
                    "Waiter: Sorry, sir. The fly is on vacation. ",
            "Teacher: What do you call a two-humped camel?\n" +
                    "English Student: Pregnant!!"};

    public static String getJokes() {
        return JokeString[new Random().nextInt(JokeString.length)];
    }


    }


