package Thread_obj;

public class Counter {
    private int count = 0;

    public synchronized void  increment() throws InterruptedException {
        count++;
        System.out.print(" " + count + " ");
        Thread.sleep(1000);
    }

    public synchronized int getCount() {
        return count;
    }
}
