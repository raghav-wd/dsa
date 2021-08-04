public class powerRecursion {
    public static int powerr(int n, int pow) {
        if(pow == 0) return 1;
        else
        return n * powerr(n, pow - 1);
    }

    public static void main(String[] args) {
        int res = powerr(4, 2);
        System.out.println(res);
    }

}
