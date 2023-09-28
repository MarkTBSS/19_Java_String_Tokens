//import java.io.*;
import java.util.*;
import java.lang.String;

public class Solution {
    public static void main(String[] args) {
        String mockInput = "          a";
        Scanner scanner = new Scanner(mockInput);
        String s = scanner.nextLine();
        scanner.close();
        //System.out.println(s);

        String[] sStringArray = s.split("[^A-Za-z]+");
        int tokenCount = 0;
        for (String each : sStringArray) {
            if (!each.isEmpty()) {
                tokenCount++;
            }
        }
        System.out.println(tokenCount);
        for (String each : sStringArray) {
            if (!each.isEmpty()) {
                System.out.println(each);
            }
        }
    }
}

/* import java.util.*;

public class Solution {
    public static void main(String[] args) {
        String mockInput = "          a";
        Scanner scanner = new Scanner(mockInput);
        String s = scanner.nextLine().trim();
        scanner.close();

        String[] sStringArray = s.split("[^A-Za-z]+");
        int tokenCount = 0;

        for (String each : sStringArray) {
            if (!each.isEmpty()) {
                System.out.println(each);
                tokenCount++;
            }
        }

        System.out.println(tokenCount);
    }
} */
