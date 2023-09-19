import java.util.ArrayList;

class HeavyWork implements  Runnable{
    String name;


    public HeavyWork(String name){
        this.name = name;
    }

    public void work(){
        for (int i = 0; i < 5; i++) {
            try{
                Thread.sleep(100);
            } catch (Exception e) {
            }
        }
        System.out.printf("%s done.\n", this.name);
    }

    @Override
    public void run() {
        work();
    }
}

public class Example25_Test03 {
    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();
        ArrayList<Thread> threads = new ArrayList<>();

        for (int i = 1; i < 5; i++) {
            //HeavyWork w = new HeavyWork("w"+i);
            //w.work();
            Thread t = new Thread(new HeavyWork("w" + i));
            threads.add(t);
            t.start();
        }
        for (Thread t:threads) {
            t.join();
        }

        long end = System.currentTimeMillis();
        System.out.printf("elapsed time:%s ms\n", end - start);
    }
}
