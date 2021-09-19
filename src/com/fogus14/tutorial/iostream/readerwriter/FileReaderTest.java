package com.fogus14.tutorial.iostream.readerwriter;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileReaderTest {
    public static void main(String[] args) {
        try (FileReader fileReader = new FileReader("output.txt", StandardCharsets.UTF_8)) {
            char[] chars = new char[10];
            int read = fileReader.read(chars);
            System.out.println(new String(chars));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
