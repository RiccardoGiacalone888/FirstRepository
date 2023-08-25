public class Main {
    public static void main(String[] args) {
        testCheck(2.15);
        testCheck(50.00);
        testCheck(95.02);
        testCheck(100.01);
    }

    public static void checkScore(double score) {
        if (0 < score && score < 50.00) {
            System.out.println("The score is low : " + score);
        } else if (50.00 < score && score < 100.01) {
            System.out.println("The score is good : " + score);

        } else {
            throw new ArithmeticException("Score is out of scale");
        }
    }

    public static void testCheck(double score) {
        try {
            System.out.println("Score : " + score);
            checkScore(score);
        } catch (ArithmeticException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
}
