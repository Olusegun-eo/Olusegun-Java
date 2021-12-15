package chapterTen.polymor;

public class Bird extends Animal{

    @Override
    public String move(){
        System.out.println("We can also move like other movers");
        return null;
    }

    public void fly(){
        System.out.println("Flying is what we do");
    }

    public void suck(){
        System.out.println("This is we do");
    }
}
