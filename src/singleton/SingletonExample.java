package singleton;

class SingletonPattern {
    private static SingletonPattern instance = new SingletonPattern();

    private SingletonPattern() {
        // init DB
    }

    public static SingletonPattern getInstance() {
        return instance;
    }

    public void getDBConnection() {
        System.out.println("DB Connection");
    }
}

public class SingletonExample {
    public static void main(String[] args) {
        SingletonPattern singleton1 = SingletonPattern.getInstance();
        singleton1.getDBConnection();

        SingletonPattern singleton2 = SingletonPattern.getInstance();
        singleton2.getDBConnection();

        System.out.println(singleton1 == singleton2);

    }
}

