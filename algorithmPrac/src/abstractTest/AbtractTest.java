package abstractTest;

class AbtractTest {
    public static void main(String[] args) {
        System.out.println("내가 먼저 실행 되겠지? -Main");
        AnimalAbstract dog = new Dog("뽀삐");

        dog.crying();

        System.out.println(dog instanceof Animal);

    }
}
