import java.util.*;

public class LocalizationExample {
    public static void main(String[] args) {
        Locale french = new Locale("fr");
        Locale hindi = new Locale("hi");
        Locale defaultLocale = new Locale("en");

        printMessage(french);
        printMessage(hindi);
        printMessage(defaultLocale);
    }

    public static void printMessage(Locale locale) {
        ResourceBundle bundle = ResourceBundle.getBundle("Messages", locale);
        System.out.println(locale.getDisplayLanguage() + ": " + bundle.getString("greeting"));
    }
}
