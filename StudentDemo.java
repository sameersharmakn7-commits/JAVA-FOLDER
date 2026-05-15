class Student {
    String name = "Sameer";
    int age = 19;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display();
    }
}
