package epam.java.task8_5;

import java.io.*;
import java.util.Scanner;
import java.util.concurrent.BlockingQueue;

public class SearchWord implements Runnable {
    private BlockingQueue<File> que;
    private char firsstLetter;
    private File fileOut;

    public SearchWord(BlockingQueue<File> que, char firsstLetter, String fileOut) {
        this.que = que;
        this.firsstLetter = firsstLetter;
        this.fileOut = new File(fileOut);
    }

    public void search(File fileIn) throws IOException{
        Scanner sc = new Scanner (new FileInputStream(fileIn));
        while(sc.hasNext()){
            String str = sc.next();
            str.trim();
            if(str.matches("[(]*[\"*<]*" + firsstLetter  + "[a-z]*[\">]*[)]*")){
                try(OutputStreamWriter out = new OutputStreamWriter(new FileOutputStream(fileOut,true))){
                    out.write(fileIn.getPath() + str );
                    out.append("\r\n");
                }catch (FileNotFoundException e){
                    e.printStackTrace();
                }
                System.out.println(fileIn.getPath() + str);
            }
        }
        sc.close();
    }
    @Override
    public void run() {
        try{
            while(true){
                File file = que.take();
                if(file==FileRun.EXIT){
                    que.put(file);
                }else{
                    search(file);
                }
            }
        }catch(IOException e){
            e.printStackTrace();
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
