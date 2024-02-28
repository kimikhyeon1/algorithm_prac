package di.setter;

public class Main {
    public static void main(String[] args) {
        KoreaTier koreaTier = new KoreaTier();
        Car car = new Car();
        car.setTier(koreaTier);
        car.getTierBrand();

        System.out.println();

        AmericaTier americaTier = new AmericaTier();
        car.setTier(americaTier);
        car.getTierBrand();
    }
}
