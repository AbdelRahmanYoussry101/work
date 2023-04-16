public class Main {
    public static void main(String[] args) {
        MyThread Th1 = new MyThread();
        MyRunnable Th2_run = new MyRunnable();
        Thread Th2 = new Thread(Th2_run);
        Th2.start();
        Th1.start();
    }
}