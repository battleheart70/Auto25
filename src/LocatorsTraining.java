import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LocatorsTraining {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\PAVEL\\Downloads\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.get("https://rahulshettyacademy.com/locatorspractice/");

        //<input type="text" placeholder="Username" id="inputUsername" value="">
        driver.findElement(By.id("inputUsername")).sendKeys("Username");

        //<input type="password" placeholder="Password" name="inputPassword" value="">
        driver.findElement(By.name("inputPassword")).sendKeys("Password");

        //<button class="submit signInBtn" type="submit">Sign In</button>
        driver.findElement(By.className("signInBtn")).click(); // clicking on button and next wating for error

        //CSS Selector Class name -> tagname.classname ID-> tagname#id tagname[attribute='value']
        //to verify CSS locator in devtools console use $('cssSelector')
        String errorText = driver.findElement(By.cssSelector("p.error")).getText();
        System.out.println(errorText);

        driver.findElement(By.linkText("Forgot your password?")).click(); //Finding element by link text
        Thread.sleep(1500);

        // XPath //Tagname[@attribute='value'][1] where [1] is index <input type="text" placeholder="Name" wfd-id="id0">
        // TO validate XPath in devtools console use $x('xpath')
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Pavel");
        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("random@random.com");
        driver.findElement(By.xpath("//input[@placeholder='Email']")).clear();

        //xpath indexing
        driver.findElement(By.xpath("//input[@type='text'][2]"))
                .sendKeys("example@example.com");
        // css indexing driver.findElement(By.cssSelector("input[type='text']:nth-child(3)"))

        //xpath navigating from parent to child //parentTagname/childTagname
        driver.findElement(By.xpath("//form/input[3]"))
                .sendKeys("123456789");

        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        driver.findElement(By.xpath("//div[contains(@class, 'pwd-btn')]/button[1]")).click();
        Thread.sleep(1500);

        //css navigation from parent to child "ParentTagname ChildTagname"
        driver.findElement(By.cssSelector("form p")).getText();

        driver.findElement(By.cssSelector("#inputUsername"))
                .sendKeys("Aboba");

        //finding password using RegEx
        driver.findElement(By.cssSelector("input[type*='pass']"))
                .sendKeys("rahulshettyacademy");

        driver.findElement(By.id("chkboxOne")).click();
        driver.findElement(By.xpath("//input[contains(@value, 'agreeTerms')]")).click();

        //contains in xPath //tagname[contains(@attribute, 'value')]
        driver.findElement(By.xpath("//button[contains(@class, 'submit')]")).click();


    }
}
