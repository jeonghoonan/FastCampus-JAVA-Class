package Chapter5;

/**
 *
 */

public class Student {

    int studentID;
    String studentName;
    String address;

    public Student(String name) {
        studentName = name;
    }

    public Student(int id, String name) {
        studentID = id;
        studentName = name;
        address = "주소없음";
    }

    public void showStudentInfo() {
        System.out.println(studentName + "," + address);
    }

    public String getStudentName() {
        return studentName;
    }

//    public static void main(String[] args) {
//
//        Student studentPark = new Student();
//        studentPark.studentName = "박은종";
//        studentPark.showStudentInfo();
//    }
}

class StudentTest {
    public static void main(String[] args) {

        Student studentLee = new Student("이순신");
//        studentLee.studentName = "이순신";
        studentLee.address = "서울";

        studentLee.showStudentInfo();

        Student studentKim = new Student(100, "김유신");
//        studentKim.studentName = "김유신";
//        studentKim.address = "경주";

        studentKim.showStudentInfo();

//        System.out.println(studentLee);
//        System.out.println(studentKim);
    }
}

