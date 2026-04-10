import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    public static void main(String[] args) {
        Map<Character, String[]> patterns = buildPatterns();
        printBanner("OOPS", patterns);
    }

    static Map<Character, String[]> buildPatterns() {
        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                "  *****  ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                "  *****  "
        });

        map.put('P', new String[]{
                " ******* ",
                " *     * ",
                " *     * ",
                " ******* ",
                " *       ",
                " *       ",
                " *       "
        });

        map.put('S', new String[]{
                " ******* ",
                " *       ",
                " *       ",
                " ******* ",
                "       * ",
                "       * ",
                " ******* "
        });

        return map;
    }

    static void printBanner(String text, Map<Character, String[]> patterns) {
        int height = 7;
        String gap = "   ";
        String blank = "         ";
        String upper = text.toUpperCase();

        for (int row = 0; row < height; row++) {
            StringBuilder line = new StringBuilder();

            for (int i = 0; i < upper.length(); i++) {
                char ch = upper.charAt(i);
                String[] p = patterns.get(ch);
                line.append(p == null ? blank : p[row]);
                if (i != upper.length() - 1) line.append(gap);
            }

            System.out.println(line);
        }
    }
}