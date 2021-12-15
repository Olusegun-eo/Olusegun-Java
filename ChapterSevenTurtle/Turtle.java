package ChapterSevenTurtle;

import static ChapterSevenTurtle.Direction.*;
import static ChapterSevenTurtle.PenPosition.DOWN;
import static ChapterSevenTurtle.PenPosition.UP;

public class Turtle {

    private Pen pen  = new Pen();
    private Direction currentDirection = Direction.EAST;
    private Position currentPosition = new Position(0, 0);

    public Pen getPen(){
        return pen;
//        return new Pen();
    }

    public void penDown(){
        pen.setPosition(DOWN);
    }

    public void penUp(){
        pen.setPosition(UP);
    }


    public Direction getCurrentDirection() {
        return currentDirection;
    }

    public void turnRight(){
        //I can as well use switch here
        if (currentDirection == EAST) changeCurrentDirectionTo(SOUTH);//1
        if (currentDirection == NORTH) changeCurrentDirectionTo(EAST); //4
        if (currentDirection == WEST) changeCurrentDirectionTo(NORTH);//3
        if (currentDirection == SOUTH) changeCurrentDirectionTo(WEST);//2
    }



    public void changeCurrentDirectionTo(Direction newDirection){
        currentDirection = newDirection;
    }

    public void turnLeft(){
        //I can as well use switch here
        if (currentDirection == WEST) changeCurrentDirectionTo(NORTH);//4
        else if (currentDirection == SOUTH) changeCurrentDirectionTo(WEST);//3
        else if (currentDirection == EAST) changeCurrentDirectionTo(SOUTH);//2
        else if (currentDirection == NORTH) changeCurrentDirectionTo(EAST);//1
    }

//Position not void
    public Position getCurrentPosition() {
        return currentPosition;
    }

    public void moveForward(int numberOfSteps){
//        if(currentDirection == EAST) increaseColumnPositionBy(numberOfSteps);
        if (currentDirection == EAST) currentPosition.setColumnPosition(currentPosition.getColumnPosition() + numberOfSteps -1);
        if (currentDirection ==SOUTH) currentPosition.setColumnPosition(currentPosition.getColumnPosition() + numberOfSteps - 1);

    }

    private void increaseColumnPositionBy(int numberOfSteps){
        currentPosition.increaseColumnPositionBy(numberOfSteps);
    }


    public void writeOn(SketchPad sketchPad, int numberOfSteps) {
        if (this.pen.getPosition() == DOWN) {
            if (this.currentDirection == EAST) {
                int[][] floor = sketchPad.getFloor();
                 int rowPosition = currentPosition.getRowPosition();
                 int columnPosition = currentPosition.getColumnPosition();
                for (int i = 0; i < numberOfSteps; i++) {
//                    column is moving here and it is set to 1
                    floor[rowPosition][columnPosition + i] = 1;
                }
            }
        }
        moveForward(numberOfSteps);

    }
}
