package runtrack_java.DAY2.job1.job1;

public class Toto {
    int toto = 0;
    Toto() {
        toto = toto + 1;
    }

    public static void main(String[] tutu) {
        Toto t1 = new Toto();
        Toto t2 = new Toto();
        System.out.println("Toto " + t1.toto);
    }
}
