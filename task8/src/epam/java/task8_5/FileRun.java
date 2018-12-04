package epam.java.task8_5;

import java.io.File;
import java.util.concurrent.BlockingQueue;

public class FileRun implements Runnable {
    private BlockingQueue<File> que;
    private File startDir;
    public static final File EXIT = new File("");

    public FileRun(BlockingQueue<File> que, File startDir) {
        this.que = que;
        this.startDir = startDir;
    }

    @Override
    public void run() {
        try{
            runDir(startDir);
            que.put(EXIT);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public void runDir(File dir) throws InterruptedException{
        File[] files = dir.listFiles();
        for (File file:files) {
            if(file.isDirectory()){
                runDir(file);
            }else{
                if(file.getName().endsWith(".txt"))
                que.put(file);
            }
            
        }
    }
}
