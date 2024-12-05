package com.shrayansh;

import com.shrayansh.model.Bishop;
import com.shrayansh.model.Board;
import com.shrayansh.model.Cell;
import com.shrayansh.model.Colour;
import com.shrayansh.model.King;
import com.shrayansh.model.Knight;
import com.shrayansh.model.Pawn;
import com.shrayansh.model.Piece;
import com.shrayansh.model.Player;
import com.shrayansh.model.Queen;
import com.shrayansh.model.Rook;
import com.shrayansh.model.Status;

import java.util.Deque;
import java.util.Scanner;

public class Game {
    Board board;
    Deque<Player> players;

    public static final Scanner scanner = new Scanner(System.in);

    public void initialize() {
        // assuming 8 * 8 board;

        // create for black
        Pawn[] blackPawns = new Pawn[8];
        for (int i = 0; i < blackPawns.length; i++) {
            blackPawns[i] = new Pawn(Colour.BLACK);
        }

        Rook[] blackRooks = new Rook[2];
        for (int i = 0; i < blackRooks.length; i++) {
            blackRooks[i] = new Rook(Colour.BLACK);
        }

        Knight[] blackKnights = new Knight[2];
        for (int i = 0; i < blackKnights.length; i++) {
            blackKnights[i] = new Knight(Colour.BLACK);
        }

        Bishop[] blackBishops = new Bishop[2];
        for (int i = 0; i < blackBishops.length; i++) {
            blackBishops[i] = new Bishop(Colour.BLACK);
        }

        Queen blackQueen = new Queen(Colour.BLACK);

        King blackKing = new King(Colour.BLACK);

        //creating for white
        Pawn[] whitePawns = new Pawn[8];
        for (int i = 0; i < whitePawns.length; i++) {
            whitePawns[i] = new Pawn(Colour.BLACK);
        }

        Rook[] whiteRooks = new Rook[2];
        for (int i = 0; i < whiteRooks.length; i++) {
            whiteRooks[i] = new Rook(Colour.BLACK);
        }

        Knight[] whiteKnights = new Knight[2];
        for (int i = 0; i < whiteKnights.length; i++) {
            whiteKnights[i] = new Knight(Colour.BLACK);
        }

        Bishop[] whiteBishops = new Bishop[2];
        for (int i = 0; i < whiteBishops.length; i++) {
            whiteBishops[i] = new Bishop(Colour.BLACK);
        }

        Queen whiteQueen = new Queen(Colour.BLACK);

        King whiteKing = new King(Colour.BLACK);

        //initializing board for player1
        board = new Board(8);
        board.getCells()[0][0].setPiece(blackRooks[0]);
        board.getCells()[0][1].setPiece(blackKnights[0]);
        board.getCells()[0][2].setPiece(blackBishops[0]);
        board.getCells()[0][3].setPiece(blackQueen);
        board.getCells()[0][4].setPiece(blackKing);
        board.getCells()[0][5].setPiece(blackBishops[1]);
        board.getCells()[0][6].setPiece(blackKnights[1]);
        board.getCells()[0][7].setPiece(blackRooks[1]);

        for(int i=0;i<8;i++){
            board.getCells()[1][i].setPiece(blackPawns[i]);
        }

        //initializing board for player2
        board.getCells()[7][0].setPiece(whiteRooks[0]);
        board.getCells()[7][1].setPiece(whiteKnights[0]);
        board.getCells()[7][2].setPiece(whiteBishops[0]);
        board.getCells()[7][3].setPiece(whiteQueen);
        board.getCells()[7][4].setPiece(whiteKing);
        board.getCells()[7][5].setPiece(whiteBishops[1]);
        board.getCells()[7][6].setPiece(whiteKnights[1]);
        board.getCells()[7][7].setPiece(whiteRooks[1]);

        for(int i=0;i<8;i++){
            board.getCells()[6][i].setPiece(blackPawns[i]);
        }

        //initializing player 1.
        Player ritesh = new Player("Ritesh", Colour.BLACK);
        for(int i=0;i<8;i++){
            ritesh.addPiece(blackPawns[i]);
        }
        for(int i=0;i<2;i++){
            ritesh.addPiece(blackRooks[i]);
        }
        for(int i=0;i<2;i++){
            ritesh.addPiece(blackKnights[i]);
        }
        for(int i=0;i<2;i++){
            ritesh.addPiece(blackBishops[i]);
        }
        ritesh.addPiece(blackQueen);
        ritesh.addPiece(blackKing);

        Player ranu = new Player("Ranu", Colour.WHITE);
        for(int i=0;i<8;i++){
            ranu.addPiece(whitePawns[i]);
        }
        for(int i=0;i<2;i++){
            ranu.addPiece(whiteRooks[i]);
        }
        for(int i=0;i<2;i++){
            ranu.addPiece(whiteKnights[i]);
        }
        for(int i=0;i<2;i++){
            ranu.addPiece(whiteBishops[i]);
        }
        ranu.addPiece(whiteQueen);
        ranu.addPiece(whiteKing);

        players.add(ritesh);
        players.add(ranu);
    }

    public void start(){
        boolean noWinner = true;
        while(!noWinner){
            Player player = players.removeFirst();
            System.out.println("current player is :" + player.getName());
            int fromX = scanner.nextInt();
            int fromY = scanner.nextInt();
            int toX = scanner.nextInt();
            int toY = scanner.nextInt();

            Cell fromCell = board.getCells()[fromX][fromY];
            Cell toCell = board.getCells()[toX][toY];
            boolean isMoveValid = fromCell.getPiece().validateMove(fromCell,toCell);
            if(isMoveValid){
                if(toCell.getPiece()!=null){
                    Piece removedPiece = toCell.getPiece();
                    toCell.setPiece(fromCell.getPiece());
                    fromCell.setPiece(null);

                }else{
                    toCell.setPiece(fromCell.getPiece());
                    fromCell.setPiece(null);
                }
            }else{
                System.out.println("invalid move !!");
                continue;
            }

            Status status = checkStatus();
            if(status == Status.WINNER){
                System.out.println("Player " + player + "won the game");
                noWinner = false;
            }else if(status == Status.DRAW){
                System.out.println("DRAW");
                noWinner = false;
            }else{
                noWinner = true;
            }
        }
    }

    private Status checkStatus() {
        return Status.WINNER;
    }
}
