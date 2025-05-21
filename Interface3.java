
interface A{
    void display();
}

interface B{
    void display();
}

class Demo implements A,B{
    public void display(){
        System.out.println("Display Name");
    }
}
public class Interface3 {
    public static void main(String[] args) {
         Demo obj= new Demo();
        obj.display();
   }
}
