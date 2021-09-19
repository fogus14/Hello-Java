package com.fogus14.tutorial.string;

import java.io.*;
import java.util.StringTokenizer;

public class StringTokenizerTest {
    public static void main(String[] args) {
        StringTokenizer stringTokenizer;

        try (BufferedReader reader = new BufferedReader(new FileReader("test.txt"))) {
            while (reader.ready()) {
                stringTokenizer = new StringTokenizer(reader.readLine());
                int count = stringTokenizer.countTokens();
                System.out.println("Token count: " + count);
                while (stringTokenizer.hasMoreTokens()) {
                    System.out.println(stringTokenizer.nextToken());
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
