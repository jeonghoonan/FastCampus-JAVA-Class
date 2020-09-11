package Chapter5.Hiding1;

/**
 * 접근 제어자(access modifier)
 *  변수, 메서드, 생성자에 대한 접근 권한 지정
 *  public, private, protected, 아무것도 안쓰는 경우(기본 접근 제어자)
 *  private를 사용하면 클래스 외부에서는 접근 할수 없다
 */

/**
 * 정보은닉(information hiding)
 *  외부에서 클래스 내부의 정보에 접근하지 못하도록한다
 *  private 키워드를 활용한다
 *  private 변수를 외부에서 접근하게 하려면 public 메서드 제공하고
 *  클래스 내부 데이터를 잘못 사용하는 오류를 방지할수잇다
 */

public class MyDate {
    private int day;
    private int month;
    private int year;

    private boolean isValid;

    public void setDay(int day) {
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {

        if ( month < 1 || month > 12) {
            isValid = false;
        }
        else
            this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void showDate() {

        if ( isValid) {
            System.out.println( year + "년 " + month + "월 " + day + "일 입니다."  );
        }
        else {
            System.out.println("유효하지 않은 날짜 입니다");
        }
    }
}

class MyDateTest {

    public static void main(String[] args) {

        MyDate date = new MyDate();

        date.setYear(2019);
        date.setMonth(77);
        date.setDay(100);

        date.showDate();

        MyDate date2 = new MyDate();
        date2.setYear(2002);
    }
}
