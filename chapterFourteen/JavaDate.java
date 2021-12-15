package chapterFourteen;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class JavaDate {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        System.out.println(time);


        LocalDate date =  LocalDate.now();
        System.out.println(date);

        LocalDateTime localTime = LocalDateTime.now();
        System.out.println(localTime);


        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("E/MMM/yyy ~ HH-mm-ss: ns");
        String dateTime = localTime.format(dateTimeFormatter);
        System.out.println("Time and Date is: " + dateTime);
    }
}
