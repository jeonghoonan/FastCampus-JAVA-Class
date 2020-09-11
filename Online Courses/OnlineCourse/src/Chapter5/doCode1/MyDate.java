package Chapter5.doCode1;

import java.util.Calendar;

/**
 * 정보은닉 - 날자의 유효성을 검증하는 프로그램 구현
 *  day, month, year 변수는 private으로 선언
 *  각 변수의 getter, setter를 public으로 구현
 *  MyDate(int day, int month, int year)생성자를 만든다
 *  public boolean isValid() 메서드를 만들어 날짜가 유효한지 확인
 *  MyDateTest클래스에서 생성한 MyDate날짜가 유효한지 확인
 */

public class MyDate {
    private int day;
    private int month;
    private int year;

    private boolean isValid = true;

    public MyDate(int day, int month, int year) {
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                if (day < 0 || day > 31) {
                    isValid = false;
                } else {
                    this.day = day;
                }
                break;
            case 4: case 6: case 9: case 11:
                if (day < 0 || day > 30) {
                    isValid = false;
                } else {
                    this.day = day;
                }
                break;
            default:
                isValid = false;
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month < 1 || month > 12) {
            isValid = false;
        } else {
            this.month = month;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year > Calendar.getInstance().get(Calendar.YEAR)) {
            isValid = false;
        } else {
            this.year = year;
        }
    }

    public String isValid() {
        if (isValid) {
            return "유효한 날짜입니다.";
        } else {
            return "유효하지 않은 날짜입니다.";
        }
    }
}

class MyDateTest {
    public static void main(String[] args) {
        MyDate date1 = new MyDate(26, 8, 2020);
        System.out.println(date1.isValid());
        MyDate date2 = new MyDate(2, 10, 2006);
        System.out.println(date2.isValid());
    }
}
