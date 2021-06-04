package org.example;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Chad Higgins
 */

/*
Mad libs are a simple game where you create a story template with blanks for words.
You, or another player, then construct a list of words and place them into the story,
creating an often silly or funny story as a result.

Create a simple mad-lib program that prompts for a noun, a verb, an adverb,
and an adjective and injects those into a story that you create.

Example Output
Enter a noun: dog
Enter a verb: walk
Enter an adjective: blue
Enter an adverb: quickly
Do you walk your blue dog quickly? That's hilarious!

Constraints
Use a single output statement for this program.
If your language supports string interpolation or string substitution, use it to build up the output.
 */

import java.util.Arrays;
import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner in = new Scanner(System.in);

        String noun = getPrompt(in, "Enter a noun: " );

        String verb = getPrompt(in, "Enter a verb: " );

        String adjective = getPrompt(in, "Enter an adjective: " );

        String adverb = getPrompt(in, "Enter an adverb: " );

        nowPrint(verb, adjective, noun, adverb);

    }

    private static String getPrompt(Scanner in, String text) {
        System.out.println( text );
        return in.nextLine();
    }

    private static void nowPrint(String... text) {
        System.out.printf( "Do you %s your %s %s %s? That's hilarious!", text[0], text[1], text[2], text[3]);
    }

}
