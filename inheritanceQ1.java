class Employee{
    void work(){
        System.out.println("New Project");
    }
}

class Manager extends Employee{
    void  Meating(){
        System.out.println("Call Meating");
    }
}

public class inheritanceQ1 {
    public static void main(String[] args) {
        Manager obj= new Manager();
        obj.work();
        obj.Meating();
    }
    
}
