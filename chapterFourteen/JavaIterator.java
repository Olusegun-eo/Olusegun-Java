package chapterFourteen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class JavaIterator {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(36);
        numbers.add(25);
        numbers.add(10);
        numbers.add(2);

        Iterator<Integer> itNum = numbers.iterator();
        while (itNum.hasNext()) {
            Integer eachNumber = itNum.next();
            if (eachNumber < 10){
                itNum.remove();
            }
        }
        System.out.println("Numbers: " + numbers);
    }
}


