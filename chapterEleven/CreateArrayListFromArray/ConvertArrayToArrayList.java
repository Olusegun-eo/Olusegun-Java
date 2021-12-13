package chapterEleven.CreateArrayListFromArray;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayToArrayList {

//        String[] array = new String[50]; This is array of fixed length50
//        Array length can't be modified or extended.-->i.e to add or remove from array
        //we have to create a new array



        //ArrayList<T> arraylist = new ArrayList<T>(Arrays.asList(arrayname));



//        Using Arrays.asList(), the array is passed to this method and a list object is obtained,
//                which is again passed to the constructor of the ArrayList class as a parameter.
//        The syntax of the Arrays.asList() is as below:



//        The ArrayList is a resizable array that stores a dynamic collection of elements found within the java.util package.

//        Conversion of an Array to ArrayList Using Collections.addAll()
//        This method lists all the array elements in a definite collection almost similar to Arrays.asList()
//    However, Collections.addAll() is much faster as compared to Arrays.asList() method on performance basis.
//    The syntax of Collections.addAll() is as below:

    public static void main(String[] args) {
        String [] subjects = {"Math", "English", "Biology", "language"};//This is array

        ArrayList<String> subList = new ArrayList<String>(Arrays.asList(subjects));//convert Array to ArrayList

        subList.add("Geography");
        subList.add("Physics");
        subList.add("Yoruba");

//        for (String string: subList){
//            System.out.println(string);
//        }

        for (int i = 0; i < subList.size(); i++) {
            System.out.println(subList.get(i));
        }
    }
}


