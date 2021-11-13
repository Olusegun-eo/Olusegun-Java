package chapterEleven.ConvertArrayOfString;

public class ConvertArrayUsingStringJoin {

    public static void main(String[] args) {
        String [] stringsOfnumbers = {"One", "two", "Three", "Four", "Five", "Six"};

        String convertArray = String.join(" " , stringsOfnumbers);
        System.out.println(convertArray);
    }
}
