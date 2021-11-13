package javaArray;


import java.util.Arrays;
import java.util.List;


public class CheckIfElementExistsInArray {
//    java check if element exists OR contains in array
public static void main(String[] args) {

    String[] arrayOfElements = {"A", "B", "C", "D", "E"};

    //Convert String to List using: Arrays.asList
    List<String> elements = Arrays.asList(arrayOfElements);

    //Then Check with dot contains
    if(elements.contains("G")){
        System.out.println("Hello C");
    }else {
        System.out.println("Element not found");
    }
}

}
