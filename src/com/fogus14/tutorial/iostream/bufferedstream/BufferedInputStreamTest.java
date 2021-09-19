package com.fogus14.tutorial.iostream.bufferedstream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class BufferedInputStreamTest {
    public static void main(String[] args) {
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("output.txt"))) {
            // 성능향상이 되는 것이고 사용법은 InputStream하고 똑같다! (사용법 FileInputStream 참고!)

            // read()
            int read;
            while ((read = bis.read()) != -1) {
                System.out.println((char) read);        // int형으로 반환하기때문에 char로 형변환 해줌.

                // read(byte[])
//            byte[] bytes = new byte[100];
//            int read = bis.read(bytes);
////            int read = fis.read(bytes, 1, 2);
//            System.out.println(new String(bytes, 1, read, StandardCharsets.UTF_8));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
