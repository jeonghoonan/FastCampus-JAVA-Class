package com.company;

import java.util.Scanner;

public class Chapter02 {

    /**
     * 0
     * 00
     * 0000
     * 00000000
     */
    public static void main(String[] args) {
//        for (int i = 1; i <= 8; i*=2) { // 여기에서 왜 0으로 시작 안하고 1에서 하는지
//            for (int j = 0; j < i; j++) { // j를 0으로 뒀을때 i보다 작으면 어떻게 돌아가는건지
//                System.out.print("0");
//            }
//            System.out.println("");
//        }

    /**
     * 환자 레코드 출력하기
     *
     * 환자 레코드를 열전사 프린터로 보기좋게 프린트하려 한다.
     * 환자의 ID, 환자의 병명, 그리고 비고 사항을 입력받아
     * 포맷에 맞게 출력하는 프로그램을 작성하시오.
     *
     * 제한 사항
     * - 환자의 ID는 1 이상 999999 이하의 정수로 입력된다고 가정한다.
     * - 환자의 병명은 5자 이하의 문자열로 입력되며, 좌측 정렬하여 출력한다.
     * - 비고 사항은 10자 이하의 문자열로 입력되며, 좌측 정렬하여 출력한다.
     *
     * 출력 포맷
     * *----------*--------*---------------*
     * | ID004029 | 코로나19 | 자가 격리 조치   |
     * *----------*--------*---------------*
     *
     */

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("ID: ");
//        int ID = scanner.nextInt(); // scanner 이용할때  int 는 저렇게 scanner.nextInt 하고
//        scanner.nextLine(); // 이렇게 nextline 해야하는가? - 이유 : int/float/double 할땐 써야한다 
//        System.out.println("Disease: ");
//        String Disease = scanner.nextLine();
//        System.out.println("Decision: ");
//        String Decision = scanner.nextLine();
//
//        System.out.println("*----------*--------*---------------*");
//        System.out.printf("| ID05%d | %-5s | %-13s |", ID, Disease, Decision);
//        System.out.println("");
//        System.out.println("*----------*--------*---------------*");

        /**
         * 입력받아 처리하기
         *
         * 3개의 정수를 입력받아, 그 중 최대값을 출력하고자 한다.
         * 이를 수행하는 프로그램을 작성하시오.
         *
         */

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Three integers: ");
//        int num1 = scanner.nextInt();
//        scanner.nextLine();
//        int num2 = scanner.nextInt();
//        scanner.nextLine();
//        int num3 = scanner.nextInt();
//        scanner.nextLine();
//
//        int biggerNum = num1 > num2 ? num1 : num2;
//        int biggestNum = biggerNum > num3 ? biggerNum : num3;
//
//        System.out.printf("Biggest Number is %d", biggestNum);

        /**
         * 링카운터 출력기
         *
         * 크기가 4인 링카운터는 아래와 같이 동작한다.
         *
         * 0b0001 -> 0b0010 -> 0b0100 -> 0b1000 -> 0b0001 ...
         *
         * 즉, 링카운터는 하나의 비트만 1의 값을 가지며 1의 위치가 N번마다 반복되는 형태로 동작한다.
         *
         * 링카운터의 크기 numBits와카운트된 횟수 numCount를 이용하여
         * 현재 링카운터의 값을 10진수로 출력하는 프로그램을 작성하시오.
         */

//        int numBits = 12;
//        int numCount = 19;
//
////        System.out.printf("0b%s\n", Integer.toBinaryString(1 << numCount % numBits));
////        System.out.println(1 << numCount % numBits);
//
//        int newCount = (numCount - 1) % numBits; // 여기서 nunCount -1 하는 이유?
//        System.out.println(1 << newCount);

        /**
         * 피보나치 수열
         *
         * 피보나치 수열을 출력하는 프로그램을 작성하시오.
         *
         * 피보나치 수열의 점화식 : f(n) = f(n-1) + f(n-2)
         *                        f(1) = 0, f(2) = 1
         *
         * 0, 1, 1, 2, 3, 5, 8, ...
         *
         * 인자
         * seqLength: 출력하고자 하는 피보나치 수열의 길이
         */

//        int maxNum = 100;
//        int previousNum = 0;
//        int nextNum = 1;
//
//        for (int i = 0; i <= maxNum; i++) {
//            System.out.println(i + ". " + previousNum);
//
//            int sum = previousNum + nextNum;
//            previousNum = nextNum;
//            nextNum = sum;
//        }

        /**
         * 369게임+
         *
         * 369게임에 참여했을 때, 내가 외쳐야 하는 숫자나 동작을 순서대로 출력하시오.
         *
         * 규칙
         * 1. 3, 6, 9, 5가 포함되지 않은 숫자는 숫자를 외친다. (2!)
         * 2. 숫자에 포함된 3, 6, 9의 개수 만큼 박수를 친다. (짝!)
         * 3. 숫자에 포함된 5의 개수 만큼 발을 구른다. (쿵!)
         * 4. 박수와 발구르기의 순서는 관계 없으나, 반드시 번갈아 수행한다.
         *
         * 예시
         * 2   -> 2!
         * 33  -> 짝!짝!
         * 553 -> 쿵!짝!쿵! (짝!쿵!쿵!x)
         * 47  -> 47!
         *
         * 인자
         * gameLength: 게임이 종료되는 데 걸리는 턴 수
         * numPeople: 게임에 참여하는 인원 수
         * myTurn: 내가 숫자를 외치는 순번
         */

        /**
         * 행렬의 곱 계산하기
         *
         * 두 행렬의 곱을 구하는 프로그램을 작성하시오.
         * 행렬의 곱을 계산한 후에 행렬 형태로 출력하시오.
         *
         *
         * 인자
         * matA: N x M 행렬
         * matB: M x K 행렬
         */

//        int[][] matA = {{1, 2, 3}, {4, 5, 2}};
//        int[][] matB = {{5, 2}, {6, 2}, {1, 0}};
//
//        int r1 = 2;
//        int r2 = 3;
//        int c1 = 3;
//        int c2 = 2;
//
//        int[][] matC = new int[r1][c2];
//        for (int i = 0; i < r1; i++) {
//            for (int j = 0; j < c2; j++) {
//                for (int k = 0; k < c1; k++) {
//                    matC[i][j] += matA[i][k] * matB[k][j];
//                }
//                System.out.print(matC[i][j] + " ");
//            }
//            System.out.println();
//        }

//        int[] integers = {1, 2, 3, 4, 5};
//        for (int i = 0; i < integers.length; i++) {
//            System.out.println(integers[i]);
//        }












    }
}
