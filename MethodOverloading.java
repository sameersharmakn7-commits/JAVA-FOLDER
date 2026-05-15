class MathOperation {

    int multiply(int a, int b) {
        return a * b;
    }

    int multiply(int a, int b, int c) {
        return a * b * c;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {

        MathOperation obj = new MathOperation();

        System.out.println("Product of 2 numbers: " + obj.multiply(2, 3));
        System.out.println("Product of 3 numbers: " + obj.multiply(2, 3, 4));
    }
}

