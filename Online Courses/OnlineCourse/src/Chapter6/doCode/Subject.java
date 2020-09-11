package Chapter6.doCode;

import Chapter6.lecture.ArrayListTest;

import java.util.ArrayList;

public class Subject {

    private String name;
    private int score;

    public Subject(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}

class Student {
    int studentID;
    String studentName;
    ArrayList<Subject> subjectList;

    public Student(int studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;

        subjectList = new ArrayList<Subject>();
    }

    public void addSubject(String name, int score) {
        Subject subject = new Subject(name, score);

        subjectList.add(subject);
    }

    public void showStudentInfo() {

        int total = 0;

        for (Subject subject : subjectList) {

            total += subject.getScore();
            System.out.println(studentName + "학점의 " + subject.getName() + " 과목의 성적은 " + subject.getScore() + "점 입니다.");
        }
        System.out.println(studentName + "학생의 총점은 " + total + "점 입니다.");
    }

    public void addBook(String 태백산맥1, String 조정래) {
    }
}

class StudentTest1 {
    public static void main(String[] args) {

        Student studentLee = new Student(1001, "Lee");

        studentLee.addSubject("국어", 100);
        studentLee.addSubject("수학", 90);

        Student studentKim = new Student(1002, "Kim");
        studentKim.addSubject("국어", 100);
        studentKim.addSubject("수학", 90);
        studentKim.addSubject("영어", 90);

        studentLee.showStudentInfo();
        System.out.println("-----------------------");
        studentKim.showStudentInfo();
    }
}
