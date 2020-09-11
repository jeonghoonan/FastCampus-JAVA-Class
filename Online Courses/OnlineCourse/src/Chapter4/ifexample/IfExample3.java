package Chapter4.ifexample;

/**
 * if else
 */

public class IfExample3 {
    public static void main(String[] args) {

        int score = 51;
        String grade;

        if (90 <= score && 100 >= score) {
            grade = "A";
        } else if (80 <= score && 89 >= score) {
            grade = "B";
        } else if (70 <= score && 79 >= score) {
            grade = "C";
        } else if (60 <= score && 69 >= score) {
            grade = "D";
        } else {
            grade = "F";
        }
        System.out.println("점수 : " + score);
        System.out.println("학점 : " + grade);
    }
}
