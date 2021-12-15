import java.lang.reflect.Array;

public class SholaArray {

    public static void main(String[] args) {
        int [] array = {1, 2, 3, 4, 5};

        for (int i = 0; i < array.length; i++) {
            array[i] +=1;
            System.out.println(Array.get(array, i));
        }

        main();
    }


    public static int main(){
        int [] newaArray = {1, 2, 3, 4, 5, 6};
        int middleBound;
        int lowerBound = 0;
        int upperBound = newaArray.length-1;
        while(lowerBound <= upperBound){
             middleBound = (lowerBound + upperBound) / 2;
            int target = 5;
            if(newaArray[middleBound] == target){
                return newaArray[middleBound];
            }
            else if(newaArray[middleBound] < target){
                middleBound = lowerBound + 1;
            }
            else{
                middleBound = upperBound - 1;
            }
        }
        return -1;
    }
}
