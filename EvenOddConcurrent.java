package calculate;

class EvenThread extends Thread {
    private int n;

    EvenThread(int n) {
        this.n = n;
    }

    public void run() {
        System.out.println("Even numbers up to " + n + ":");
        for (int i = 2; i <= n; i += 2) {
            System.out.println("Even: " + i);
            try { Thread.sleep(100); } catch (InterruptedException e) {}
        }
    }
}

class OddThread extends Thread {
    private int n;

    OddThread(int n) {
        this.n = n;
    }

    public void run() {
        System.out.println("Odd numbers up to " + n + ":");
        for (int i = 1; i <= n; i += 2) {
            System.out.println("Odd: " + i);
            try { Thread.sleep(100); } catch (InterruptedException e) {}
        }
    }
}

public class EvenOddConcurrent {
    public static void main(String[] args) {
        int n = 20; // Example limit

        EvenThread evenThread = new EvenThread(n);
        OddThread oddThread = new OddThread(n);

        evenThread.start();
        oddThread.start();
    }
}
