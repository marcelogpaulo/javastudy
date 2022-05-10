package exercises.string;

public class CONDITIONALS_IFS_A_Bob {

    /*Bob is a lackadaisical teenager. In conversation, his responses are very limited.
    Bob answers 'Sure.' if you ask him a question, such as "How are you?".
    He answers 'Whoa, chill out!' if you YELL AT HIM (in all capitals).
    He answers 'Calm down, I know what I'm doing!' if you yell a question at him.
    He says 'Fine. Be that way!' if you address him without actually saying anything.
    He answers 'Whatever.' to anything else.*/

    String hey(String phrase) {
        String trimmedPhrase = phrase.trim();
        if (trimmedPhrase.isEmpty()) return "Fine. Be that way!";
        if (isUpper(trimmedPhrase) && trimmedPhrase.endsWith("?")) return "Calm down, I know what I'm doing!";
        if (isUpper(trimmedPhrase)) return "Whoa, chill out!";
        if (trimmedPhrase.endsWith("?")) return "Sure.";
        return "Whatever.";
    }
    boolean isUpper(String s) {
        return s.chars().anyMatch(Character::isLetter) && s.equals(s.toUpperCase());
    }
}
