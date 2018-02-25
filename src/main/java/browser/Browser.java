package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pages.HomePage;

import java.util.concurrent.TimeUnit;

/**
 * Created by Shuvashish on 2/25/2018.
 */
public class Browser {
    public static WebDriver driver ;
    public static HomePage openBroser(){
        System. setProperty("webdriver.chrome.driver", "src\\main\\resources\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("https://www.zappos.com");
        return PageFactory.initElements(driver, HomePage.class);
    }
}
