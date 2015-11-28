package edu.javacourse.thread;





public class Starter
{
    public static void main(String[] args) {
        PDU pdu = new PDU();
        MovingFrame mf = new MovingFrame();
        MovingThread mt = new MovingThread(pdu);
        mt.start();
    }
    
}
