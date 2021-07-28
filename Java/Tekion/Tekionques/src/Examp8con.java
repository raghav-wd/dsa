import Practi.Examp8;

public class Examp8con extends Examp8{
    public Examp8con(int a, int b){
        super(a, b);
    }

    public static void main(String[] args) throws Exception {
        Examp8con e = new Examp8con(15, 10);
        e.c = 110;
        e.add();   
    }
}
