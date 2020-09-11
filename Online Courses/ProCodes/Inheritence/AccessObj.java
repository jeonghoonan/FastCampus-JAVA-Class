package Inheritence;

/**
 * 접근제한자 : 클래스 내에서 멤버의 접근을 제한하는 역할
 * public : 모든 접근을 허용, 가장 넓은 으미
 * protected : 같은 패키지인 경우 접근 허용, 다른 패키지라도 상속을 받은경우 접근 허용
 * private : 자기 자신만 접근 가능
 * default 접근지정자 : 아무것도 쓰지 않고, 자기 자신과 같은 패키지 내에서 접근 허용
 *  public > protected > default > private
 */

public class AccessObj {
    public int p = 3;
    protected int p2 = 4;
    private int i = 1;
    int k = 2; // default 접근 제한자
}

class AccessobjExam extends AccessObj{
    public static void main(String[] args) {
        AccessobjExam obj = new AccessobjExam();
        System.out.println(obj.p);
        System.out.println(obj.p2);
        System.out.println(obj.k);
        // System.out.println(obj.i); // i는 private 라서 접근을 못한다
    }
}


