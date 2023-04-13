package Day01.HomeWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task01 {
    public static void main(String[] args) {
/*task:01
 Open google home page: https://www.google.com
 Verify Title on page
 Verify Current URL on page
 Close/Quit the browser
 Open google home page: https://stackoverflow.com
 Verify Title on page
 Verify Current URL on page
 Close/Quit the browser
 Open google home page: https://www.linkedin.com
 Verify Title on page
 Verify Current URL on page
 Close/Quit the browser*/
        System.setProperty("webdriver.chrome.driver", "resources/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);
        String currentURL = driver.getCurrentUrl();
        System.out.println(currentURL);
        driver.close();
        driver.get("https://www.linkedin.com");
        String pageTitle2 = driver.getTitle();
        System.out.println(pageTitle2);
        String pageURL2 = driver.getCurrentUrl();
        System.out.println(pageURL2);
        driver.close();
        driver.get("https://stackoverflow.com");
        String pageTitle3 = driver.getTitle();
        System.out.println(pageTitle3);
        String pageURL3 = driver.getCurrentUrl();
        System.out.println(pageURL3);
        driver.quit();






    }
}
