package GLiu;

public class quadSolver {
    public static String quad(double a, double b, double c) {


        double discriminant = Math.pow(b, 2) - (4 * a * c);
        double rootPlus = ((-1 * b) + Math.sqrt(discriminant)) / (2 * a);
        double rootMinus = ((-1 * b) - Math.sqrt(discriminant)) / (2 * c);

        if (discriminant < 0) {
            return ("This is an imaginary number");
        }
        else
            {

                System.out.println("Root #1 of this quadratic equation is " + rootPlus);
                System.out.println("Root #1 of this quadratic equation is " + rootMinus);

        }


        return("You should not see this message.");
    }
}
