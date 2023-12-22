package org.skm.DecoratorIO;

import org.skm.EnumPatterns;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class UsingJavaIo {
    public static void main(String[] args) {
        System.out.println("-------" + EnumPatterns.PATTERN_DECORATOR + "--------");
        int c;

        try {
            InputStream in = new LowerCaseInput(new BufferedInputStream(new FileInputStream("src/main/resources/test.txt")));
            while ((c = in.read()) >= 0) {
                System.out.print((char) c);
            }
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
