package com.fogus14.tutorial.iostream.file;

import java.io.File;

public class FileTest {
    public static void main(String[] args) {
        File file = new File("src/com/fogus14/tutorial/variable/variable.java");
        System.out.println("isFile : " + file.isFile());
        System.out.println("isDirectory : " + file.isDirectory());
        System.out.println("exists : " + file.exists());
        System.out.println("path : " + file.getPath());

        boolean mkdir = file.mkdir();   // file을 만들어준다!!

    }
}
