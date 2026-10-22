import java.util.Arrays;

public class Main {
    public static void main(String []args){
        int[] testScores = {10,5,7,4,9,8,7,7,5,10};

        double avg;
        int highScore= testScores[0];
        int lowScore= testScores[0];

        int total = 0;
        for(int score:testScores){

            total += score;
            if(score > highScore){
                highScore = score;
            }

            if (score < lowScore){
                lowScore = score;
            }


            }

        double median;
        int middle =  testScores.length / 2;
        Arrays.sort(testScores);
        if (testScores.length % 2 == 0) {
            median = (testScores[middle - 1] + testScores[middle]) / 2.0;
        } else{
            median = testScores[middle];
        }

        avg = (double) total/testScores.length;

        System.out.println("Average: " + avg);
        System.out.println("High score: " + highScore);
        System.out.println("Low score: " + lowScore);
        System.out.println("Median: " + median);

    }


}
