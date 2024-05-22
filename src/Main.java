import application.UI;
import boardgame.Board;
import chess.ChessMatch;

public class Main {
    public static void main(String[] args) {
        Board board = new Board(5, 7);
        ChessMatch chessMatch = new ChessMatch();

        UI.printBoard(chessMatch.getPieces());
    }
}