import java.util.*;
public class ProductOfNumber {
    // without user input
    // public static void main(String[] args) {
    //     int num1=3;
    //     int num2=45;
    //     int num3=2;
    //     int num4=4;

    //     int product= num1*num2*num3*num4;
    //     System.out.println(product);
        
    // }/

    public static double ProductOfNumber(double num1 , double num2){
        return num1*num2;
    }

    public static void main(String[] args) {
        Scanner scr= new Scanner(System.in);

        System.out.println("Enter 1st number: ");
        double num1 =scr.nextDouble();

        System.out.println("Enter 2nd number:");
        double num2 =scr.nextDouble();

        double Product = ProductOfNumber( num1 ,num2);
        System.out.println("Product of number is : " + Product);
        
        
    }
    
}
