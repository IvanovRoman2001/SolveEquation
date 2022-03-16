import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolveEquationTest {
    @Test
    public void testGetMaxAnswer() {
        SquareEquation equation = new SquareEquation(1, -9, 20);
        SolveEquation solver = new SolveEquation(equation);
        assertEquals(5.0, solver.getMaxRoot());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetException() {
        SquareEquation equation = new SquareEquation(1, 6, 14);
        SolveEquation solver = new SolveEquation(equation);
        solver.getMaxRoot();
    }
}
