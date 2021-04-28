package xyz.kandrac.tictactoe;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {

    private static final Random random = new Random();

    private static void aiMove(Board board, char player) {
        List<Position> positions = board.getEmptyPositions();
        int placeTo = random.nextInt(positions.size());
        Position place = positions.get(placeTo);
        board.set(place.getX(), place.getY(), player);
    }

    public static void main(String[] args) {

        Board board = new Board();

        Scanner scanner = new Scanner(System.in);

        int playerId = scanner.nextInt();
        int round = 0;
        while (!board.isResolved()) {

            char actualPlayer = (round % 2 == 0) ? 'O' : 'X';

            if (round % 2 == playerId) {
                int y = scanner.nextInt();
                int x = scanner.nextInt();
                if (board.get(x, y) == 'O' || board.get(x, y) == 'X') {
                    round--;
                    continue;
                }
                board.set(x, y, actualPlayer);
            } else {
                aiMove(board, actualPlayer);
            }

            board.printBoard();
            if (board.isResolved()) {
                break;
            }
            round++;
        }
    }

}
