package abstractTest;

public abstract class AnimalAbstract {

    static{
        System.out.println("내가 가장 먼저 실행된다! - static block");
    }

    public final String name;

    public AnimalAbstract(String name){
        this.name = name;
    }

    public abstract void crying();
}
