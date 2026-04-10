public class OOPSBannerApp {

    public static void main(String[] args) {
        String[] bannerLines = {
                String.join("", getOLine1(), "  ", getOLine1(), "  ", getPLine1(), "  ", getSLine1()),
                String.join("", getOLine2(), "  ", getOLine2(), "  ", getPLine2(), "  ", getSLine2()),
                String.join("", getOLine3(), "  ", getOLine3(), "  ", getPLine3(), "  ", getSLine3()),
                String.join("", getOLine4(), "  ", getOLine4(), "  ", getPLine4(), "  ", getSLine4()),
                String.join("", getOLine5(), "  ", getOLine5(), "  ", getPLine5(), "  ", getSLine5()),
                String.join("", getOLine6(), "  ", getOLine6(), "  ", getPLine6(), "  ", getSLine6()),
                String.join("", getOLine7(), "  ", getOLine7(), "  ", getPLine7(), "  ", getSLine7())
        };

        for (String line : bannerLines) {
            System.out.println(line);
        }
    }

    public static String getOLine1() { return "  *****  "; }
    public static String getOLine2() { return "*       *"; }
    public static String getOLine3() { return "*       *"; }
    public static String getOLine4() { return "*       *"; }
    public static String getOLine5() { return "*       *"; }
    public static String getOLine6() { return "*       *"; }
    public static String getOLine7() { return "  *****  "; }

    public static String getPLine1() { return "******* "; }
    public static String getPLine2() { return "*      *"; }
    public static String getPLine3() { return "*      *"; }
    public static String getPLine4() { return "******* "; }
    public static String getPLine5() { return "*      "; }
    public static String getPLine6() { return "*      "; }
    public static String getPLine7() { return "*      "; }

    public static String getSLine1() { return "******* "; }
    public static String getSLine2() { return "*      "; }
    public static String getSLine3() { return "*      "; }
    public static String getSLine4() { return "******* "; }
    public static String getSLine5() { return "       *"; }
    public static String getSLine6() { return "       *"; }
    public static String getSLine7() { return " ******* "; }
}