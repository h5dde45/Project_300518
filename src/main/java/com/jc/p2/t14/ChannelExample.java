package com.jc.p2.t14;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelExample {
    public static void main(String[] args) {
//        foo();
        transferDemo();

    }

    private static void foo() {
        try (
                FileInputStream fis =
                        new FileInputStream("C:\\java_projects\\Project_300518\\data\\download.mp3");
                FileOutputStream fos = new FileOutputStream("data\\download2.mp3");
        ) {
            FileChannel inChannel = fis.getChannel();
            FileChannel outChannel = fos.getChannel();
            ByteBuffer byteBufferIn = ByteBuffer.allocate(4096);
            ByteBuffer byteBufferOut = ByteBuffer.allocate(4096);
            int read = inChannel.read(byteBufferIn);
            while (read != -1) {
                byteBufferIn.flip();
                while (byteBufferIn.hasRemaining()) {
                    byte get = byteBufferIn.get();
                    byteBufferOut.put(get);
                }
                byteBufferOut.flip();
                outChannel.write(byteBufferOut);
                byteBufferIn.clear();
                byteBufferOut.clear();
                read = inChannel.read(byteBufferIn);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void transferDemo() {
        try (
                FileInputStream fis =
                        new FileInputStream("C:\\java_projects\\Project_300518\\data\\download.mp3");
                FileOutputStream fos = new FileOutputStream("data\\download2.mp3");
        ) {
            FileChannel inChannel = fis.getChannel();
            FileChannel outChannel = fos.getChannel();
//            inChannel.transferTo(0, inChannel.size(), outChannel);
            outChannel.transferFrom(inChannel, 0, inChannel.size());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
