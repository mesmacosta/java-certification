/*
 * Regexp test engine proposed in page 537.
 */

import java.util.regex.*;
import java.io.Console;
class Regex {
    public static void main(String [] args) {
        Console console = System.console();
        while (true) {
            String stringPattern = console.readLine("pattern (empty to finish): ");
            if (stringPattern.equals(""))
                break;
            Pattern pattern = Pattern.compile(stringPattern);
            Matcher matcher = pattern.matcher(console.readLine("matcher: "));
            console.format("\npattern is %s", matcher.pattern());
            while(matcher.find())
                console.format("\n%s %s", matcher.start(), matcher.group());
            console.format("\n\n--------------------------\n\n");
        }
    }
}

