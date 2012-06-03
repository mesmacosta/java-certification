public class Exercise implements Runnable {
    public void run() {
        for (int i = 0; i < 100; ++i) {
            if (i % 10 == 0) {
                System.out.println(i);
            }
            try {
                Thread.sleep(1000);
            } catch(InterruptedException ex) {}
        }
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new Exercise());
        thread.start();
    }
}
