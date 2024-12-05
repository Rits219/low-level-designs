package com.shrayansh.model;

import java.util.ArrayList;
import java.util.List;

public class Player {
    String name;
    Colour pieceColour;
    List<Piece> pieces;

    public Player(String name, Colour pieceColour) {
        this.name = name;
        this.pieceColour = pieceColour;
        this.pieces = new ArrayList<>();
    }

    public void addPiece(Piece piece) {
        this.pieces.add(piece);
    }

    public void addAllPiece(List<Piece> piece) {
        this.pieces.addAll(piece);
    }

    public void removePiece(Piece piece) {
        this.pieces.remove(piece);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Colour getPieceColour() {
        return pieceColour;
    }

    public void setPieceColour(Colour pieceColour) {
        this.pieceColour = pieceColour;
    }

    public List<Piece> getPieces() {
        return pieces;
    }

    public void setPieces(List<Piece> pieces) {
        this.pieces = pieces;
    }
}
