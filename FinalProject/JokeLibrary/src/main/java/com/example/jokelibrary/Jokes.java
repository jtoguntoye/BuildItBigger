package com.example.jokelibrary;

import java.util.Random;

public class Jokes {
    public Jokes(){ }


    public  static final String[] JokeString = {"Teacher: How did you find that doctor was fake?\n" +
                "John: Because he had a good handwriting!\n" +
                "\n",
                "Jack: Hey, man! Please call me a taxi.\n" +
                        "segun: Yes, sir. You are a taxi. ",
                "A: Do you want to hear a dirty joke?\n" +
                        "B: Ok\n" +
                        "A: A white horse fell in the mud. ",
                "In a restaurant:\n" +
                        "\n" +
                        "Customer: Waiter, waiter! There is a frog in my soup!!!\n" +
                        "Waiter: Sorry, sir. The fly is on vacation. ",
                "Bank Teller: How do you like the money?\n" +
                        "English Student: I like it very much. "};

    public static String getJokes() {
        return JokeString[new Random().nextInt(JokeString.length)];
    }


    }


