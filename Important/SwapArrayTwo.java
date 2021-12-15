package Important;

import java.util.Arrays;

public class SwapArrayTwo {
     public static void main(String[] args) {
            getArray();
            System.out.println();
            getArrayOne();

        }


        //    This print from largest to the greatest if ">" otherwise it is reverse
        public static void getArrayOne() {
            int[] arrays = {-2, 8, 4, 9, 5, 1};

            for (int i = 0; i < arrays.length; i += 1) {
                for (int j = 0; j < arrays.length; j++) {
                    if (arrays[i] > arrays[j]) {
                        int temp = arrays[i];
                        arrays[i] = arrays[j];
                        arrays[j] = temp;
                    }
                }

                System.out.println(Arrays.toString(arrays));
            }
        }
        public static void getArray() {
            int[] array = {-2, 8, 4, 9, 3, 1};
//            int temp;
            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] > array[j]) {
                       int temp = array[i];
                        array[i] = array[j];
                        array[j] = temp;
                    }
                }

            }
            System.out.println(Arrays.toString(array));
        }

}
