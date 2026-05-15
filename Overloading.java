public class Overloading {

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Overloading obj = new Overloading();

        System.out.println(obj.add(10, 20));
        System.out.println(obj.add(5.5, 4.5));
    }
}