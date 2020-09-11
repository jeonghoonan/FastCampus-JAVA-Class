package part5;

/**
 * 열거형 Enum
 * 열거타입을 이용하여 변수를 선언할때 변수타입으로 사용할수있다
 * enum 이름{값1, 값2;}
 * 특정값만 가져다가 쓸수있다
 */

public class EnumExam {
    public static final String MALE = "MALE";
    public static final String FEMALE = "FEMALE";
    public static void main(String[] args) {
        String gender1;
        gender1 = EnumExam.MALE;
        gender1 = EnumExam.FEMALE;

        gender1 = "boy";

        Gender gender2;
        gender2 = Gender.MALE;
        gender2 = Gender.FEMALE;

        // gender2 = "boy"; // 다른 값인 boy 는 쓰지 못한다
    }
}

enum Gender {
    MALE, FEMALE;
}

/**
 * String으로 선언된 gedner1 에는 MALE, FEMALE 둘중 한가지 값을 갖기 원하는데
 * gender1 의 type 이 String이기 깨문에 gender1 = "소년" 해도 문제가 되지않는다
 *  실행할때 원했던 값이 MALE, FEMALE 이 아닌 다른 값이 들어오게 되서 문제가 발생할수있다
 *
 * 이런 문제를 방지하기 위해 열거형을 사용한다
 *      Gender 타입의 변수에는 MALE 이나 FEMALE 만 대입이 가능하고, 다른 값은 저장할수 없다
 *
 */