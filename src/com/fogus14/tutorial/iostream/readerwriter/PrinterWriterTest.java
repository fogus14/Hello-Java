package com.fogus14.tutorial.iostream.readerwriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrinterWriterTest {
    public static void main(String[] args) {
        try (PrintWriter printWriter = new PrintWriter(new BufferedWriter(new FileWriter("test.txt")))) {
            printWriter.println("Hello");
            printWriter.println("World");
            printWriter.println("Good");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
