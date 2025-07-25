import java.util.Scanner;

public class Day_11_String {
    public static void main(String[] args) {
        Scanner string = new Scanner(System.in);
        System.out.print("Enter string 1 : ");
        String name1 = string.nextLine();
        System.out.print("Enter string 2 : ");
        String name2 = string.nextLine();
        System.out.println(name1.equalsIgnoreCase(name2));  // returns true when string1 == string2 without bothering cases
        System.out.println(name1.equals(name2));            // returns true if string1 == string2 considering case or else false
        // if string1 > string2 returns positive value (caseSensitive)
        // if sting1 < string2 returns negative value  (caseSensitive)
        // if string1 == string2 returns 0             (caseSensitive)
        System.out.println(name1.compareTo(name2));
        // if string1 > string2 returns positive value
        // if sting1 < string2 returns negative value
        // if string1 == string2 returns 0
        System.out.println(name1.compareToIgnoreCase(name2));
    }
}
