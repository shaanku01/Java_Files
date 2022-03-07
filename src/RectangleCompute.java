import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class RectangleCompute {
    public static void main(String args[]){
        Scanner ob;
        try{
            ob = new Scanner(new File("rectangle_data.txt"));
            PrintWriter pw = new PrintWriter("Rectangle_output.txt");

            while(ob.hasNext()){
                String arr[] = ob.nextLine().split(" ");
                int length = Integer.parseInt(arr[0]);
                int width = Integer.parseInt(arr[1]);
                pw.println("The length is " + length);
                pw.println("The Width is " + width);
                pw.println("The Area is " + (length*width));
                pw.println("The Perimeter is " + 2*(length+width));
                pw.println();


            }
            Scanner ob1 = new Scanner(new File("rectangle_data.txt"));
            PrintWriter pw1 = new PrintWriter("Circle_output.txt");
            while(ob1.hasNext()){
                String arr[] = ob1.nextLine().split(" ");
                int radii = Integer.parseInt(arr[0]);
                pw1.println("The Radius is " + radii);
                pw1.println("The Area is " + (3.14*radii*radii));

            }

            pw.close();
            pw1.close();

        }catch(FileNotFoundException ex){
            System.out.println(ex.getMessage());
        }
    }
}
