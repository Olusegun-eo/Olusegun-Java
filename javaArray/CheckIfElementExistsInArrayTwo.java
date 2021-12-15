package javaArray;

import java.util.Arrays;

public class CheckIfElementExistsInArrayTwo {

    public static void main(String[] args) {

        String[] array = {"A", "B", "C"};

   	// Convert to stream and test it
        boolean check = Arrays.stream(array).anyMatch("B"::equals);

        //Then Check with dot contains
        if(check){
            System.out.println("Yah head dey dia");
        }
    }
}