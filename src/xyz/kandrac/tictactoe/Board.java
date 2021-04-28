package xyz.kandrac.tictactoe;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private char[][] board = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
    };

    public void printBoard() {
        System.out.println("╔═╦═╦═╗");
        System.out.println("║" + board[0][0] + "║" + board[0][1] + "║" + board[0][2] + "║");
        System.out.println("╠═╬═╬═╣");
        System.out.println("║" + board[1][0] + "║" + board[1][1] + "║" + board[1][2] + "║");
        System.out.println("╠═╬═╬═╣");
        System.out.println("║" + board[2][0] + "║" + board[2][1] + "║" + board[2][2] + "║");
        System.out.println("╚═╩═╩═╝");
    }

    public boolean isResolved() {
        if (board[0][0] == 'O' && board[0][1] == 'O' && board[0][2] == 'O') return true;
        if (board[0][0] == 'O' && board[1][0] == 'O' && board[2][0] == 'O') return true;
        if (board[1][0] == 'O' && board[1][1] == 'O' && board[1][2] == 'O') return true;
        if (board[0][1] == 'O' && board[1][1] == 'O' && board[2][1] == 'O') return true;
        if (board[2][0] == 'O' && board[2][1] == 'O' && board[2][2] == 'O') return true;
        if (board[0][2] == 'O' && board[1][2] == 'O' && board[2][2] == 'O') return true;
        if (board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O') return true;
        if (board[2][0] == 'O' && board[1][1] == 'O' && board[0][2] == 'O') return true;

        if (board[0][0] == 'X' && board[0][1] == 'X' && board[0][2] == 'X') return true;
        if (board[0][0] == 'X' && board[1][0] == 'X' && board[2][0] == 'X') return true;
        if (board[1][0] == 'X' && board[1][1] == 'X' && board[1][2] == 'X') return true;
        if (board[0][1] == 'X' && board[1][1] == 'X' && board[2][1] == 'X') return true;
        if (board[2][0] == 'X' && board[2][1] == 'X' && board[2][2] == 'X') return true;
        if (board[0][2] == 'X' && board[1][2] == 'X' && board[2][2] == 'X') return true;
        if (board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X') return true;
        if (board[2][0] == 'X' && board[1][1] == 'X' && board[0][2] == 'X') return true;
        if (getEmptyPositions().size() == 0) return true;
        return false;
    }

    public char get(int x, int y) {
        return board[x][y];
    }

    public void set(int x, int y, char value) {
        board[x][y] = value;
    }

    public List<Position> getEmptyPositions() {
        ArrayList<Position> result = new ArrayList<>();
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                if (get(x, y) == ' ') result.add(new Position(x, y));
            }
        }
        return result;
    }

}
