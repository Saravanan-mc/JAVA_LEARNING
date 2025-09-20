class Exp1 implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().threadId());
      
    }
}

public class ThreadExample2 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Thread t = new Thread(new Exp1());
            t.start();
        }
    }
}
