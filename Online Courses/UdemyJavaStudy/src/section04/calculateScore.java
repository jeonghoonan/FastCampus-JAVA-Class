package section04;

/**
 * overloading
 */

public class calculateScore {
    public static void main(String[] args) {
        int newScore = calculateScore("Tim", 500);
        System.out.println("New score Is " + newScore);
        calculateScore();
    }

    public static int calculateScore(String playername, int score) {
        System.out.println("Player " + playername + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score");
        return 0;
    }
}
