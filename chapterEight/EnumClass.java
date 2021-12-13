package chapterEight;


enum Levels{
    HIGH, LOW, MEDIUM;
}

public class EnumClass {
    //ENUM==>>> Enumeration
    //It is like if a Class and an Array have a baby
    //It is a list of values that doesn't Change but it is set up like a class
    //It is Set up like a class and can be accessed like a Class
    //ENUM DO not have types, it is Just a list of Labels== These labels are called CONSTRUCTORS

    //An ENUM can be inside of a class or Outside of Class

    //EXAMPLE


    public static void main(String[] args) {
//        Levels levels = Levels

    }


    public static void myStatus(Levels levels){

        String status;
        switch (levels){
            case HIGH ->  status = "The Weather is High here";
            case LOW -> status = "The Weather is code now";
            case MEDIUM -> status = "The Weather is moderate";
        }
        System.out.println(levels);
    }
}
