class Person{
    void displayname(){
        System.out.println("Name : Rohit");
    }
}

class Student extends Person{
    void displayclass(){
        System.out.println("Class : 11th");
    }
}

class Monitor extends Student{
    void  checkDiscipline(){
        System.out.println("Job : Maintain Discipline");
    }

}

public class inheritanceQ2 {
    public static void main(String[] args) {
        Monitor obj= new Monitor();
        obj.displayname();
        obj.displayclass();
        obj.checkDiscipline();
    }
    
}
