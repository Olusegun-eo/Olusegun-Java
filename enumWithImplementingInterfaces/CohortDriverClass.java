package enumWithImplementingInterfaces;

import java.util.Arrays;

public class CohortDriverClass {

    Cohort cohort;
    public static void main(String[] args) {

        //Calling values(), ordinal() and valueOf() methods :
        //These methods are present inside java.lang.Enum.
        //values() method can be used to return all values present inside enum
        Cohort arrayOfCohort [] = Cohort.values();


        //MY ORIGINAL FOR LOOP
        for (int count = 0; count < arrayOfCohort.length; count++) {
            System.out.println(arrayOfCohort[count] + "\tat index of: " + arrayOfCohort[count].ordinal());
        }


        System.out.println();
        System.out.println(Cohort.valueOf("COHORTTWO"));
        System.out.println();

//        FOREACHORDERED LOOP
        Arrays.stream(arrayOfCohort).forEachOrdered(System.out::println);


//        ENHANCED LOOP
        for (Cohort value : arrayOfCohort) {
            System.out.println(value + "\t at index of\t" + value.ordinal());
        }

//        FOR EACH LOOP
        Arrays.stream(arrayOfCohort).forEach(System.out::println);

//        FOR DIRECTED LOOP
        for (int count = arrayOfCohort.length - 1; count >= 0; count--) {
            System.out.println(arrayOfCohort[count]);
        }

        for (int count = 0; count < arrayOfCohort.length; count++) System.out.println(arrayOfCohort[count]);


        //WHILE LOOP
        int count = 0;
        while (count < arrayOfCohort.length) {
            System.out.println(arrayOfCohort[count]);
            count++;
        }
    }
}
