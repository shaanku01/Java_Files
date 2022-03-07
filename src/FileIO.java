import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class FileIO {
    public static void main(String args[]){
        Scanner nbs ;


        try{
            PrintWriter fw = new PrintWriter("multiply.txt");
            nbs = new Scanner(new File("numbers.txt"));
            while(nbs.hasNext()){
                int n = nbs.nextInt()*2;

                fw.println(n);

            }
            fw.close();
        }catch(FileNotFoundException ex){
            System.out.println(ex.getMessage());
        }


    }

}
