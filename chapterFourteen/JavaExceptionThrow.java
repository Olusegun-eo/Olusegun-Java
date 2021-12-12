package chapterFourteen;

public class JavaExceptionThrow {

    public static void main(String[] args) {
        checkAge(15);
    }

     static void checkAge(int age) {
        if (age < 18){
            throw new IllegalArgumentException("Access denied because you're less than 18years");
        }
        else {
            System.out.println("Access granted");
        }
    }
}
