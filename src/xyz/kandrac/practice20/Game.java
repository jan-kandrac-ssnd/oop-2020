package xyz.kandrac.practice20;

import java.util.Random;

public class Game {

    private int width;
    private int height;

    private Tile[][] board;

    private Tile get(int x, int y) { return board[y][x]; }

    public Game(int width, int height, int mines) {
        Random random = new Random();

        this.width = width;
        this.height = height;
        board = new Tile[height][width];
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                board[i][j] = new Tile(0, Tile.TileStatus.SHOWN);
            }
        }

        for (int i = 0; i < mines; i++) {
            int x = random.nextInt(width);
            int y = random.nextInt(height);
            if (board[y][x].getValue() != -1) {
                board[y][x].setValue(-1);

                if (y > 0) {                            board[y - 1][x]     .setValue(board[y - 1][x]       .getValue() + 1); }
                if (y > 0 && x > 0) {                   board[y - 1][x - 1] .setValue(board[y - 1][x - 1]   .getValue() + 1); }
                if (y > 0 && x < width - 1) {           board[y - 1][x + 1] .setValue(board[y - 1][x + 1]   .getValue() + 1); }
                if (x > 0) {                            board[y][x - 1]     .setValue(board[y][x - 1]       .getValue() + 1); }
                if (x < width - 1) {                    board[y][x + 1]     .setValue(board[y][x + 1]       .getValue() + 1); }
                if (y < height - 1) {                   board[y + 1][x]     .setValue(board[y + 1][x]       .getValue() + 1); }
                if (y < height - 1 && x > 0) {          board[y + 1][x - 1] .setValue(board[y + 1][x - 1]   .getValue() + 1); }
                if (y < height - 1 && x < width - 1) {  board[y + 1][x + 1] .setValue(board[y + 1][x + 1]   .getValue() + 1); }

            } else {
                i--;
            }
        }
    }

    public void print() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                Tile tile = board[i][j];
                if (tile.getValue() < 0) {
                    System.out.print('X');
                } else {
                    System.out.print(tile.getValue());
                }
            }
            System.out.println();
        }
    }
}
