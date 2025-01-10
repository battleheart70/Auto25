import java.util.Arrays;
import java.util.List;

public class StringsMethods {

    public static void main(String[] args) {

        // Initialize a string with "Hello World"
        String str = "Hello World";

        // Another string initialized with the same value using a string literal
        String str1 = "Hello World"; // string literal

        // Initialize a string without redundant memory allocation
        String str2 = "Hello World Some Text Handy Lorem Ipsum"; // no redundant memory allocation

        // Split the string by the word "Text" and store the result in an array
        String[] newArray = str2.split("Text");

        // Iterate over the array and print each element after trimming whitespace
        for (String s : newArray) {
            System.out.println(s.trim());
        }

        // Iterate over each character in str2 and print it
        for (int i = 0; i < str2.length(); i++) {
            System.out.println(str2.charAt(i));
        }
        // REverse the string ( also will work for any array,string)
        for (int i = str2.length()-1; i>=0; i--) {
            System.out.println(str2.charAt(i));
        }
    }
}