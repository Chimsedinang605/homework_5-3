package Thread_obj;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter();
        int numThreads = 6;
        int incrementPerThread = 5;
        IncrementThread[] threads = new IncrementThread[numThreads];


        for (int i = 0; i < numThreads; i++) {
//            Create threads
            threads[i] = new IncrementThread(counter, incrementPerThread) ;
//            start thread
            threads[i].start();
        }
        // all thread to finish
        try {
            for (IncrementThread thread: threads) {
                thread.join();
            }
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
