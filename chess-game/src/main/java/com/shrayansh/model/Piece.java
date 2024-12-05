package com.shrayansh.model;

public abstract class Piece {
    protected Colour pieceColour;

    public Colour getPieceColour() {
        return pieceColour;
    }

    public void setPieceColour(Colour pieceColour) {
        this.pieceColour = pieceColour;
    }

    public Piece(Colour pieceColour){
        this.pieceColour = pieceColour;
    }
    public abstract boolean validateMove(Cell start, Cell end);
}
