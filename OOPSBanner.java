
public class OOPSBanner {

    public static void main(String[] args) {

        String[] O = {
                "  ***  ",
                " *   * ",
                " *   * ",
                " *   * ",
                "  ***  "
        };

        String[] P = {
                " ***** ",
                " *   * ",
                " ***** ",
                " *     ",
                " *     "
        };

        String[] S = {
                " ***** ",
                " *     ",
                " ***** ",
                "     * ",
                " ***** "
        };

        // Print row by row
        for (int i = 0; i < O.length; i++) {
            System.out.println(O[i] + "  " + O[i] + "  " + P[i] + "  " + S[i]);
        }
    }
}