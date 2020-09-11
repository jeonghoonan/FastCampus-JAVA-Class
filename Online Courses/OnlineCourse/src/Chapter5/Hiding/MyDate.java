package Chapter5.Hiding;

public class MyDate {
    private int day;
    private int month;
    private int year;

    private boolean isValid;

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month < 1 || month > 12) {
            isValid = false;
        } else
            this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    public void showDate() {
        if (isValid) {
            System.out.println(year + "년 " + month + "월 " + day + "일 입니다");
        } else {
            System.out.println("유효하지 않은 날짜 입니다");
        }
    }
}

class MyDateTest {
    public static void main(String[] args) {

        MyDate date = new MyDate();

        date.setYear(2020);
        date.setMonth(7);
        date.setDay(10);

        date.showDate();

        MyDate date2 = new MyDate();
        date2.setYear(2002);
    }
}

//public class MyDate {
//    int day;
//    int month;
//    int year;
//}
//
//class MyDateTest {
//    public static void main(String[] args) {
//
//        MyDate date = new MyDate();
//        date.day = 100;
//        date.month = 70;
//        date.year = 2020;
//
//        System.out.println(date.year + "년 " + date.month + "월 " + date.day + "일 입니다");
//        }
//    }


