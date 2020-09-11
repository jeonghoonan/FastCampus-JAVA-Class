package Interface;

/**
 * 내부클래스 : 클래스 클래스 안에 선언된 클래스
 *      중첩 클래스 또는 인스턴스 클래스(instance class) 라고 한다
 * 어느 위치에 선언하였느냐에 따라서 4가지 형태가 있을수있다
 */

// 클래스 안에 인스턴스 변수, 필드를 선언하는 위치에 선언되는 경우; 보통 중텁클래스/인스턴스 클래스라고 한다
public class InnerExam1 {
    class Cal {
        int value = 0;
        public void plus() {
            value++;
        }
    }

    public static void main(String[] args) {
        InnerExam1 t = new InnerExam1(); // 내부에 있는 Cal객체를 생성하기위해 밖에는 InnerExam1의 객체를 만든후
        InnerExam1.Cal cal = t.new Cal(); // 과 밭은 방법으로 Cal 객체를 생성한후 사용한다
        cal.plus();
        System.out.println(cal.value);
    }
}

// 내부 클래스가 static으로 정의된경우 정적 중첩 클래스 / static클래스 라고 한다
    // 필드 선언할때 스태틱한 필드로 선언한것과 같다. 이 경우 InnerExam2객체를 생성할 필요없이 new InnerExam2.Cal()로 객체 생성 가능하다
class InnerExam2 {
    static class Cal {
        int value = 0;
        public void plus() {
            value++;
        }
    }

    public static void main(String[] args) {
        InnerExam2.Cal cal = new InnerExam2.Cal();
        cal.plus();
        System.out.println(cal.value);
    }
}

// 메소드 안에 클래스를 선언한 경우, 지역 중첩 클래스 또는 지역 클래스라고 한다
    // 메소드 안에서 해당 클래스를 이용할수있다
class InnerExam3 {
    public void exec() {
        class Cal {
            int value = 0;
            public void plus() {
                value++;
            }
        }
        Cal cal = new Cal();
        cal.plus();
        System.out.println(cal.value);
    }

    public static void main(String[] args) {
        InnerExam3 t = new InnerExam3();
        t.exec();
    }
}

