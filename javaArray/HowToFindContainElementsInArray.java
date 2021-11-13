package javaArray;

public class HowToFindContainElementsInArray {

    public static void main(String[] args) {

        int[] arrayOfElements = {1, 2, 3, 4, 7};
        int toFind = 10;
        boolean isNumberFound = false;


        for (int number : arrayOfElements) {
            if (number == toFind) {
                isNumberFound = true;
                break;
            }
        }
            if(isNumberFound){
                System.out.println( toFind + ": is found");
            }else{
                System.out.println(toFind + ": is not found");
            }

        }
}
