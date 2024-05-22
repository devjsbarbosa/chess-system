package application;

import chess.ChessPiece;

public class UI {

    // vai receber uma matriz de peças
    public static void printBoard(ChessPiece[][] pieces){

        // percorre a a linha
        for(int i =0; i < pieces.length; i++){
            // para imprimir números de 8 a 1 no inicio de cada linha
            System.out.print((8 - i) + " ");
            // imprime uma peça ou um traço
            for(int j = 0; j < pieces.length; j++){
                printPiece(pieces[i][j]);
            }
            // para quebrar a linha e ir para linha de baixo
            System.out.println();
        }
        System.out.println("  a b c d e f g h");

    }

    // método para imprimir uma peça
    private static void printPiece(ChessPiece piece){
        // se não tem peça, imprime um traço indicando espaço vazio
        if(piece == null){
            System.out.print("-");
        }else {
            System.out.print(piece);
        }

        System.out.print(" ");
    }
}
