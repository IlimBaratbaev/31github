package patterns.adapter;

public class Demo {
    public static void main(String[] args) {
        RoundHole hole = new RoundHole(5);
        RoundPeg peg = new RoundPeg(5);
        if (hole.fits(peg)) {
            System.out.println("Round peg fits to round hole");
        }
        SquarePeg smallSqPeg = new SquarePeg(2);
        SquarePeg largeSqPeg = new SquarePeg(10);
        SquarePegAdapter smallSquarePegAdapter = new SquarePegAdapter(smallSqPeg);
        SquarePegAdapter largeSquarePegAdapter = new SquarePegAdapter(largeSqPeg);
        if (hole.fits(smallSquarePegAdapter)) {
            System.out.println("Square peg fits to round hole");
        }
        if (!hole.fits(largeSquarePegAdapter)) {
            System.out.println(" large Square peg fits to round hole");
        }
    }
}
