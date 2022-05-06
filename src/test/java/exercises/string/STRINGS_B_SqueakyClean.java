package exercises.string;

public class STRINGS_B_SqueakyClean {
//    TASK 1: Replace any spaces encountered with underscores
//    TASK 2: Replace control characters ("\0") with the upper case string "CTRL"
//    TASK 3: Convert kebab-case to camelCase
//      SqueakyClean.clean("à-ḃç");
//      // => "àḂç"
//    TASK 4: Omit Greek lower case letters - Modify the (static) SqueakyClean.clean() method to omit any Greek letters in the range 'α' to 'ω'.
//      SqueakyClean.clean("MyΟβιεγτFinder");
//      => "MyΟFinder"

    static String clean(String identifier) {
        var stringBuilder = new StringBuilder();
        var isAfterDash = false;
        for (var c : identifier.toCharArray()) {
            if (isGreekLowercase(c)) {
                continue;
            } else if (isAfterDash) {
                stringBuilder.append(Character.toUpperCase(c));
            } else if (Character.isWhitespace(c)) {
                stringBuilder.append('_');
            } else if (Character.isISOControl(c)) {
                stringBuilder.append("CTRL");
            } else if (Character.isLetter(c)) {
                stringBuilder.append(c);
            }
            isAfterDash = (c == '-');
        }
        return stringBuilder.toString();
    }
    private static boolean isGreekLowercase(char c) {
        return (c >= 'α' && c <= 'ω');
    }
}
