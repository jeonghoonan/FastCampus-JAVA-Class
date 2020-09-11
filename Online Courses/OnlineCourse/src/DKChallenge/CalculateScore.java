package DKChallenge;

/**
 * * 값이 참인경우 "your final score was (점수)"가 출력되고
 *  * 만약, 참이 아니라면 -1을 리턴해주는 method를 구현해봐유.
 *  *
 *  * 정수형 타입을 받는 method이구유, 이름은 calculateScore로 하면 되유.
 *  * 점수를 계산하는데 필요한 요소들은 score, levelCompleted, bonus 라는 이름의 정수형 타입이구유,
 *  * 공식은 score + (levelCompleted * bonus)로 하면 될 것 같네유.
 *  * 그럼 잘해봐유
 */

public class CalculateScore {
    private boolean gameOver = true;
    private int score;
    private int levelCompleted;
    private int bonus;

    public CalculateScore(int score, int levelCompleted, int bonus) {
        setScore(score);
        setLevelCompleted(levelCompleted);
        setBonus(bonus);

        if (gameOver == true) {
            System.out.printf("Total is = " + score + (levelCompleted * bonus));
        } else {
            System.out.println("-1");
        }
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getLevelCompleted() {
        return levelCompleted;
    }

    public void setLevelCompleted(int levelCompleted) {
        this.levelCompleted = levelCompleted;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
}

class CalTest {
    public static void main(String[] args) {
        CalculateScore cal = new CalculateScore(2, 3, 4);
    }
}
//    public static void main(String[] args) {
//        boolean gameOver = true;
//        int score = -1;
//        int levelCompleted = 5;
//        int bonus = 100;
//
//        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
//        System.out.println("Your final score was " + highScore);
//
//    }
//
//    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
//
//        if (gameOver) {
//            int finalScore = score + (levelCompleted * bonus);
//            return finalScore;
//        }
//
//        return -1;
//    }
//}



//    public static void main(String[] args) {
//        boolean gameOver = true;
//        int score = 800;
//        int levelCompleted = 5;
//        int bonus = 100;
//
//        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
//        System.out.println("Your final score was " + highScore);
//
//        score = 10000;
//        levelCompleted = 8;
//        bonus = 200;
//
//        highScore = calculateScore(gameOver, score, levelCompleted, bonus);
//        System.out.println("Your final score was "+highScore);
//    }
//
//    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
//
//        if (gameOver) {
//            int finalScore = score + (levelCompleted * bonus);
//            finalScore += 1000;
//            return finalScore;
//        }
//
//        return -1;
//    }





//    public int score;
//    public int levelCompleted;
//    public int bonus;
//
//    public static int CalculateScore(int score) {
//        if (score > 0) {
//            return score;
//        } else {
//            return -1;
//        }
//    }
//
//    public static void main(String[] args) {
//        System.out.println("Score is = " + score + (levelCompleted * bonus));
//    }

//    private int score;
//    private int levelCompleted;
//    private int bonus;
//
//    public CalculateScore(int score, int levelCompleted, int bonus) {
//        this.score = score;
//        this.levelCompleted = levelCompleted;
//        this.bonus = bonus;
//    }
//
//    public int getScore() {
//        return score;
//    }
//
//    public void setScore(int score) {
//        this.score = score;
//    }
//
//    public int getLevelCompleted() {
//        return levelCompleted;
//    }
//
//    public void setLevelCompleted(int levelCompleted) {
//        this.levelCompleted = levelCompleted;
//    }
//
//    public int getBonus() {
//        return bonus;
//    }
//
//    public void setBonus(int bonus) {
//        this.bonus = bonus;
//    }
//
//    public int calculateScore (int score) {
//        if (score > 1) {
//            return score;
//        } else {
//            return -1;
//        }
//    }
//}
//
//class CalculateScoreTest {
//    public static void main(String[] args) {
//        CalculateScore cal = new CalculateScore(-1, 3, 4);
//        System.out.println(cal.getScore() + (cal.getBonus() * cal.getLevelCompleted()));
//    }
//}