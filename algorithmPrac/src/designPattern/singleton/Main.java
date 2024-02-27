package designPattern.singleton;

public class Main {
    public static void main(String[] args) {
        SingletonPattern a = SingletonPattern.getSingletonObject();
        SingletonPattern b = SingletonPattern.getSingletonObject();
        SingletonPattern c = SingletonPattern.getSingletonObject();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
