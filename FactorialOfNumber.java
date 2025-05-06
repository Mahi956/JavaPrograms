// taking user input
import java.util.*;
public class FactorialOfNumber {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);

        System.out.println("Enter number: ");
        int num =scr.nextInt();

        int factorial=1;
        for(int i=1; i<=num; i++){
            factorial= factorial*i;
        }
        System.out.println(factorial);
    }
    
}
