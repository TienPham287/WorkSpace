package LTNC4;

public class Test {
public static void main(String[] args) {
ShareData sharedata = new ShareData();
Thread1 t1 = new Thread1(sharedata);
Thread2 t2 = new Thread2(sharedata);
t1.start();
t2.start();

}
}
