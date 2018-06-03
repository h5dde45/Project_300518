package com.jc.p2.t14;

import java.io.*;

public class FileFirst {
    public static void main(String[] args) {
//        demoInputOutput();
//        demoReaderWriter();
//        encodeDemo();
//        demoMemory();

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

    private static void demoReaderWriter() {
        try (FileReader reader = new FileReader("data/text.txt");
             FileWriter writer = new FileWriter("data/textWrite.txt")
        ) {
            char[] chars = new char[32];
            int ch = reader.read(chars);
            while (ch != -1) {
                writer.write(chars, 0, ch);
                ch = reader.read(chars);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void encodeDemo() {
        try (
                FileInputStream fis = new FileInputStream("pom.xml");
                Reader isr = new InputStreamReader(fis, "UTF-8");
                BufferedReader br = new BufferedReader(isr)) {
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void demoMemory() {
        try (
                ByteArrayInputStream bais = new ByteArrayInputStream("qwe".getBytes());
                ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            int r = bais.read();
            while (r != -1) {
                System.out.print((char) r);
                baos.write(r);
                r = bais.read();
            }
            System.out.println();
            byte[] bytes1 = baos.toByteArray();
            String s = new String(bytes1);
            System.out.println(s);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
