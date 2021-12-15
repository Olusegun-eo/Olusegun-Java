package chapterSevenTicTacToe;

import static chapterSevenTicTacToe.BoardCell.*;

public class TicTacToe {

    private Board board = new Board();
    private BoardCell boardCell = EMPTY;

    //    First Method
    public Board getBoard() {
        return board;
    }

    public void setBoardCell(BoardCell currentBoardCell) {
        boardCell = currentBoardCell;
    }

    public BoardCell getBoardCell(){
        return boardCell;
    }


    public boolean isBoardCellsEmpty() {
        return true;
    }
}



// for ( Days day : Days.values())
//         twoDim[0][day.ordinal()]=day.name();
//         }
//         for ( Periods period : Periods.values() ){
//         for(int i=0; i<5; i++){
//        System.out.print (period + "\t\t");
//        }