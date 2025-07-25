import java.util.Scanner;

public class Day_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string1 : ");  // TAKING STRING FROM USER
        String name = sc.nextLine();
        System.out.println("TO check if the word occurs at start or end : ");
        System.out.print("Enter the word : ");   // ENTER THE WORD FOR THE PROCESS
        String index1 = sc.next();
        if (name.startsWith(index1)) {
            System.out.println("This word appears at the start ");
        } else if (name.endsWith(index1)) {
            System.out.println("The word appears at the end  ");
        } else
            System.out.println(" The word is  incorrect");


        // extracting a word from string
        System.out.println("Enter the index of word to extract : ");
        System.out.print("First Index Number : ");   //  TAKING FIRST INDEX NUMBER FROM USER
        int a = sc.nextInt();
        System.out.print("Second Index Number : ");  //  TAKING SECOND INDEX NUMBER FROM USER
        int b = sc.nextInt();
        System.out.println(name.substring(a,b));



    }
}
