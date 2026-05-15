interface Animal {

    void sound();
}

class Cow implements Animal {

    public void sound() {
        System.out.println("Cow says Moo");
    }
}

public class AnimalInterface {
    public static void main(String[] args) {

        Cow c = new Cow();

        c.sound();
    }
}
