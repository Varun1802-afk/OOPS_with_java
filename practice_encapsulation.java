class Student{
    private String name;
    private int age;

    void setName(String name){
        this.name = name;
    }

    void setAge(int age){
        this.age = age;
    }

    void getBoth(){
        System.out.println("Name : "+ name);
        System.out.println("Age : "+age);
    }
}

public class practice_encapsulation {
    public static void main(String[] args) {
        Student obj = new Student();
        
        obj.setName("Varun");
        obj.setAge(20);
        obj.getBoth();
    }
    
}