import java.io.File;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        String folderPath = "D:/Работа";
        File file = new File(folderPath);

        System.out.println(getFolderSize(file));
    }

    public static long getFolderSize(File folder){
        if(folder.isFile()){
            return folder.length();
        }

        long sum = 0;
        File[] files = folder.listFiles();
        for(File file : files){
            sum += getFolderSize(file);
        }
        return sum;
    }
}
