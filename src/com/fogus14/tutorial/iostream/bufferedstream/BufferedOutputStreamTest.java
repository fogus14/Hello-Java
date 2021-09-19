package com.fogus14.tutorial.iostream.bufferedstream;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class BufferedOutputStreamTest {
    public static void main(String[] args) {
        try (OutputStream bos = new BufferedOutputStream(new FileOutputStream("Bufferdoutput.txt"))) {
            bos.write("abcdefg".getBytes(StandardCharsets.UTF_8));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
