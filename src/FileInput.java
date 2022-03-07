import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

public class FileInput {

    public static void main(String args[]){
        Scanner inFile;
        try{
            inFile = new Scanner(new File("input.txt"));
            int input;
            int sum=0;
            while(inFile.hasNext()){
                input = inFile.nextInt();
                 sum+=input;
                //System.out.println(input);
             }
            System.out.println(sum);
            inFile.close();

        }
        catch(FileNotFoundException ex){
           System.out.println("Cant Find FIle");
           System.out.println(ex.getMessage());
        }
        catch(InputMismatchException ex){
            System.out.println(ex.getMessage());
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
          }

    }





}
