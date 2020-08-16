public class JavaBookConditionalLoop {
    public static void main(String[] args) {
//        int score = 75;
//
//        if (score >= 90) {
//            System.out.println("점수가 100~90 점 입니다");
//            System.out.println("등급이  A 입니다");
//        } else if (score >= 80) {
//            System.out.println("점수가 90~80 점 입니다");
//            System.out.println("등급이 B 입니다");
//        } else if (score >= 70) {
//            System.out.println("점수가 80~70 점 입니다");
//            System.out.println("등급이 C 입니다");
//        } else {
//            System.out.println("점수가 70점 미만입니다");
//            System.out.println("등급이 D 입니다");
//        }
//
//        int num = (int) (Math.random() * 45) + 1;
//        System.out.println(num);

        int score = (int) (Math.random() * 20) + 81;
        System.out.println("점수: " + score);

        String grade;

        if (score >= 90) {
            if (score >= 95) {
                grade = "A+";
            } else {
                grade = "A";
            } else {
                if (score >= 85) {
                    grade = "B+";
                } else {
                    grade = "B";
                }
                System.out.println("학점: " + grade);
            }
        }
    }
}
