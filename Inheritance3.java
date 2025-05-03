public class Inheritance3{
    public static void main(String[] args) {
        Monitor obj = new Monitor();
        obj.displayName();
        obj.displayClass();
        obj.checkDiscipline();
        
    }
}

class Person{
    void displayName(){
        System.out.println("anjali");
    }
}

class Student extends Person{
    void displayClass(){
        System.out.println("i am in class");
    }
}

class Monitor extends Student{
    void checkDiscipline(){
        System.out.println("discipline");
    }
}