class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Lion extends Animal {

    @Override
    void sound() {
        System.out.println("Lion roars");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {

        Lion l = new Lion();

        l.sound();
    }
}

