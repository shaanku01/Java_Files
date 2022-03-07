import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class FileOutput1 {
    public static void main(String args[]){
        ArrayList<String> names = new ArrayList<>();
        names.add("Shanker");
        names.add("Vineet");
        names.add("Kalyan");
        names.add("Dharnee");
        try{
            PrintWriter pw = new PrintWriter("names.txt");
            for(int i=0;i<names.size();i++)
            pw.println(names.get(i));
            pw.close();

        }catch(FileNotFoundException ex){
            System.out.println(ex.getMessage());
        }

    }
}
