package chapterNine.polymorphismRectangle;

import java.awt.*;

public class RectangleForPolymorphism {

    //New lesson:  You can not use "this" on private attributes of a "public static
    //...method of a class....e.g this.myFilled inside getMyFilled method INSTEAD...you can
    //...use... className.attr => "RectangleForPolymorphism.myFilled"  BUT IF you remove "static
    //...keyword


    private Point myStart;
    private static int myWidth;
    private static int myHeight;
    private static String myColor;
    private static String myFilled;


    public RectangleForPolymorphism(Point myStart, String myColor, String myFilled,
                                    int myHeight, int myWidth) {
        this.myStart = myStart;
        this.myWidth = myWidth;
        this.myColor = myColor;
        this.myFilled = myFilled;
    }



    public static String getMyFilled(String myFilled) {
           return myFilled;
    }

    public static void setMyHeight(int myHeight) {
        RectangleForPolymorphism.myHeight = myHeight;
    }

    public static String getMyColor(String myColor) {
        RectangleForPolymorphism.myColor = "blue";
        return myColor;
    }

    public static void setMyColor(String myColor) {
        RectangleForPolymorphism.myColor = myColor;
    }

    public static int getMyWidth() {
        return myWidth;
    }

    public static void setMyWidth(int myWidth) {
        RectangleForPolymorphism.myWidth = myWidth;
    }

    @Override
    public String toString() {
        return "RectangleForPolymorphism{" +
                "myStart=" + myStart +
                '}';
    }
}
