package com.example;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class WordProvider {




    public static String word() {
        try {
            Random random = new Random();
            var path = "words";


            var readFile = Files.readString(Path.of(path));
            var words = readFile.split(",");

            if (words.length > 0) {
                return words[random.nextInt(words.length)];
            } else {
                System.out.println("Файл пустой или нету слов");
            }


        } catch (IOException e) {
            throw new RuntimeException(e + " файл не был найден");
        }

        return null;
    }

}
