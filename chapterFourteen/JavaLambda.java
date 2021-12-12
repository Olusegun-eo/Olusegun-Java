package chapterFourteen;

import java.util.ArrayList;

public class JavaLambda {
    public static void main(String[] args) {
        lamda();

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(2);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(9);
        arrayList.add(10);

        arrayList.forEach((n) -> { System.out.println(n);});
    }


    public static void lamda() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        numbers.forEach((x) -> {System.out.println(x); });
    }
}


