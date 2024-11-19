package com.shrayansh;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Game {
    private Board board;
    private Deque<Player> players;
    private Dice dice;
    private Player winner;
    Scanner scanner = new Scanner(System.in);

    public Game(int rows, int cols, int numberOfDice, int maxDiceValue, int numberOfSnakes, int numberOfLadders) {
        this.board = new Board(rows, cols, numberOfSnakes, numberOfLadders);
        this.players = new LinkedList<>();
        this.dice = new Dice(numberOfDice, maxDiceValue);
        this.winner = null;
    }

    public void addPlayer(Player player) {
        players.add(player);
    }

    public Player startGame() {
        while (winner == null) {
            Player currentPlayer = getNextPlayer();
            System.out.println("Player " + currentPlayer.getName() + " is playing with current position " + currentPlayer.getCurrentPosition());
            System.out.println("press enter to roll");
            scanner.nextLine();
            int diceNumber = dice.roll();
            System.out.println("got " + diceNumber);
            int newPosition = currentPlayer.getCurrentPosition() + diceNumber;
            int nextPosition = jumpCheck(newPosition);
            currentPlayer.setCurrentPosition(nextPosition);
            System.out.println("New position is " + nextPosition);
            if (isWinner(currentPlayer)) {
                winner = currentPlayer;
            }
        }
        return winner;
    }

    private boolean isWinner(Player currentPlayer) {
        return currentPlayer.getCurrentPosition() >= board.rows * board.cols - 1;
    }

    private int jumpCheck(int position) {
        Cell cell = board.getCell(position);
        if (cell != null && cell.getJump() != null) {
            if (cell.getJump().getStart() > cell.getJump().getEnd()) {
                System.out.println("Bitten by snake from " + cell.getJump().getStart() + " to " + cell.getJump().getEnd());
            } else {
                System.out.println("Climbing ladder from " + cell.getJump().getStart() + " to " + cell.getJump().getEnd());
            }
            return cell.getJump().getEnd();
        }
        return position;
    }

    private Player getNextPlayer() {
        Player currentPlayer = players.removeFirst();
        players.addLast(currentPlayer);
        return currentPlayer;
    }

    public void show() {
        this.board.show();
    }
}
