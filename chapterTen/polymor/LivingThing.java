package chapterTen.polymor;

public class LivingThing {

    private static String aBird;

    public static void main(String[] args) {
        Animal [] animals = new Animal[5];
        animals[0] = new Bird();
        animals[1] = new Frog();


        Bird bird = new Bird();
        bird.move();
        System.out.println("This is the drill");

    }
}
