package automaticBike;

public class AutomaticBike {
   private String myBikename;
   private boolean power;
   private  String password;
   private int speed;
   private int gear;


    public void authenticateMyBike(String password) {
        this.password = "@378XS";
    }
    public String getPassword(String password) {
        return password;
    }

    public void bikeName(String myBikename) { this.myBikename = myBikename; }

    public boolean isPowerOn() { return power; }

    public void powerBike(boolean power) { this.power = power;}

    public String getBikeName() { return  myBikename;}


    public void increaseCurrentSpeed() {

        if (speed >= 40 ){
            speed = speed + 4;
            gear = 4;
        }

        if (speed >= 30 && speed <= 40) {
            speed = speed + 3;
            gear = 3;
            if (gear == 41) { gear = 4; }
        }
            if (speed >= 21 && speed <= 30) {
                speed = speed + 2;
                gear = 2;
                if (speed == 31) { gear = 3; }
            }

            if (speed <= 21) {
                speed = speed + 1;
                gear = 1;
                if (speed == 21) { gear = 2; }
             }
        }


    public int getCurrentSpeed() { return speed; }

    public int getGearOne(){ return gear; }

    public int getGearTwo(){ return gear; }

    public int getGearThree(){ return gear; }

    public int getGearFour(){ return gear; }


    public void decreaseCurrentSpeed() {

        if (speed >= 40) {
            speed = speed - 4;
            gear = 4;
        }

        if (speed >= 30 && speed <= 40) {
            speed = speed - 3;
            gear = 3;
            if (gear == 41) {
                gear = 4;
            }
        }

        if (speed >= 21 && speed <= 30) {
            speed = speed - 2;
            gear = 2;
            if (speed == 31) {
                gear = 3;
            }
        }


        if (speed <= 21) {
            speed = speed - 1;
            gear = 1;
            if (speed == 21) {
                gear = 2;
            }
        }
    }

}




















/*


package assignmentChapterThree;

public class Practise {

    //Nested Loop

    public static void main(String args) {
        for(int i=1;i<=3;i++){
//loop of j
            for(int j=1;j<=3;j++){
                System.out.println(i+" "+j);
            }//end of i
        }//end of j
    }

    //Nested Loop

    public void nestedLoop(){

        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();//new line
        }
    }
}

    public void forEachLoop(){
        //Declaring an array
        int arr[]={12,23,44,56,78};
        //Printing array using for-each loop
        for(int i:arr){
            System.out.println(i);
        }
    }
}


//A Java program to demonstrate the use of labeled for loop
//We can have a name of each Java for loop.It is useful if we have nested for loop
public class LabeledForExample {
    public static void main(String[] args) {
        //Using Label for outer and for loop
        aa:
        for(int i=1;i<=3;i++){
            bb:
            for(int j=1;j<=3;j++){
                if(i==2&&j==2){
                    break aa;
                }
                System.out.println(i+" "+j);
            }
        }
    }
}


//Java program to demonstrate the use of infinite for loop
//which prints an statement
public class ForExample {
    public static void main(String[] args) {
        //Using no condition in for loop
        for(;;){
            System.out.println("infinitive loop");
        }
    }
}



    int i  = 0;
while(i<=100) {
        sou;
        i++
        }

        init = 1;

        do{
        system.out.pritnnwe;
        statement;
        }
        while(i<=10)
        i++;



//Fiboannci  Seriess Without Recursion

class FibonacciExample1{
    public static void main(String args[])
    {
        int n1=0,n2=1,n3,i,count=10;
        System.out.print(n1+" "+n2);//printing 0 and 1

        for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed
        {
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }

    }}


//Fibonanci With Series

class FibonacciExample2{
    static int n1=0,n2=1,n3=0;
    static void printFibonacci(int count){
        if(count>0){
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" "+n3);
            printFibonacci(count-1);
        }
    }
    public static void main(String args[]){
        int count=10;
        System.out.print(n1+" "+n2);//printing 0 and 1
        printFibonacci(count-2);//n-2 because 2 numbers are already printed
    }
} */