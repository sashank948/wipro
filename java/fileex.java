import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class fileex {
    public static void main(String[] args) {
        File f=new File("hello.txt");
        System.out.println(f);
        try {
            FileWriter fw=new FileWriter(f);
            fw.append("hiw thewrrlhwhewoh");
            fw.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    
}
