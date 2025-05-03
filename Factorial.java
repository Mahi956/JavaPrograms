// Factorial of a number 
public class Factorial {
    public static void main(String[] args) {
       int n=7;
        int factorial=1;

        for (int i =1 ; i<=n ; i++){
            factorial= factorial*i;
        }

        System.out.println("Factorial of Number is : " + factorial );
    }
    
}
