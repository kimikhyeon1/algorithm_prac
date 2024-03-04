package di.constructor;

public class Main {
    public static void main(String[] args) {
        KoreaTier koreaTier = new KoreaTier();
        Car koreaCar = new Car(koreaTier);
        koreaCar.getTierBrand();

        System.out.println();

        AmericaTier americaTier = new AmericaTier();
        Car americaCar = new Car(americaTier);
        americaCar.getTierBrand();
    }
}
