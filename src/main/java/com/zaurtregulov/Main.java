package com.zaurtregulov;
/**
 * При старте, приложение предлагает начать новую игру или выйти из приложения
 * При начале новой игры, случайным образом загадывается слово, и игрок начинает процесс по его отгадыванию
 * После каждой введенной буквы выводим в консоль счётчик ошибок, текущее состояние виселицы (нарисованное ASCII символами)
 * По завершении игры выводим результат (победа или поражение) и возвращаемся к состоянию #1 - предложение начать новую игру или выйти из приложения
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Начать новую игру");
            System.out.println("2. Выйти из приложения");


            int choice = scanner.nextInt();
            scanner.nextLine();


            switch (choice) {
                case 2 -> {
                    System.out.println("Выход...");
                    return;
                }
                case 1 -> {
                    

                }
            }
        }
    }
}