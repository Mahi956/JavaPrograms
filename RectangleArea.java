// without user input 
public class RectangleArea {
    
    public static int calculateArea ( int length ,int breadth){
     return length*breadth;
    }
    public static void main(String[] args) {
        int length=10;
        int breadth=45;

        int area = calculateArea(length, breadth);
        System.out.println("Area of rectangle is : " + area) ;
        
    }
    
}
