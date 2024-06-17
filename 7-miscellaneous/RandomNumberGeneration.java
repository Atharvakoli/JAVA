import java.io.Console;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomNumberGeneration {
    public static void main(String[] args) {
        // Random r = new Random();
        // System.out.println(r.nextInt());/// any random integer
        // System.out.println(r.nextInt(100));
        // System.out.println(r.nextInt(100) + 1);

        Console cons = System.console();
        String username = cons.readLine("User name: ");
        char[] passwd = cons.readPassword("Password: ");

        System.out.println(username);

        System.out.println(Arrays.toString(passwd));

        System.out.printf("%,.1f", 10000.0 / 3.0);

        System.out.printf("%1$s %2$tB %2$te, %2$tY", "Due date:", new java.util.Date());

        // file Input out put
        // To read from a file
        // Scanner in = new Scanner(Paths.get("myfile.txt"));

        // Regix Expressions
        /*
         * 1. Any single character:
         * 
         * . (The dot matches any character except a newline by default)
         * 2. A specific single character:
         * 
         * [a] (Matches the character 'a')
         * a (Also matches the character 'a' directly)
         * 
         * 3. Any digit:
         * 
         * \d (Matches any digit, equivalent to [0-9])
         * 
         * 4. Any non-digit:
         * 
         * \D (Matches any character that is not a digit)
         * 5. Any word character (alphanumeric + underscore):
         * 
         * \w (Matches any word character, equivalent to [a-zA-Z0-9_])
         * 
         * 6. Any non-word character:
         * 
         * \W (Matches any character that is not a word character)
         * 
         * 7. Any whitespace character:
         * 
         * \s (Matches any whitespace character, including spaces, tabs, and line
         * breaks)
         * 
         * 8. Any non-whitespace character:
         * 
         * \S (Matches any character that is not a whitespace character)
         * 
         * 9. Any character from a set:
         * 
         * [abc] (Matches 'a', 'b', or 'c')
         * [a-z] (Matches any lowercase letter)
         * [A-Z] (Matches any uppercase letter)
         * [0-9] (Matches any digit)
         * [a-zA-Z0-9_] (Matches any alphanumeric character or underscore)
         * 
         * 10. Any character not in a set:
         * 
         * [^abc] (Matches any character except 'a', 'b', or 'c')
         * [^0-9] (Matches any non-digit character)
         * 
         * 
         * text.split("[\p{P}\s]+").length;
         * 
         * 
         * text.split(...):
         * 
         * The split method is called on the string text. This method splits the string
         * into an array of substrings based on a specified delimiter.
         * "[\\p{P}\\s]+":
         * 
         * This is the delimiter used for splitting the string. It's a regular
         * expression pattern.
         * [\\p{P}\\s]+:
         * 
         * This pattern matches one or more characters that are either punctuation or
         * whitespace.
         * \\p{P}: Matches any punctuation character. In Unicode, \p{P} is a shorthand
         * for any punctuation mark.
         * \\s: Matches any whitespace character (spaces, tabs, line breaks, etc.).
         * The square brackets [ ] create a character class, meaning it will match any
         * one character that is either punctuation or whitespace.
         * The + quantifier means "one or more" of the preceding element. Thus, it will
         * match sequences of one or more punctuation or whitespace characters.
         * .length:
         * 
         * This property is used to get the length of the array resulting from the split
         * method. Essentially, it counts how many substrings were created by the split
         * operation.
         */
    }
}
