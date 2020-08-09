package com.company;

public class MatMul {
    public static void main(String[] args) {
        int[][] matA = {{1, 2, 3}, {4, 5, 2}};
        int[][] matB = {{5, 2}, {6, 2}, {1, 0}};

        int r1 = 2;
        int r2 = 3;
        int c1 = 3;
        int c2 = 2;

        int[][] matC = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    matC[i][j] += matA[i][k] * matB[k][j];
                }
                System.out.print(matC[i][j] + " ");
            }
            System.out.println();
        }
    }
}
