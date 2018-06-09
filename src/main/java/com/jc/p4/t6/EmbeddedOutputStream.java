package com.jc.p4.t6;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Objects;

public class EmbeddedOutputStream extends FilterOutputStream {
    static final int BUFFER_SIZE = 65535;
    private final byte[] buffer;
    private int bufferPosition;
    private boolean closed;

    public EmbeddedOutputStream(OutputStream outputStream) {
        super(Objects.requireNonNull(outputStream, "out is null"));
        buffer = new byte[BUFFER_SIZE];
        bufferPosition = 0;
    }

    @Override
    public void write(int b) throws IOException {
        write(new byte[]{(byte) b});
    }

    @Override
    public void write(byte[] bytes) throws IOException {
        write(bytes, 0, bytes.length);
    }

//    @Override
//    public void write(byte[] bytes, int offset, int length) throws IOException {
//        write(new byte[]{(byte) b});
//    }
}
