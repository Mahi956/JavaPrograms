public class EvenOdd {
    public static void main(String[] args) {
        int start = 10; // Starting number
        int end = 50;   // Ending number

        System.out.println("Even numbers between " + start + " and " + end + " are:");
        System.out.println("Odd numbers between " + start + " and " + end + " are:");
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.print( i + " ");
            }else if (i%2!=0){
            
                System.out.println(i);
            }

            
        }


    }
    
}
