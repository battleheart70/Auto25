import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GoToPageGrabTitle {

    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\PAVEL\\Downloads\\chromedriver-win64\\chromedriver.exe");

        // Initialize a new ChromeDriver instance
        WebDriver driver = new ChromeDriver();

        // Navigate to Google homepage
        driver.get("https://www.google.com/");

        // Print the title and current URL of the page
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        // Close the browser
        driver.quit();

        // Initialize a string array with a size of 10
        String[] arr = new String[10];
        arr[0] = "Hello";
        arr[1] = "World";

        // Print elements and length of the string array
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr.length);

        // Initialize an integer array with a size of 10 and set values
        int[] numberArr = new int[10];
        Arrays.setAll(numberArr, i -> i);

        // Print even numbers greater than 0 from the integer array
        for (int num : numberArr) {
            if (num > 0 && num % 2 == 0) {
                System.out.println(num);
            }
        }

        // Initialize an ArrayList and add elements to it
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("Java");
        list.add("Selenium");
        list.add("TestNG");
        list.add("Junit");

        // Print elements of the ArrayList using a for loop
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        // Print elements of the ArrayList using a for-each loop
        for (String s : list) {
            System.out.println(s);
        }

        // Check if the ArrayList contains the element "Java"
        System.out.println(list.contains("Java"));

        // Convert an array to an ArrayList and check if it contains the element "Java"
        String[] arr1 = {"Hello", "World", "Java", "Selenium", "TestNG", "Junit"};
        List<String> convertedArr1 = Arrays.asList(arr1);
        System.out.println(convertedArr1.contains("Java"));
    }
}