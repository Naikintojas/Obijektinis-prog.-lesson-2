package lt.bit.java.chess;

import lt.bit.java.chess.figures.Figure;
import lt.bit.java.chess.figures.King;
import lt.bit.java.chess.figures.Queen;
import lt.bit.java.chess.types.Position;
import lt.bit.java.intro.A;

import java.util.Arrays;

public class Game {

    public static void main(String[] args) {
        Queen queen = new Queen( 'D', 5, "Black");
        King king = new King('E', 2, "Black");

        System.out.println(queen + ": " + Arrays.toString(king.possibleMovies()));
        System.out.println(king + ": " + Arrays.toString(king.possibleMovies()));

//        Figure figure = new Figure('A', 3, "White");

        Figure kingWhite = new King('E', 5, "White");
//        System.out.println(kingWhite + ": " + Arrays.toString(kingWhite.possibleMovies()));
        printFigure(kingWhite);

        printFigure(new Queen('H', 6, "White"));
        printFigure(new King('G', 5, "White"));
    }

    static void printFigure(Figure figure) {
        System.out.println(figure + ": " + Arrays.toString(figure.possibleMovies()));
    }
}
