package patterns.adapter;

public class Demo {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        RoundPeg peg = new RoundPeg(5);
        if (hole.fits())
    }
}
