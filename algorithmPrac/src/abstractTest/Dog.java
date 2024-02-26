package abstractTest;

public class Dog extends AnimalAbstract implements Animal{
    public Dog(String name) {
        super(name);
    }

    {
        System.out.println("hi");
    }
    @Override
    public void crying() {
        String name = "짜장면";
        System.out.println(" i am crying to void bark!!! " + name);
    }

    @Override
    public void hello() {

    }
}
