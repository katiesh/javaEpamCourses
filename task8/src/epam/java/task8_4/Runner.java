package epam.java.task8_4;

import java.util.concurrent.ForkJoinPool;

public class Runner {
    public void run(){
        ForkJoinPool pool = new ForkJoinPool(SumOfElemOfArray.NUM_OF_THREADS);
        long sum = pool.invoke(new SumOfElemOfArray.SumOfElem(0, SumOfElemOfArray.quantity));
        System.out.println("Sum = " + sum);
    }
}
