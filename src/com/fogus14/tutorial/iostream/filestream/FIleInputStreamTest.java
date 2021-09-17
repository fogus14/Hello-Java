package com.fogus14.tutorial.iostream.filestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class FIleInputStreamTest {
    public static void main(String[] args) {
        // try-with-resource
        try (FileInputStream fis = new FileInputStream("test1.txt");){
            // read()
//            int read;
//            while ((read = fis.read()) != -1) {
//                System.out.println((char) read);
//            }

            // read(byte[])
//            byte[] bytes = new byte[10];
////            int read = fis.read(bytes);
//            int read = fis.read(bytes, 1, 2);
//            System.out.println(new String(bytes, 1, read, StandardCharsets.UTF_8));

            // readAllBytes
            byte[] bytes = fis.readAllBytes();
            System.out.println(Arrays.toString(bytes));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
