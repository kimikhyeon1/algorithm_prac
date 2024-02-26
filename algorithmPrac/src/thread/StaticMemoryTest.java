package thread;

public class StaticMemoryTest extends Thread{
    static int share;
    String myName;

    StaticMemoryTest(String name){
        this.myName = name;
    }

    public static void main(String[] args) {
        StaticMemoryTest a = new StaticMemoryTest("a");
        StaticMemoryTest b = new StaticMemoryTest("b");

        a.start();
        b.start();

        System.out.println(share);
    }

    @Override
    public void run() {
        for (int i = 0; i < 100 ; i++) {
            System.out.println(myName + " " +share++);;
            try{
                sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
