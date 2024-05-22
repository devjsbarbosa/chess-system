package chess;

import boardgame.Board;
import boardgame.Piece;
import chess.enums.Color;

public class ChessPiece extends Piece {

    private Color color;
    private int moveCount;

    public ChessPiece() {

    }
    public ChessPiece(Color color, int moveCount) {
        this.color = color;
        this.moveCount = moveCount;
    }

    public ChessPiece(Board board, Color color, int moveCount) {
        super(board);
        this.color = color;
        this.moveCount = moveCount;
    }

}
