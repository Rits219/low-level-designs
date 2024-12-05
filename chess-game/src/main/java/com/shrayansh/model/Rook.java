package com.shrayansh.model;

public class Rook extends Piece{
    public Rook(Colour pieceColour) {
        super(pieceColour);
    }

    @Override
    public boolean validateMove(Cell start, Cell end) {
        // validation method for Rook
        return true;
    }
}
