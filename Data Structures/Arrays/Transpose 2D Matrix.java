class RightVibe {
    static int matrix[][] = { { 1, 2 }, { 3, 4 } };
    static int rlen = matrix.length;
    static int clen = matrix[0].length;
    public static void main(String args[]) {
        System.out.println("=========================================================\n");

        for (int c = 0; c < clen; c++) {
            for (int r = 0; r < rlen; r++) {
                System.out.print(matrix[r][c] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }
}

/*
1 2
3 4

1 3
2 4

*/
