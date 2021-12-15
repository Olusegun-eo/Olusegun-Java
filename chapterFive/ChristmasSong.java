package chapterFive;

import java.util.Scanner;

public class ChristmasSong {

    private static int numberOfDays;
    private static String day;
    private static String track;
    private static String song = "";
    private static double duration;

    public static void main(String[] args) {

        day = "";
        for (int numberOfDays = 1; numberOfDays<= 12; numberOfDays++) {

            switch (numberOfDays) {
                case 1:
                    day = "First";
                    track = "Let's Waste Ross";
                    duration = 7.09;
                    break;
                case 2:
                    day = "Second";
                    track = "What's the Jackanory (Story)?";
                    duration = 6.02;
                    break;
                case 3:
                    day = "Third";
                    track = "Antenatal Classes";
                    duration = 5.31;
                    break;
                case 4:
                    day = "Fourth";
                    track = "Ronan Goes Ballistic";
                    duration = 4.46;
                    break;
                case 5:
                    day = "Fifth";
                    track = "Swimming Classes";
                    duration = 3.44;
                    break;
                case 6:
                    day = "Sixth";
                    track = "Lillies on New Year's";
                    duration = 3.57;
                    break;
                case 7:
                    day = "Seventh";
                    track = "What Will We Call the Baby?";
                    duration = 5.02;
                    break;

                case 8:
                    day = "Eighth";
                    track = "Mothercare";
                    duration = 3.26;
                    break;

                case 9:
                    day = "Nineth";
                    track = "Totalling the RAV4";
                    duration = 6.12;
                    break;

                case 10:
                    day = "Tenth";
                    track = "Let's Practice with a Virtual Baby";
                    duration = 4.34;
                    break;

                case 11:
                    day = "Eleventh";
                    track = "Ross Realises He Is a Major Shit";
                    duration = 5.10;
                    break;

                case 12:
                    day= "Twelveth";
                    track= "Let's Make Amends";
                    duration = 4.21;
                    break;
            }
        }
        System.out.printf("the %s%n We play Christmas song %s%n and the duration is %s%n" , day, track, duration );
    }
}
