package com.shrayansh.model;

public class Queen extends Piece{
    public Queen(Colour pieceColour) {
        super(pieceColour);
    }

    @Override
    public boolean validateMove(Cell start, Cell end) {
        // validation method for Queen
        return true;
    }
}
