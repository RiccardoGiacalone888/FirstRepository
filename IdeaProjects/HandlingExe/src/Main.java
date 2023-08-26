public class Main {
    public static void main(String[] args) {
        double[] testScore = {2.15, 50, 95.02, 100.01};

        for (double score : testScore) {
            try {
                ScoreMain.checkScore(new double[]{score});
            } catch (ArithmeticException e) {
                System.out.println("Exception: " + e.getMessage());
            }
        }
    }
}