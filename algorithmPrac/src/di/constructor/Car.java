package di.constructor;

public class Car {
    Tier tier;

    public Car(Tier tier){
        this.tier = tier;
    }

    public void getTierBrand(){
        System.out.println("내 자동차 타이어는 " + tier.getBrand());
    }
}
