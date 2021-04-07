package lt.bit.java.chess.figures;

import lt.bit.java.chess.types.Position;

public class Queen extends Figure {

    public  Queen(char letter, int number, String color) {
        super(letter, number, color);
    }

//    @Override
//    public String toString() {
//        return  "Queen: " + letter + number + ", " + color;
//    }

    @Override
    public  Position[] possibleMovies() {
        return null;
    }
}
