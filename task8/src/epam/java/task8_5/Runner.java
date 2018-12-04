package epam.java.task8_5;

import java.io.File;
import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Runner {
    public void run(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter directory:");
        String dir = sc.nextLine();
        System.out.println("Enter first letter of words");
        char letter = sc.next().charAt(0);
        System.out.println("Enter path to outputFile");
        String fileOut = sc.next();
        BlockingQueue<File> que = new ArrayBlockingQueue<>(10);
        FileRun running = new FileRun(que, new File(dir));
        new Thread(running).start();
        for (int i = 0; i <2 ; i++) {
            new Thread(new SearchWord(que, letter, fileOut)).start();
        }
    }
}
