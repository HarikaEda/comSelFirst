package Day01.HomeWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task02 {
    public static void main(String[] args) {
       /* - Invoke Chrome Browser
        - Navigate to URL: https://clarusway.com/
        - Navigate to URL: https://amazon.com/
        - Come back to the Clarusway using the back command.
        - Verify the current URL is https://clarusway.com/
        - Again go back to the amazon website using forward command
                - Verify the current URL is https://amazon.com/
        - Refresh the Browser using refresh command.
                - Close the Browser.*/

        System.setProperty("webdriver.chrome.driver", "resources/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://clarusway.com/");
        driver.get("https://amazon.com/");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.close();




    }
}
