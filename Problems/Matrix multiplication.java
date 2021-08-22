import java.util.*;

class Matrix {
    Scanner sc;;
    int rows, columns;
    int mat[][];

    Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.mat = new int[rows][columns];
        this.sc = new Scanner(System.in);
    }

    void input() {
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                mat[row][column] = sc.nextInt();
            }
        }
    }

    void print() {
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                System.out.print(mat[row][column] + " ");
            }
            System.out.println();
        }
    }

    Matrix multiply(Matrix mat1, Matrix mat2) {
        Matrix res = new Matrix(this.rows, this.columns);
        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {
                res.mat[row][column] = 0;
                for (int k = 0; k < rows; k++) {
                    res.mat[row][column] += mat1.mat[row][k] * mat2.mat[column][k];
                }
            }
        }
        return res;
    }
}

class RightVibe {
    public static void main(String args[]) {
        System.out.println("=========================================================\n");

        Matrix mat1 = new Matrix(2, 2);
        Matrix mat2 = new Matrix(2, 2);
        mat1.input();
        mat2.input();

        mat1.multiply(mat1, mat2).print();

        System.out.println("\n");
    }
}
