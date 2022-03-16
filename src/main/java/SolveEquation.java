public class SolveEquation {
    private final SquareEquation equation;

    public SolveEquation(SquareEquation equation) {
        this.equation = equation;
    }

    public double getMaxRoot()
    {
        double[] roots = equation.getRoots();
        if(roots.length == 0)
        {
            throw new IllegalArgumentException("нет корней");
        }
        if(roots.length == 1)
            return roots[0];
        double max = roots[0];
        if (Double.compare(max, roots[1]) < 0)
            max = roots[1];
        return max;
    }
}
