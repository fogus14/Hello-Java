package com.fogus14.tutorial.iostream.filestream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class FileOutputStreamTest {
    public static void main(String[] args) {
        try {
            OutputStream fileOutputStream = new FileOutputStream("output.txt", true);
            String str = "가나다라마바사";
            fileOutputStream.write(str.getBytes());

//            fileOutputStream.write(str.getBytes());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
