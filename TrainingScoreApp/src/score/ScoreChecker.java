package score;

public class ScoreChecker {

    public static void main(String[] args) {

        // Store 5 student scores in a single-dimensional array
        int[] scores = {95, 82, 68, 45, 90};

        // Check each student's score
        for (int score : scores) {

            if (score >= 90) {
                System.out.println(score + " - Excellent");
            } 
            else if (score >= 75 && score <= 89) {
                System.out.println(score + " - Good");
            } 
            else if (score >= 50 && score <= 74) {
                System.out.println(score + " - Average");
            } 
            else {
                System.out.println(score + " - Fail");
            }
        }
    }
}