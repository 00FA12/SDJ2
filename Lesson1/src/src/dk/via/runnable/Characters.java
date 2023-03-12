package src.dk.via.runnable;

public class Characters implements Runnable {
    int someNumber;
    int start;
    public Characters(int anotherNumber, int start) {
        someNumber=anotherNumber;
        this.start=start;
    }

    @Override
    public void run() {
        for(int i = start; i < someNumber; i++) {
            for (char c = 'A'; c <= 'Z'; c++) {
                System.out.println(c);
            }
        }
    }
}
