package chapterEleven.CreateArrayListFromArray;

import java.util.ArrayList;
import java.util.Collections;

public class ConversionOfArrayUsingCollections {

/*
Conversion of an Array to ArrayList Using Collections.addAll()
Collections.addAll(arraylist, new Element(1), new Element(2), new Element(3), new Element(4));
It is faster in Performance

   STYNTAX
  Collections.addAll(arraylist, new Element(1), new Element(2), new Element(3), new Element(4));

 */
    public static void main(String[] args) {

        String [] names = {"John", "taye", "Blogs", "Nashville"};

        ArrayList<String> nameList = new ArrayList<String>();

        Collections.addAll(nameList, names);
        nameList.add("I'am here");

//        System.out.println(nameList);
//        OR THIS ONE

        for (String name : nameList){
            System.out.println(name);
        }

        /*
        OR THIS ONE

        for (int count = 0; count < nameList.size(); count++) {
            System.out.println((count+1) + ": "+nameList.get(count));
        }*/
    }
}
