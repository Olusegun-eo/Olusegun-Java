package chapterSix;

public class WorkingWithStaticFunction {
    public static WorkingWithStaticFunction shola;
    private static int instanceOfNumber;

    public static int additionOfTwoNumbers(int firstNmuber, int secondNumber){
        return firstNmuber + secondNumber;
    }

    public  static int multplyTwoNumbers(int firstNumber, int secondNumber){
        return firstNumber * secondNumber;
    }

    public static int getInstanceOfNumber(){
       return instanceOfNumber++;
    }
}
