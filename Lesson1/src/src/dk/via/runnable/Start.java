package src.dk.via.runnable;

public class Start {
    public static void main(String[] args) throws InterruptedException
    {
        Thread numbersThread = new Thread(new Numbers(25000,0 ));
        Thread numbersThread2 = new Thread(new Numbers(50000, 25000));
        numbersThread.start();
        numbersThread2.join();
        numbersThread.join();
        numbersThread2.start();

    }
}
