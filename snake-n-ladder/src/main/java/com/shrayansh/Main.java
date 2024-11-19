package com.shrayansh;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Player player1 = new Player("Shrayansh");
        Player player2 = new Player("Ritesh");


        Game game = new Game(5, 5, 1, 6, 5, 5);
        game.addPlayer(player1);
        game.addPlayer(player2);
        game.show();
        Player winner = game.startGame();
        System.out.println("Winner is " + winner.getName() + "with position " + winner.getCurrentPosition());

    }
}