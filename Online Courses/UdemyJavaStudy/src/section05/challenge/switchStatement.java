package section05.challenge;

/**
 * create a new switch statement using char instead of int
 * creat a new char variable
 * create a switch statement testing fo r
 *  A, B, C ,D or E
 * dispaly a message if any of these are found and then break
 * add a default which displays a message saying not found
 */

public class switchStatement {
    public static void main(String[] args) {

        char checkValue = 'E';
        switch (checkValue) {
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println(checkValue + " Found it!");
                break;

            default:
                System.out.println("Can't find it");
                break;
        }

        String month = "January";
        switch (month.toLowerCase()) {
            case "January":
                System.out.println("Jan");
                break;
            case "June":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure");
                break;
        }
    }
}
