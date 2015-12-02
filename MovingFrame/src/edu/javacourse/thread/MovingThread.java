package edu.javacourse.thread;

public class MovingThread implements Runnable
//extends Thread 
{

    private MovingFrame frame;

    public MovingThread(MovingFrame frame) {
        this.frame = frame;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(200);
                frame.moveFrame();
            } catch (InterruptedException ex) {
            }
        }
    }
}
