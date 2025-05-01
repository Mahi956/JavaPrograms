// taking user input
import java.util.*;
public class AreaR {
    public static double calculatearea(double length, double width){
        return length*width;
    }
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);

        System.out.println(" Enter length :");
       double length = scr.nextDouble();

        System.out.println("Enter width: ");
       double width =scr.nextDouble();

        double area = calculatearea(length, width);
        System.out.println("area of rectangle is : " + area);
        
    }
    
}
