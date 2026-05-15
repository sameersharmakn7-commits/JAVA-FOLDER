class Parent {
    void show() {
        System.out.println("Parent Method");
    }
}

class Child extends Parent {
    @Override
    void show() {
        System.out.println("Child Method");
    }
}

public class Overriding {
    public static void main(String[] args) {
        Child c = new Child();
        c.show();
    }
}