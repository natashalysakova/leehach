package com.company.Lessons;

import java.util.Scanner;

/**
 * Created by natas on 25.08.2015.
 */
public class Lesson6 {

    public static void Start()
    {
        String answer;
        Scanner s = new Scanner(System.in);

        do {
            System.out.println("Say me something: ".toUpperCase());
            answer = s.next();

            switch (answer.toLowerCase()) {
                case "hello":
                    System.out.println("Hello you too!");
                    break;

                case "fuck":
                    System.out.println("Get fuck yourself!".toUpperCase());
                    break;

                case "bye":
                    System.out.println("Goodbye my darling");
                    break;

                default:
                    System.out.println("I don't understand you");
                    break;
            }

        }
        while (!answer.equals("Bye"));
    }
}
