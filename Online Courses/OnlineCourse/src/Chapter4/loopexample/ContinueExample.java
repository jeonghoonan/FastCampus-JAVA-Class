package Chapter4.loopexample;

 /** continue문
 *  반복문 수행중 조건문과 조건이 맞는경우 이후 블록 내부의 다른 수행문을 수행하지않음
 */

public class ContinueExample {
     public static void main(String[] args) {

         int num;

         for (num = 1; num <= 100; num++) {
             if ((num % 3) != 0) continue;

             }
             System.out.println(num);
         }
     }
