package part5;

public class StringMethodExam {
    public static void main(String[] args) {
        // String str = new String("Hello"); // 원래 이렇게 사용한다
        String str = "hello";
        // str. 을 누르게 되면 객체가 사용할수있는 필드와 메소드를 보여준다
        System.out.println(str.length()); // 5글자. 공백도 포함이다

        /**
         * 문자열 붙히기 (concat)
         * String Class 는 불변 클래스로, 메소드가 수행되면, 새로운 문자열은 만든다
         *  원래 클래스는 변하지 않는다 (불변클래스)
         */
        System.out.println(str.concat(" world"));
        System.out.println(str); //
        str = str.concat(" world"); // 이렇게 하면 사용가능
        System.out.println(str);

        /**
         * 문자열 자르기 (subString)
         * 참조하는 문자열을 인덱스 n 번 부터 n 번 까지 자른다
         * 문자열의 인덱스는 0번부터 시작한다
         */
        System.out.println(str.substring(3));
        System.out.println(str.substring(3, 6)); // 3번부터 6번까지 잘라라. = lo w
    }
}
