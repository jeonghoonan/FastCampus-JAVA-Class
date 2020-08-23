package Challange;

public class Main {
    public static void main(String[] args) {
        String player, position;
        boolean gameOver = true;

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("K", highScorePosition);
        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("J", highScorePosition);
        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Q", highScorePosition);
        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("M", highScorePosition);
    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position "
                + highScorePosition + " on the high score table.");
    }

        public static int calculateHighScorePosition(int playerScore) {
            if (playerScore >= 1000) {
                return 1;
            } else if (playerScore >= 500 && playerScore < 1000) {
                return 2;
            } else if (playerScore >= 100 && playerScore < 500) {
                return 3;
            } else {
                return 4;
            }
        }
}