package chess;

import boardgame.Board;

public class ChessMatch {

    //tabuleiro da partida
    private Board board;
    //truno da jogada
    private int turn;

    // dimensão do tabuleiro de xadrex
    public ChessMatch() {
        board = new Board(8, 8);
    }

    //retorna uma matriz de peça de xadrex correspondente a partida
    public ChessPiece[][] getPieces() {
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColumns()];

        // convertendo cada piece para chesspiece
        for (int i = 0; i < board.getRows(); i++) {
            for (int j = 0; j < board.getColumns(); j++) {
                mat[i][j] = (ChessPiece) board.piece(i, j);
            }
        }

        return mat;
    }

}
