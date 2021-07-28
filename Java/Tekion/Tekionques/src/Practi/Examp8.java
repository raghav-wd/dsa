package Practi;

public class Examp8 {
    protected int a = 10;
    public int b = 9;
    protected int c = 100;

    protected Examp8(int a, int b) {
        this.a = a;
        this.b = b;
        c = 99;
    }

    protected void add() {
        System.out.println(a + b + c);
    }
}

