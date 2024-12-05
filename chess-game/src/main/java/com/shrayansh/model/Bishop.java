package com.shrayansh.model;

public class Bishop extends Piece{
    public Bishop(Colour pieceColour) {
        super(pieceColour);
    }

    @Override
    public boolean validateMove(Cell start, Cell end) {
        // validation method for Bishop
        return true;
    }
}
