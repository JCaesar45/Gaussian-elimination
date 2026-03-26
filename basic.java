public class GammaFunction {
    
    // Lanczos coefficients (GSL - GNU Scientific Library)
    private static final double[] P = {
        0.99999999999980993,
        676.5203681218851,
        -1259.1392167224028,
        771.32342877765313,
        -176.61502916214059,
        12.507343278686905,
        -0.13857109526572012,
        9.9843695780195716e-6,
        1.5056327351493116e-7
    };
    
    private static final int G = 7;
    private static final double SQRT_2_PI = Math.sqrt(2 * Math.PI);
    
    /**
     * Computes the Gamma function using Lanczos approximation
     * @param x Input value (positive real number)
     * @return Gamma(x)
     */
    public static double gamma(double x) {
        // Reflection formula for x < 0.5
        if (x < 0.5) {
            return Math.PI / (Math.sin(Math.PI * x) * gamma(1 - x));
        }
        
        x -= 1;
        double a = P[0];
        for (int i = 1; i < P.length; i++) {
            a += P[i] / (x + i);
        }
        
        double t = x + G + 0.5;
        return SQRT_2_PI * Math.pow(t, x + 0.5) * Math.exp(-t) * a;
    }
    
    public static void main(String[] args) {
        // Test cases
        System.out.println(gamma(0.1));  // 9.513507698668736
        System.out.println(gamma(0.2));  // 4.590843711998803
        System.out.println(gamma(0.3));  // 2.9915689876875904
        System.out.println(gamma(0.4));  // 2.218159543757687
        System.out.println(gamma(0.5));  // 1.7724538509055159
    }
}
