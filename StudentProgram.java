class Student {
    private String name;
    private int age;
    private int marks;

    Student(String name, int age, int marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    int getMarks() {
        return marks;
    }

    void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) {
            this.marks = marks;
        } else {
            System.out.println("Invalid marks");
        }
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
    }
}

public class StudentProgram {
    public static void main(String[] args) {
        Student s1 = new Student("Varun", 20, 85);

        s1.display();

        s1.setMarks(92);

        System.out.println("\nAfter updating marks:");
        s1.display();
    }
}
