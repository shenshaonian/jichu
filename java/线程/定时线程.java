package 线程;

import org.junit.Test;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class 定时线程 {

    public class WorkerThread implements Runnable{
        private String commands;
        public WorkerThread(String s) {
            this.commands = s;
        }

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + " Start. TIme = "+ new Date());
            processCommand();
            System.out.println(Thread.currentThread().getName()+" End. Time = "+new Date());
        }

        private void processCommand() {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }

        @Override
        public String toString() {
            return this.commands;
        }
    }

    @Test
    public void test1() throws InterruptedException{
        ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);

        System.out.println("Current Time = " + new Date());

        for (int i = 0; i < 10; i++){
            Thread.sleep(1000);
            WorkerThread workerThread = new WorkerThread("do heavy processing");

            scheduledThreadPool.scheduleWithFixedDelay(workerThread,5,3, TimeUnit.SECONDS);
        }
        //池子大小5个，while 5s 的时候，都创建满了，while 10秒的时候一个跟着一个执行了end，这个时候没有创建原因是主线要走完了，更多的原因是社么呢？
//        Thread.sleep(5000);

        scheduledThreadPool.shutdown();
        while (!scheduledThreadPool.isTerminated()){

        }
        System.out.println("Finished all threads");
    }

}
