package Challange;

/**
 * Create a method called displayHighScorePosition
 * it should a players name as a parameter, and a 2nd parameter as a position in the high score table
 * You should display the players name along with a message like " menaged to get into position" and
 * the position they got and a further message " on the high score table".
 *
 * Create a 2nd method called calculateHighScorePosition
 * it should be sent one argument only, the player score
 * it should return an int
 * the return data should be
 * 1 if the score is >1000
 * 2 if the score is > 500 and < 1000
 * 3 if the score is > 100 and < 500
 * 4 in all other cases
 * call both methods and display the results of the following
 * a score of 1500, 900, 400 and 50
 */

public class HighScorePosition {
    public static String player;
    public static String position;
    public static int score = 0;

    public void displayHighScorePosition(String player, String position) {
    }

    public int calculateHighScorePosition(int score) {
        if (score > 1000) {
            return 1500;
        } else if (score > 500 && score < 1000) {
            return 900;
        } else if (score > 100 && score < 500) {
            return 400;
        } else {
            return 50;
        }
    }
}

class test extends HighScorePosition{
    public static void main(String[] args) {
        System.out.println(player + "managed to get into position " + " the position they got and a further message");
        System.out.println(score);
    }
}
