package designPattern.strategy;

public class Main {
    public static void main(String[] args) {
        Strategy strategy = null;
        Soldier soldier = new Soldier();

        strategy = new StrategyBow();
        soldier.run(strategy);

        System.out.println();

        strategy = new StrategyGun();
        soldier.run(strategy);
    }
}
