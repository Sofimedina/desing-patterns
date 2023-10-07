package org.skm.DecoratorIO;

import java.io.*;

public class UsingJavaIo {

    public void run(){
        int c;

        try {
            InputStream in = new LowerCaseInput(new BufferedInputStream(new FileInputStream("src/main/resources/test.txt")));
            while ((c=in.read())>=0){
                System.out.print((char) c);
            }
            in.close();
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
