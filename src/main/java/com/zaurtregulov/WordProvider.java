package com.zaurtregulov;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class WordProvider {

    public static String word() {
        try {
            Random random = new Random();
            var path = "words"; // файл со словами


            var readFile = Files.readString(Path.of(path)); // читаем весь файл
            var words = readFile.split(","); // разделяем файл по  запятым

            if (words.length > 0) {
                return words[random.nextInt(words.length)];
            } else {
                System.out.println("Файл пустой или нету слов!");
            }


        } catch (IOException e) {
            throw new RuntimeException(e + " Файл не был найден");
        }

        return null;
    }

}
