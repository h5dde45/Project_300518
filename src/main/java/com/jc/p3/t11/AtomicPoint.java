package com.jc.p3.t11;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicPoint {
    private final AtomicInteger x=new AtomicInteger(0);
    private final AtomicInteger y=new AtomicInteger(1);

    public void rotateClockwise(){
        int oldX=x.getAndSet(y.get());
        y.set(-oldX);
    }
}
