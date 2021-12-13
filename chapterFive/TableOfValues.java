package chapterFive;

public class TableOfValues {

    private static int count = 1;

    public static void main(String[] args) {

        while (count <=5) {
            System.out.println(count + " \t\t" + count*10 + " \t\t" + count*100 + " \t\t"+ count*1000);
            count++;
        }
    }
}
