package everyEnumConstantRepAnObjectOfTypeEnum;

import static everyEnumConstantRepAnObjectOfTypeEnum.Day.*;

public class EnumConstantsRepresentAnObjectOfTypeEnum {

   /* Every enum constant represents an object of type enum.
    enum type can be passed as an argument to switch statement.*/

    Day day;

    public EnumConstantsRepresentAnObjectOfTypeEnum(Day day) {
        this.day = day;
    }


    // Driver class that contains an object of "day" and // main().
    public static void main(String[] args) {
        //This Will print SUNDAY
        Day day;
         day = SUNDAY;
        System.out.println(day);

        //This Will print SUNDAY
        //Function name() return the name of this enum constant,
        // exactly as declared in its enum declaration
        String theDay = SUNDAY.name();
        System.out.println(theDay);



        String str = "MONDAY";
        EnumConstantsRepresentAnObjectOfTypeEnum ennum =  new EnumConstantsRepresentAnObjectOfTypeEnum(Day.valueOf(str));
//        System.out.println(ennum);
        ennum.dayLike();
    }

    public void dayLike(){
        switch (day)
        {
            case SUNDAY -> {
                System.out.println(SUNDAY + "My most preferred DAY");
                break;
            }

            case MONDAY -> {
                System.out.println(MONDAY+ " The beginning of my good things");
                break;
            }

            case TUESDAY -> {
                System.out.println("My birth day, You're full of goodness for me");
                break;
            }

            case WEDNESDAY -> {
                System.out.println("The Flow Favour from God and men");
                break;
            }

            case THURSDAY -> {
                System.out.println("Thou will walk the path of my words and obey all my words");
                break;
            }
            case FRIDAY -> {
                System.out.println("Even in the end The Flow shall still be fresh");
                break;
            }

            case SATURDAY -> {
                System.out.println("My strength shall not be abated");
                break;
            }
            default -> {
                System.out.println("try again");
            }
        }
    }
}
