package chapterEight;

public class HighestMarkForLinearArray {

    public static void main(String[] args) {
        int[] marks = {23, 45, 56, 67, 78, 88, 89};

        int highestMark = getHighestMark(marks);
        System.out.println("The highest mark is" + highestMark + " ");
    }

    private static int getHighestMark(int[] marks) {
        int highScore = marks[0];
        for (int mark : marks) {
            if (highScore < mark) {
                highScore = mark;
            }
            System.out.println();
        }
        return highScore;
    }
}