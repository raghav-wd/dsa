import java.util.*;

class RightVibe {
    static String s = "abcaadefazxcvb";

    public static void main(String args[]) {
        System.out.println("=========================================================\n");

        String max = "";
        String mxs = "";

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            mxs = (mxs.indexOf(ch) == -1) ? mxs = mxs + ch : mxs.substring(mxs.indexOf(ch) + 1) + ch;
            if (max.length() < mxs.length())
                max = mxs;
        }
        
        System.out.println(max);

        System.out.println();
    }
}
