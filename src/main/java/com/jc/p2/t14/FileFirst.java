package com.jc.p2.t14;

import java.io.*;

public class FileFirst {
    public static void main(String[] args){

        demoInputOutput();
        demoReaderWriter();



    }

    private static void demoInputOutput() {
        try (InputStream inputStream =
                     new FileInputStream("C:\\Users\\Public\\Music\\Sample Music/" +
                             "Maid with the Flaxen Hair.mp3");
             OutputStream outputStream = new FileOutputStream("data/download.mp3")) {
            byte[] bytes = new byte[4096];
            int ch = inputStream.read(bytes);
            while (ch != -1) {
                outputStream.write(bytes, 0, ch);
                ch = inputStream.read(bytes);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void demoReaderWriter()  {
        try (FileReader reader = new FileReader("data/text.txt");
             FileWriter writer = new FileWriter("data/textWrite.txt");
        ){
            char[] chars = new char[32];
            int ch = reader.read(chars);
            while (ch != -1) {
                writer.write(chars,0,ch);
                ch = reader.read(chars);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
