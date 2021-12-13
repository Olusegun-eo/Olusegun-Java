package playGround;

import java.util.Arrays;

public class ArrayOfObjects {

    public static void main(String[] args) {
        ClassOfArrayOfObject classOfArrayOfObject = new ClassOfArrayOfObject();

        ArrayOfObjects monkey = new ArrayOfObjects();
        ArrayOfObjects monkey_1 = new ArrayOfObjects();
        ArrayOfObjects monkey_2 = new ArrayOfObjects();

        ArrayOfObjects[] monkeys = {monkey, monkey_1, monkey};
        System.out.println(Arrays.stream(monkeys).findFirst());
    }
}
