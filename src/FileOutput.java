import java.io.FileNotFoundException;
import java.io.PrintWriter;


public class FileOutput {
    public static void main(String args[]){
        try{
            PrintWriter pw = new PrintWriter("output.txt");
            pw.println("Hello World");
            pw.println("My Name is Shanker Sai");

            pw.close();
        }
        catch (FileNotFoundException ex){
            System.out.println(ex.getMessage());
        }

    }
}
