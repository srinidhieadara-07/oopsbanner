import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    static class CharacterPattern {
        private final char character;
        private final String[] pattern;

        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {
        Map<Character, CharacterPattern> patternMap = initializePatterns();
        printBanner("OOPS", patternMap);
    }

    public static Map<Character, CharacterPattern> initializePatterns() {
        Map<Character, CharacterPattern> map = new HashMap<>();

        map.put('O', new CharacterPattern('O', new String[]{
                "  *****  ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                "  *****  "
        }));

        map.put('P', new CharacterPattern('P', new String[]{
                " ******* ",
                " *     * ",
                " *     * ",
                " ******* ",
                " *       ",
                " *       ",
                " *       "
        }));

        map.put('S', new CharacterPattern('S', new String[]{
                " ******* ",
                " *       ",
                " *       ",
                " ******* ",
                "       * ",
                "       * ",
                " ******* "
        }));

        return map;
    }

    public static void printBanner(String text, Map<Character, CharacterPattern> map) {
        int height = 7;
        String gap = "   ";
        String blank = "         ";

        String upperText = text.toUpperCase();

        for (int row = 0; row < height; row++) {
            StringBuilder lineBuilder = new StringBuilder();

            for (int i = 0; i < upperText.length(); i++) {
                char ch = upperText.charAt(i);

                CharacterPattern cp = map.get(ch);
                String part = (cp == null) ? blank : cp.getPattern()[row];

                lineBuilder.append(part);
                if (i != upperText.length() - 1) lineBuilder.append(gap);
            }

            System.out.println(lineBuilder);
        }
    }
}