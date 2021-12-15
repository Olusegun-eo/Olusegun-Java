package playGround.Abstraction;

public abstract class Circle extends GraphiObject{
     void draw(){
        System.out.println("We can draw coordinate");
    }

     void resize(){
        System.out.println("We can change the size of the Circle");
    }

}
