package com.example;

import java.util.Scanner;

public class Game {
    private static final String[] HANGMAN_STAGES = {
            """
               ------
               |    |
               |
               |
               |
               |
            =========
            """,
            """
               ------
               |    |
               |    O
               |
               |
               |
            =========
            """,
            """
               ------
               |    |
               |    O
               |    |
               |
               |
            =========
            """,
            """
               ------
               |    |
               |    O
               |   /|
               |
               |
            =========
            """,
            """
               ------
               |    |
               |    O
               |   /|\\
               |
               |
            =========
            """,
            """
               ------
               |    |
               |    O
               |   /|\\
               |   /
               |
            =========
            """,
            """
               ------
               |    |
               |    O
               |   /|\\
               |   / \\
               |
            =========
            """
    };

    public static void gameMessages(String randomWord) {
        Scanner scanner = new Scanner(System.in);
        char[] hiddenWord = new char[randomWord.length()];

        for (int i = 0; i < randomWord.length(); i++) {
            hiddenWord[i] = '*';
        }

        int attempts = HANGMAN_STAGES.length - 1;
        boolean win = false;

        while (attempts > 0 && !win) {
            System.out.println("Ваше слово: " + String.valueOf(hiddenWord));
            System.out.println("Введите букву: ");
            var s = scanner.next();

            if (s.length() != 1) {
                System.out.println("Введите 1 букву");
                continue;
            }

            var first = s.charAt(0);

            boolean letterСheck = false;

            for (int i = 0; i < randomWord.length(); i++) {
                if (Character.toLowerCase(randomWord.charAt(i)) == Character.toLowerCase(first)) {
                    hiddenWord[i] = randomWord.charAt(i);
                    letterСheck = true;
                }

            }

            if (!letterСheck) {
                System.out.println("Неправильно");
                if (s.matches("[а-яА-Я]")) {
                    System.out.println(HANGMAN_STAGES[HANGMAN_STAGES.length - attempts]);
                    attempts--;
                }
                System.out.println("У вас еще: " + attempts + " попыток");
            } else {
                System.out.println("Правильно");
            }

            if (String.valueOf(hiddenWord).equalsIgnoreCase(randomWord)) {
                win = true;
                System.out.println("Вы победили!");
            }

        }

        if (!win) {
            System.out.println(HANGMAN_STAGES[HANGMAN_STAGES.length - 1]);
            System.out.println("Вы проиграли! Загаданное слово: " + randomWord);
        }


    }
}
