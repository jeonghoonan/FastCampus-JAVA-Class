package com.company;

/**
 * 조건문 - 조건에 따라서 코드의 실행 흐름을 결정
 * if 계열
 * switch 계열
 *
 * [branch 문] - 기계어 수준에서 부르는 조건문 조건에 따라 건너뛴다.
 */

public class Main {

    public static void main(String[] args) {
        String snum = "510225-2055132";
        char c = snum.charAt(7); // 성별을 알기위한건데, 0번부터 해서 7번째라서 7이다
        System.out.println(c);

        if (c == '1') {
            System.out.println("남자입니다.");
        }

        if (c == '1' || c == '3') { // &&는 당연히 쓸수는 없다. // ||(or)
            System.out.println("남자입니다.");
        } else {
            System.out.println("여자입니다.");
        }

        int x = 6; // 6은 완전한 수이다. 1 2 3 6
        if (x % 2 == 0) { // 짝수를 나타낼때
            System.out.println("짝수입니다.");
        } else {
            System.out.println("홀수입니다.");
        }
        System.out.println(x % 2 == 0 ? "짝수입니다." : "홀수입니다."); // 조건이 짝수면 짝수로 반환, 홀수면 홀수로 반환. 조건을 먼저 적어야한다.
        // code convention / clean code 메소드 한줄이 20줄이 남기면안된다. 줄여야할때 쓰임
        // 근데 가독성은 많이 떨어진다.

        int score = 2;
        char grade;
        if (score >= 9) {
            grade = 'A';
        } else if (score >= 7) {
            grade = 'B';
        } else if (score >= 5) {
            grade = 'C';
        } else if (score >= 3) {
            grade = 'D';
        } else { // 조건이 없으니깐 무조건 F 로 출력이 된다.
            grade = 'F';
        }
        System.out.println(grade);

        score = 90;
        boolean isLate = true; // 늦게 제출했다
        // late인 경우에는 하나 낮은 그레이드를 주기로 하였다.
        // Nested if 문이라고 불린다
        if (score >= 90) {
            if (isLate) {
                grade = 'B';
            } else {
                grade = 'A';
            }
        } else if (score >= 80) {
            if (isLate) {
                grade = 'C';
            } else {
                grade = 'B';
            }
        } else if (score >= 70) {
            if (isLate) {
                grade = 'D';
            } else {
                grade = 'C';
            }
        } else if (score >= 60) {
            if (isLate) {
                grade = 'F';
            } else {
                grade = 'D';
            }
        } else {
            grade = 'F';
        }
        System.out.println("");

        grade = 'A';
        // switch ~ case 문의 조건문은 '값' 이 들어오게 된다. (boolean 에 한정되지않습니다.)
        // 대신에 case 가 범위가 될 수 없고, case도 값이어야 한다.
        // switch 하고 조건이 들어오게된다. 조건이 어떤값인지 검ㅁ사한다. 일치하면 바로 아래께 실행
        // break 가 되면 스위치 문이 종료되고 밖으로 나오게 된다
        switch (grade) { // 스위치 예는 예를들어서 A등급 사람들이 누릴수 있는 혜택을 밑으로 내릴때 사용가능
            case 'A':
                System.out.println("훌륭합니다!"); // fall-through (의도적으로할때)
                break;
            case 'B':
                System.out.println("멋집니다!");
                break;
            case 'C':
                System.out.println("노력하세요!");
                break;
            case 'D':
                System.out.println("많이 노력하세요!");
                break;  // break 가 없으면 fall-through (아래로 떨어지는거) 발생함.
            default:
                System.out.println("다음엔 잘하세요!"); // default 를 가장 먼저 쓰지말아라
        }



    }
}
