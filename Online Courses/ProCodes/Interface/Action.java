package Interface;

/**
 * 익명클래스
 *  익명중첩클래스는 익명클래스라고 하며, 내부 클래스 이기도 하다
 */

// 추상클래스 Action
public abstract class Action {
    public abstract void exec();
}

// 추상클래스 Action 을 상속받은 클래스 MyAction

class MyAction extends Action {

    @Override
    public void exec() {
        System.out.println("exec");
    }
}

// MyAction 을 사용하는 클래스 ActionExam
class ActionExam {
    public static void main(String[] args) {
//        Action action = new MyAction();
//        action.exec();
        /**
         * 이렇게 사용하는게 일반적인 형태
         */
// Myaction 을 사용하지 않고 Action 을 상속받는 익명 클래스 만들어서 사용
        Action action = new Action() {
            @Override
            public void exec() {
                System.out.println("exec");
            }
        };
        action.exec();
    }
}

/**
 * 생성자 다음에 중괄호 열고 닫고가 나오면, 해당 생성자 이름에 해당하는 클래스를 상속받는 이름없는 객체를 만든다를 뜻한다
 * 괄호안에는 메소드를 구현/추가할수있다. 이렇게 생성된 이름없는 객체를 actioin이라는 참조변수가 참조하도록 exec()메소드 호출
 * 익명클래스를 만드는 이유는 Action을 상속받는 클래스를 만들 필요가 없을경우
 * Action 을 상속받는 클래스가 해당 클래스에서만 사용되고 다른클래스에서는 사용되지 않는 경우
 */
