package playGround.Abstraction;

public abstract class GraphiObject {
    //It automatically get some properties
    //The first property is that One of the Methods of Abstract class must be Abstract method
    int row;
    int col;

    public void moveTo(int newRow, int newCol){
        System.out.println("Move to row : "+ row + " and col: "+ col);
    }

    //The first property: You just provide the declaration but not the implementation
    //NOTE: to provide implementation the 2Abstract methods: You've to EXTEND THE ABSTRACT CLASS
    //By creating a sub Class For GeoGraphics
    //If you do not reference all the ABSTRACT methods that are in the Parent class in the Child class
    //of an Abstract Class, child class will flag ERROR. To solve this, Make the SubClass ABSTRACT or
    //REFERENCE all the METHODSn in the SUB-CLASS
    abstract void draw();
    abstract void resize();
}
