package com.fogus14.tutorial.iostream.pipedstream;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.nio.charset.StandardCharsets;

public class PipedStreamTest {
    public static void main(String[] args) {

        try {
            PipedOutputStream pos = new PipedOutputStream();
            PipedInputStream pis = new PipedInputStream(pos);
//            pis.connect(pos);

            String kor = "a";
            pos.write(kor.getBytes(StandardCharsets.UTF_8));
            int read = pis.read();      // 더 이상 읽을것이 없으면 '-1'을 내보냄.
            System.out.println((char) read);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
