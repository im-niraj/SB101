package question1;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            Path p = Paths.get("DataSet/abc.txt");
            if(Files.exists(p)){
                List<String> data = Files.readAllLines(p);
                for(String s:data){
                    System.out.println(s);
                }
            }
            else {
                System.out.println("File is not available");
            }
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
