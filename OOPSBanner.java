/**
 * OOPSBannerApp UC3 - OOPS Banner Application (Use Case 3)
 * Using String.join() for better memory efficiency
 */

public class OOPSBanner {

    public static void main(String[] args) {

        // Each line represents O, O, P, S

        System.out.println(String.join(" ",
                "  ***  ",
                "  ***  ",
                " ******",
                " ***** "));

        System.out.println(String.join(" ",
                " *   * ",
                " *   * ",
                " *    *",
                " *     "));

        System.out.println(String.join(" ",
                " *   * ",
                " *   * ",
                " ***** ",
                " ***** "));

        System.out.println(String.join(" ",
                " *   * ",
                " *   * ",
                " *     ",
                "     * "));

        System.out.println(String.join(" ",
                " *   * ",
                " *   * ",
                " *     ",
                "     * "));

        System.out.println(String.join(" ",
                " *   * ",
                " *   * ",
                " *     ",
                " *    *"));

        System.out.println(String.join(" ",
                "  ***  ",
                "  ***  ",
                " *     ",
                " ***** "));
    }
}