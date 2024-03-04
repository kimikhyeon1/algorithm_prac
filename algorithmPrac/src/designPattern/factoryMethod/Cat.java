package designPattern.factoryMethod;

public class Cat extends Animal{

    @Override
    AnimalToy getToy() {
        return new CatToy();
    }
}
