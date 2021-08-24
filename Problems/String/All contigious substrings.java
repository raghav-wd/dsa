class RightVibe {
    public static void main(String args[]) {
        System.out.println("=========================================================\n");

        String s = "car";
        int n = s.length();
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j <= n; j++) {
                System.out.println(s.substring(i, j));
            }
        }

        System.out.println();
    }
}
