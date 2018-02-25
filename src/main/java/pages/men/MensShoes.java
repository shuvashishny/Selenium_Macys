package pages.men;

import browser.Browser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by Shuvashish on 2/25/2018.
 */
public class MensShoes {
    WebDriver driver = Browser.driver;
    @FindBy(how = How.CSS, using = "xyz") private WebElement shoeTab;

    public MensShoes verifyMensShosePage(){
       driver.getTitle().contains("Men's Shoes");
        return this;
    }
}
