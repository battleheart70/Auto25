import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Arrays;

public class GoToPageGrabTitle {
    public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver",
            "C:\\Users\\PAVEL\\Downloads\\chromedriver-win64\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.google.com/");
    System.out.println(driver.getTitle());
    System.out.println(driver.getCurrentUrl());
    driver.quit();
// Arrays
    String[] arr = new String[10];
    arr[0] = "Hello";
    arr[1] = "World";
    System.out.println(arr[0]);
    System.out.println(arr[1]);
    System.out.println(arr.length);
    int[] numberArr = new int[10];
    Arrays.setAll(numberArr, i -> i);
    for (int num : numberArr) {
    if (num > 0 && num % 2 == 0) {
        System.out.println(num);
    }
}

// ArrayList
    ArrayList<String> list = new ArrayList<>();
    list.add("Hello");
    list.add("World");
    list.add("Java");
    list.add("Selenium");
    list.add("TestNG");
    list.add("Junit");
    for (int i = 0; i < list.size(); i++) {
        System.out.println(list.get(i));
    }
    for (String s:list){
        System.out.println(s);
    }
    System.out.println(list.contains("Java"));
}
}
