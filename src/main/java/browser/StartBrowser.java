package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.HomePage;

import java.util.concurrent.TimeUnit;

/**
 * Created by Shuvashish on 1/29/2018.
 */
public class StartBrowser {

    public static WebDriver driver = null;
    public static HomePage openBroser(){
        System. setProperty("webdriver.chrome.driver", "src\\main\\resources\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.navigate().to("https://www.zappos.com");
        return new HomePage();
    }
}
