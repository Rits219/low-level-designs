package com.shrayansh.model;

public class Pawn extends Piece{
    public Pawn(Colour pieceColour) {
        super(pieceColour);
    }

    @Override
    public boolean validateMove(Cell start, Cell end) {
        // validation method for Pawn
        if(this.pieceColour == Colour.WHITE){
           if(start.getX()!=end.getX() || (end.getY()- start.getY()!=1) || (end.getY()>=8)){
               return false;
           }
           if(end.getPiece()!=null){
               if(end.getPiece().getPieceColour() == Colour.WHITE){
                   return false;
               }
           }
        }

        return true;
    }
}
