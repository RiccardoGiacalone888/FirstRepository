public class ScoreMain {
    public static void checkScore (double[] scores) {
        for (double score : scores) {
            if (score > 0 && score <= 50.00) {
                System.out.println("Average score");
            } else if (score > 50.00 && score <= 100.00) {
                System.out.println("Very good score");
            } else {
                throw new ArithmeticException("Score is out of scale!");
            }
        }


    }
}


