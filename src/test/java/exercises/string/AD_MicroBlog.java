package exercises.string;

public class AD_MicroBlog {
    /*
    * The task is to truncate input strings to 5 characters.
    *
    * Text Encodings
    * Text stored digitally has to be converted to a series of bytes. There are 3 ways to map characters to bytes in common use.
        * ASCII can encode English language characters. All characters are precisely 1 byte long.
        * UTF-8 is a Unicode text encoding. Characters take between 1 and 4 bytes.
        * UTF-16 is a Unicode text encoding. Characters are either 2 or 4 bytes long.
    *
    * UTF-8 and UTF-16 are both Unicode encodings which means they're capable of representing a massive range of characters including:
        * Text in most of the world's languages and scripts
        * Historic text
        * Emoji
    * */

//    private static final int MAX_POST_LENGTH = 5;
//    public String truncate(final String input) {
//        return input.codePoints()
//                .limit(MAX_POST_LENGTH)
//                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
//                .toString();
//    }
//
//    public String truncate(String input) {
//        return input.substring(0, input.offsetByCodePoints(0, Math.min(5, input.codePointCount(0, input.length()))));
//    }
//
//    public String truncate(String input) {
//        return input.codePointCount(0,input.length()) < 6? input: input.substring(0,input.offsetByCodePoints(0,5));
//    }
//
//    public String truncate(String input) {
//        StringBuilder truncatedInput = new StringBuilder();
//        input.codePoints()
//                .limit(5)
//                .forEach(i -> truncatedInput.appendCodePoint(i));
//        return truncatedInput.toString();
//    }
}
