package com.fogus14.tutorial.iostream.readerwriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.StandardCharsets;

public class BufferedFileWriterTest {
    public static void main(String[] args) {
        try (Writer fileWriter = new BufferedWriter(
                new FileWriter("filewriter.txt", StandardCharsets.UTF_8,true))) {
            fileWriter.write("우와 신기하다~!~!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
