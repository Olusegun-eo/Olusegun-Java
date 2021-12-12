package chapterSixteen;

import java.util.ArrayList;

public class GeneCollection {

    public static void main(String[] args) {
//THIS IS GENERIC TOP...WE ARE USING IT WITHOUT SPECIFYING THE PARAMETER TYPE(We're using it without generic)
//THIS IS THE REASON WE HAVE TO CAST IN METHOD ...printDouble(listGenerators)
//ArrayList as used here is RAW tye.... And it will TAKE-in Any type of PARAMETER



//        ArrayList listGenerators = new ArrayList ();

        ArrayList <Integer> listGenerators = new ArrayList<> ();

        listGenerators.add(2);
        listGenerators.add(3);
        listGenerators.add(4);
        listGenerators.add(5);

        printDoubleList(listGenerators);

    }


    public static void printDoubleList(ArrayList<Integer> intElementList) {
        //    public static void printDoubleList(ArrayList anything)
//        WITH THIS I WILL HAVE TO CAST FROM OBJECT TO INTEGER
//        for (Object elem : anything) {
//            System.out.println( (Integer) elem * 2);
//        }

//        WITH THIS, THERE IS NO NEED FOR CASTING
        for(Integer element :  intElementList){  //If I use int element <==> THis is call Auto-Boxing
            System.out.println( element * 3);
        }
    }
}
