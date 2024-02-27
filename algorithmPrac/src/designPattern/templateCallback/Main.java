package designPattern.templateCallback;

public class Main {
    public static void main(String[] args) {
        Soldier soldier = new Soldier();

        soldier.run("총소리!");

        soldier.run("발소리!");
    }
}
