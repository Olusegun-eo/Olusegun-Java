import java.util.Arrays;

public class BinarySearch {


    public static int performBinarySearch(int[] scores, int target) {
        Arrays.sort(scores);//This is in case my array is not sorted yet
         int lowerBound = 0;
         int upperBound = scores.length -1;

         while (lowerBound <= upperBound){
           int midBound = (lowerBound + upperBound) / 2;
             if (scores[midBound] == target){
                 return scores[midBound];
             }
             else if (scores[midBound] < target){
                 lowerBound = midBound + 1;
             }else
                 upperBound = midBound -1;
         }
        return -1;
    }
}
