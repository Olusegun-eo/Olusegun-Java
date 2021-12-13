package ChapterSevenTurtle;

import static ChapterSevenTurtle.PenPosition.UP;

public class Pen {

    //Here we initialize the Composition Method AND import ENUM Class
    private PenPosition penPosition = UP;

    public void setPosition(PenPosition currentPosition){
        penPosition = currentPosition;
    }

    public PenPosition getPosition(){
        return penPosition;
    }


}
