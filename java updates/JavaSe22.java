import static java.lang.StringTemplate.STR;

import java.util.Locale;

class JavaSe22{
    public static void main(String[] args) {
        // String s = "adil";
        // System.out.println(STR."my name is \{s}");
        String time = STR."Today is \{java.time.LocalDate.now()}";
        System.out.println(time);
        String canLang = STR."The language code of \{
        Locale.CANADA_FRENCH} is \{
        Locale.CANADA_FRENCH.getLanguage()}";
        System.out.println(canLang);
    }
}