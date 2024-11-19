package com.shrayansh;

public class Board {
    Cell[][] cells;
    int rows;
    int cols;

    public Board(int rows, int cols, int numberOfSnakes, int numberOfLadders) {
        this.cells = new Cell[rows][cols];
        this.rows = rows;
        this.cols = cols;
        initializeCells();
        addSnakes(numberOfSnakes);
        addLadders(numberOfLadders);
    }

    private void addSnakes(int numberOfSnakes) {
        while (numberOfSnakes > 0) {
            int start = Util.getRandomNumber(0, this.rows * this.cols - 1);
            int end = Util.getRandomNumber(0, this.rows * this.cols - 1);
            if (end >= start) {
                continue;
            }
            Cell cell = getCell(start);
            if (cell.getJump() != null) {
                continue;
            }

            Jump jump = new Jump(start, end);
            cell.setJump(jump);
            numberOfSnakes--;
        }
    }

    private void addLadders(int numberOfLadders) {
        while (numberOfLadders > 0) {
            int start = Util.getRandomNumber(0, this.rows * this.cols - 1);
            int end = Util.getRandomNumber(0, this.rows * this.cols - 1);
            if (end <= start) {
                continue;
            }
            Cell cell = getCell(start);
            if (cell.getJump() != null) {
                continue;
            }

            Jump jump = new Jump(start, end);
            cell.setJump(jump);
            numberOfLadders--;
        }
    }

    public Cell getCell(int number) {
        int row = number / this.cols;
        int col = number % this.cols;
        if (row < 0 || row >= this.rows || col < 0 || col >= this.cols) {
            return null;
        }
        return cells[row][col];
    }

    private void initializeCells() {
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.cols; j++) {
                cells[i][j] = new Cell();
            }
        }
    }

    public void show() {
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.cols; j++) {
                System.out.print("Cell " + i + " " + j + " ");
                Cell cell = cells[i][j];
                if (cell.getJump() != null) {
                    System.out.print("Jump from " + cell.getJump().getStart() + " to " + cell.getJump().getEnd() + " ");
                } else {
                    System.out.print("No Jump ");
                }
                System.out.print("|");
            }
            System.out.print("\n");
        }
    }
}
