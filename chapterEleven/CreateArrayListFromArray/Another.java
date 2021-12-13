package chapterEleven.CreateArrayListFromArray;

import java.util.ArrayList;
import java.util.Arrays;

public class Another {


    public static void main(String[] args) {
        String [] subs = {"Anythg", "Youar", "Weara", "TheName"};


        ArrayList<String> subSubs = new ArrayList<String>(Arrays.asList(subs));
        subSubs.add("Everything");
        subSubs.add("AllWeCraveFor");
        subSubs.add("AllTheseAndMore");


        for (String sub: subSubs){
            System.out.println(sub +" "+ "Language");
        }
    }
}
