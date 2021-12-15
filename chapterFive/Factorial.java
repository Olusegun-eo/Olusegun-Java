package chapterFive;

public class Factorial {

//    fac = fac *(1-n)*n;
    int number =6;
    int sub = 1;
    int factorialOfNmuber = 1;

    public int calculateFactorial(){
        for (int sub = 1; sub < 6; sub++) {
            factorialOfNmuber = factorialOfNmuber * (number - sub) * number;
//            factorialOfNmuber = factorialOfNmuber*sub;
        }
        return factorialOfNmuber;
    }
}
