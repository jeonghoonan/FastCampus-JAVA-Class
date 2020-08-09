package com.company;

/**
 * N-D 배열 (N-D Arrays)
 * 배열이 배열을 담고 있으면, 다차원 배열이라 한다. (N-D Array)
 * 수학에서 말하는 점 -> 선 -> 면 -> 공간 -> 4차원 -> 5차원
 */

public class Main {

    public static void main(String[] args) {
	// 디자인 배열의 선언
        int [][] ints; // 자바 스러운 문법
        int [] halfCStyle[]; // hybrid
        int integers2[][]; // old...

        int [][] ints1 = new int[10][5]; // 앞에 있는 숫자가 더 큰 차원의 수 // 길이의 5의 array가 10개가있음
        int [][] ints2 = new int[10][];
        for (int i = 0; i < ints2.length; i++) {
            ints2[i] = new int[5];
        }

        int [][] ints3 = new int[5][];
        ints3[0] = new int[10];
        ints3[1] = new int[8];
        ints3[3] = new int[4];
        ints3[3] = new int[15];
        ints3[4] = new int[9];

        int [][] ints4 = {{1, 2, 3}, {4, 5, 6}}; // [2][3] 길이가 3인 인티저 배열이 2개가 들어가있다
        int [][] ints5 = {{1, 3, 2}, {1,2}, {4, 5, 3}}; // int[3][] 차원이 달라서 [] 이렇게 표현
        for (int i = 0; i < ints5.length; i++) {
            System.out.printf("[%d] : ", ints5[i].length);
            for (int j = 0; j < ints5[i].length; j++) {
                System.out.printf("%d ", ints5[i][j]);
        }
            System.out.println("");
        }

        for (int [] array: ints5) {
            for (int val: array) {
                System.out.printf("%d ", val);
            }
            System.out.println("");
        }
    }
}
