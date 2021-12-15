public class MergeSort {


    public static int performMergeSort(int[] array, int [] temp, int start, int end, int mid) {

        //  We can write all recursive functions using
// the format:
        /*
if(test for the base case) {
    return some base case value
}else if(test for another base case){
    return some other base case value
    // the recursive case
}else{
    return (some work and then a recursive call)
}
*/

        for (int count = start; count < end; count++) {
            temp[count] = array[count];
        }

        return 0;
    }
}
