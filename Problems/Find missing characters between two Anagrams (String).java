/* Approach
One string increaments value corresponding to character in array
Other string decreaments value corresponding to character in the same array
Hence value which are - 
0 = -> occurs same number of times in both string
0 < -> string 1 has that character more from string 2
0 > -> string 2 has that character more from string 1
*/
public static void main(String args[]) {
        int alphas[] = new int[26];
        String s1 = "abcdd";
        String s2 = "abde";


        for (int i = 0; i < s1.length() || i < s2.length(); i++) {
            if(i < s1.length())
            alphas[s1.charAt(i) - 'a']++;
            if(i < s2.length())
            alphas[s2.charAt(i) - 'a']--;
        }

        for (int ch = 0; ch < alphas.length; ch++) {
            if(alphas[ch] != 0)
            System.out.print((char) (ch+97));
        }
 }
