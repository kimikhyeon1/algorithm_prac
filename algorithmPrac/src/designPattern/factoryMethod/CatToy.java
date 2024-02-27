package designPattern.factoryMethod;

public class CatToy extends AnimalToy {

    @Override
    void identify() {
        System.out.println("나는 고양이 장난감이다!");
    }
}
