/*
You are given a string s of x and y. You need to verify whether the string follows the pattern xnyn. That is the string is valid only if equal number of ys follow equal number of xs.
As an example: xxyyxxyy is valid. xy is valid. xxyyx is invalid. xxxyyyxxyyxy is valid.
*/

class Rightvibe {

    static String s = "xxyy";

    public static void main(String args[]) {
        System.out.println("=========================================================\n");

        int cx = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == 'x')
                cx++;
            else
                cx--;
        }
        if (cx == 0) {
            System.out.print("True");
        } else
        System.out.println("False");


        System.out.println();
    }
}
