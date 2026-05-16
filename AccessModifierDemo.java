class Test {

    public int a = 10;
    private int b = 20;

    void show() {
        System.out.println("Public value: " + a);
        System.out.println("Private value: " + b);
    }
}

public class AccessModifierDemo {
    public static void main(String[] args) {

        Test t = new Test();

        t.show();
    }
}
