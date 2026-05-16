class Singleton {

    private static Singleton obj = new Singleton();

    private Singleton() {
    }

    static Singleton getInstance() {
        return obj;
    }

    void showMessage() {
        System.out.println("Singleton Class Example");
    }
}

public class SingletonDemo {
    public static void main(String[] args) {

        Singleton s = Singleton.getInstance();

        s.showMessage();
    }
}
