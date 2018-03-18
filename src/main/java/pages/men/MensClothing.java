package pages.men;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

/**
 * Created by dipak on 3/18/2018.
 */
public class MensClothing {
    @FindBy(how = How.CLASS_NAME, using = "z-hd-m-h1") private WebElement headerText;

    public void verifyMensClothingHeaderText(){
        String header = headerText.getText();
        Assert.assertEquals("Men's Clothing", header);
    }
}
