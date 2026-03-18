import java.util.*;

public class OOPSBanner {

    public static void main(String[] args) {

        // Map to store patterns of each letter
        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        map.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });

        map.put('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });

        String word = "OOPS";

        // Print row by row
        for (int i = 0; i < 5; i++) {
            for (char ch : word.toCharArray()) {
                System.out.print(map.get(ch)[i] + "  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        OOPSBanner obj = new OOPSBanner();          // outer class object
        OOPSBanner.Inner inner = obj.new Inner();   // inner class object
        inner.printOops();                          // method call
    }
}