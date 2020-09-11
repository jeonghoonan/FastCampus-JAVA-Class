package Interface;

/**
 * 인터페이스 : 서로 관계가 없는 물체들이 상호 작용하기위해 사용하는 장치나 시스템
 *  추상 메소드와 상수를 정의할수 있다
 *  인터페이스에서 정의된 메소드는 모두 추상 메소드이다.
 * 사용방법 : 인터페이스는 사용할때 인터페이스를 구현하는 클래스에서 implements 키워드를 이용한다
 */

public interface TV {
    public int MIN_VOLUME = 0;
    public int MAX_VOLUME = 100;

    public void turnOn();
    public void turnOff();
    public void changeVolume(int volume);
    public void changeChannel(int channel);
}

/**
 * 인터페이스에서 변수를 선언하고 컴파일시
 * 인터페이스에서 정의된 메소드는 모두 추상 메소드이다
 */
//------>

//public static final int MAX_VOLUME = 100;
//public static final int MIN_VOLUME = 0;
//
//public abstract void on();
//public abstract void off();
//public abstract void volume(int value);
//public abstract void channel(int number);