public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] bannerLines = createBanner();
        printBanner(bannerLines);

    }

    public static String[] createBanner() {

        return new String[] {

            String.join("", "  *****          *****          *******         ******* "),
            String.join("", "*       *      *       *       *        *      *         "),
            String.join("", "*       *      *       *       *        *      *         "),
            String.join("", "*       *      *       *       *******          *******"),
            String.join("", "*       *      *       *       *                        *"),
            String.join("", "*       *      *       *       *                        *"),
            String.join("", "  *****          *****         *                *******")
        };
    }

    public static void printBanner(String[] bannerLines) {

        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}