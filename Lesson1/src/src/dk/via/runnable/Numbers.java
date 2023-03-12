package src.dk.via.runnable;

public class Numbers implements Runnable {
    private int w;
    private int start;
    public Numbers(int i, int start) {
        w = i;
        this.start=start;
    }

    @Override
    public void run() {
        for(int i = start; i < w; i++) {
            System.out.println(i);
        }
    }
}
