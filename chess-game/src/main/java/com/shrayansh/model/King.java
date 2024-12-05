package com.shrayansh.model;

public class King extends Piece{
    public King(Colour pieceColour) {
        super(pieceColour);
    }

    @Override
    public boolean validateMove(Cell start, Cell end) {
        // validation method for King
        return true;
    }
}
