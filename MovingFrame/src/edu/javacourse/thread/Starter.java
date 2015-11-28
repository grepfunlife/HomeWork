package edu.javacourse.thread;

import java.io.IOException;

public class Starter
{
    public static void main(String[] args) throws IOException {
        PDU pdu = new PDU() {};
        MovingFrame mf = new MovingFrame();
        MovingThread mt = new MovingThread(mf);
        mt.start();
    }
    
}
