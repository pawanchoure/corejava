package com.pawan.choure.filereading;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by Pawan on 10/30/2015.
 */
public class ReadFileExample {

    public static void main(String[] args) {

        File file = new File("D:/temp/sms.vmsg");
        FileInputStream fis = null;

        try {
            fis = new FileInputStream(file);

            System.out.println("Total file size to read (in bytes) : "
                    + fis.available());

            int content;
            while ((content = fis.read()) != -1) {
                // convert to char and display it
                System.out.print((char) content);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fis != null)
                    fis.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

}
