class Person {

    private String name = "Sameer";

    public String getName() {
        return name;
    }
}

public class DataHidingDemo {
    public static void main(String[] args) {

        Person p = new Person();

        System.out.println("Name: " + p.getName());
    }
}