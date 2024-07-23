package core.basesyntax;

import java.util.concurrent.ForkJoinPool;

public class Main {
    public static void main(String[] args) {
        ForkJoinPool forkJoinPool = ForkJoinPool.commonPool();

        MyTask task = new MyTask(0, 20);
        Long result = forkJoinPool.invoke(task);
        System.out.println("Result = " + result);
    }
}
