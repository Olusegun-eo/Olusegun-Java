package playGround;

import java.util.ArrayList;
import java.util.Scanner;

public class HowToGetAUserToAddToAnArrayList {

//    About chores

        public static void main(String[] args) {

            Boolean close = false;

            ArrayList<String> name = new ArrayList();
            ArrayList<String> chores = new ArrayList();

            Scanner scanner = new Scanner(System.in);


            System.out.println("Please enter '0'to exit");
            System.out.println("Please enter name: ");
            String answer = scanner.nextLine();
            if (answer == "0") {
                close = true;
                System.out.println("Program has been terminated.");
            }
            else {
                name.add(answer);

                do {

                    System.out.println("Please enter chore: ");
                    answer = scanner.nextLine();
                    chores.add(answer);
                    System.out.println("Please enter name: ");
                    name.add(answer);


                }while(answer != "0");
            }
        }
}



//while (input.hasNextInt()) {
//        integerList.add(input.nextInt());
//        if (integerList.size() > 10)
//        break;*/