package epam.java.task8_4;

import java.util.concurrent.RecursiveTask;

public class SumOfElemOfArray {
    private static int[] array;
    public static int quantity = 1_000_000;
    public static final int NUM_OF_THREADS = 8;

    public static void setArray () {
        array = new int[quantity];
        for (int i = 0; i < array.length  ; i++) {
            array[i] = (int)(Math.random()*100);
        }
    }

    public static class SumOfElem extends RecursiveTask<Long> {
        private int from;
        private int to;

        public SumOfElem(int from, int to) {
            setArray();
            this.from = from;
            this.to = to;
        }

        public Long compute(){
            long localSum = 0;
            if(to-from <= 20){
                for (int i = from; i < to ; i++) {
                    localSum += array[i];
                }
                System.out.printf("Summing elements from %d to %d. Locale sum = %d%n", from, to, localSum);
                return localSum;
            }
            else{
                int mid = (from + to)/2;
                SumOfElem firstHalf = new SumOfElem(from, mid);
                firstHalf.fork();
                System.out.printf("Forking into two ranges: from %d to %d and from %d to %d%n", from, mid, mid+1, to);
                SumOfElem secondHalf = new SumOfElem(mid+1, to);
                long sumSecondHalf = secondHalf.compute();
                return firstHalf.join() + sumSecondHalf;

            }
        }
    }


}
