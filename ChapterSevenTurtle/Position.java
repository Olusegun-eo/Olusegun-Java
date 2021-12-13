package ChapterSevenTurtle;

public class Position {

    private int rowPosition;
    private int columnPosition;

    @Override
    public String toString() {
        return "Position{" +
                "rowPosition=" + rowPosition +
                ", columnPosition=" + columnPosition +
                '}';
    }

    public Position(int rowPosition, int columnPosition) {
        this.rowPosition = rowPosition;
        this.columnPosition = columnPosition;
    }


    public void setColumnPosition(int columnPosition){
        this.columnPosition = columnPosition;
    }

    public int getColumnPosition(){
        return columnPosition;
    }

    public void setRowPosition(int rowPosition){
        this.rowPosition = rowPosition;
    }

    public int getRowPosition() {
        return rowPosition;
    }

    public void increaseColumnPositionBy(int numberOfSteps){
        columnPosition += numberOfSteps;
    }

    public void increaseRowPositionBy(int numberOfSteps){
        rowPosition += numberOfSteps;
    }


    @Override
    public boolean equals(Object anotherPosition){
        if (this == anotherPosition) return true;
        if (!(anotherPosition instanceof Position positionToBeCompared) ) return false;

        boolean rowsAreEqual = rowPosition == positionToBeCompared.rowPosition;
        boolean columnsAreEqual = columnPosition == positionToBeCompared.columnPosition;
        return rowsAreEqual && columnsAreEqual;
    }




//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Position position = (Position) o;
//        return rowPosition == position.rowPosition && columnPosition == position.columnPosition;
//    }



//    @Override
//    public boolean equals(Object o){
//
//        Position comparedPosition = (Position) o;
//        //if (this ==  comparedPosition)
//
//        if(columnPosition==comparedPosition.columnPosition && rowPosition == comparedPosition.rowPosition)
//
//        return false;
//
//    }


}


/*
    @Override
    public boolean equals(Object anotherPosition){
        if (this == anotherPosition) return  false;
        if (anotherPosition.getClass().isInstance(this)) return false;
        if (!(anotherPosition == null) {

        }

        Position comparedPosition = (Position) anotherPosition;

        boolean rowsAreEqual = rowPosition == comparedPosition.rowPosition;
        boolean columnsAreEqual = columnPosition == comparedPosition.columnPosition;
        return columnsAreEqual & rowsAreEqual;
    }
*/