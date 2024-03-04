package designPattern.singleton;

public class SingletonPattern {
    static SingletonPattern singletonObject;

    private SingletonPattern(){}

    public static SingletonPattern getSingletonObject(){
        if (singletonObject == null){
            singletonObject = new SingletonPattern();
        }

        return singletonObject;
    }
}
