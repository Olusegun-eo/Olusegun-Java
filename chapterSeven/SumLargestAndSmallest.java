//package chapterSeven;
//
//<<<<<<< HEAD
//    public class SumLargestAndSmallest {
//
//=======
//import java.util.Scanner;
//
//public class SumLargestAndSmallest {
//    private static int useResponse;
//    private static int index;
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the length of array you want to store: " );
//        useResponse = scanner.nextInt();
//
//        int[] elements = new int[useResponse];
//        for (int countNumberOfElements = 0; countNumberOfElements < useResponse; countNumberOfElements++) {
//            System.out.println("Enter the lists of elements here: " + (countNumberOfElements+1) );
//            elements[countNumberOfElements] = scanner.nextInt();
//        }
//
//        System.out.println("The elements in the Array are: ");
//        for (int count = 0; count < useResponse; count++) {
//            System.out.println(elements[count]);
//        }
//        /* for (int element : elements){System.out.println(element); }*/
//        System.out.println("supply index of the element to be removed ");
//        index = scanner.nextInt();
//
//        System.out.println(""+ calculateLargest(elements));
//    }
//
//    public static int calculateLargest(int[] elements){
//        int sumNewElement = 0;
//        for (int i = index; i < i - 1; i++) {
//            elements[i] = elements[useResponse + 1];
//        }
//        useResponse = useResponse - 1;
//        System.out.println("the new array");
//
//        for (int i = 0; i < useResponse; i++) {
//            System.out.println("element[" + i +"] = " +elements[i]);
//            sumNewElement +=elements[i];
//              int[] store= new int[elements[i] += sumNewElement];
//            }
//
//        System.out.println(" The removed elements is: "+elements[index]);
//        return sumNewElement;
//    }
//
//    public int calculateSmallest(){
//        return 0;
//    }
//>>>>>>> 08a78a1a85d8492383289b7b21fb490d24152c56
//}
