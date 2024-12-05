package com.shrayansh.model;

public class Knight extends Piece{
    public Knight(Colour pieceColour) {
        super(pieceColour);
    }

    @Override
    public boolean validateMove(Cell start, Cell end) {
        // validation method for Knight
        return true;
    }
}
