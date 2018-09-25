/* Genjie Liu Pd2-3 9/20/18 */
package GLiu;
public class quadSolver {
    public static String  quad(double a, double b, double c)
    {

        //root=-b+ - square root of (b^2-4ac)/2a
        double discriminant = Math.pow(b, 2) - (4 * a * c);
        //find the discriminant (b^2-4ac)
        double rootPlus = ((-1 * b) + Math.sqrt(discriminant)) / (2 * a);
        double rootMinus = ((-1 * b) - Math.sqrt(discriminant)) / (2 * a);

        if (discriminant < 0) {
            return ("This is an imaginary number");
        }
        else
            {

                System.out.println("Root #1 of this quadratic equation is " + rootPlus);
                System.out.println("Root #2 of this quadratic equation is " + rootMinus);

        }


        return("Done!");
    }
}
