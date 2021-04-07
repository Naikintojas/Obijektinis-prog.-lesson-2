package lt.bit.java.chess.types;

public class Position {

    public char letter;
    public int number;

    public Position(char letter, int number) {
        this.letter = letter;
        this.number = number;
    }

    @Override
    public String toString(){
        return "" + letter + number;
    }

    private String printMove() {
        return letter + "-" + number;
    }
}
