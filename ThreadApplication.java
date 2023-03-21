package PrincipalThread;

public class ThreadApplication {
    public static void main(String[] args) {
    System.out.println("Numero de threads:" + Thread.activeCount());
    System.out.println(Thread.currentThread());
    }
}