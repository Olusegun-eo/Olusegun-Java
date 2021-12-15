package chapterEleven.CreateArrayListFromArray;

import java.util.ArrayList;

public class ConversionOfArrayUsingAdd {


//    Using this method, we can create a new list and add the list elements in a much simpler way.
//    The syntax for the add() method is as below:
//    arraylist.add(element);

    public static void main(String[] args) {

        String [] planets = {"Jupiter", "Saturtus", "Earth", "Sun", "Moon"};
        ArrayList<String> planetList = new ArrayList<>();

        for (int i = 0; i < planets.length; i++){
            planetList.add(planets[i]);
        }
        for (String each: planetList){
            System.out.println(each);
        }
    }
}
