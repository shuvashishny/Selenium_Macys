package alltests.pages.men;

import browser.Browser;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pages.men.MensClothing;

/**
 * Created by dipak on 3/18/2018.
 */
public class MensClothingTest {

    @Test
    public void verifyMensClothingPage(){
        Browser
                .openBrowser()
                .clickLinkFromTopNavs("Men")
                .clickMensSubcategory("Clothing");
        PageFactory.initElements(Browser.driver, MensClothing.class)
                .verifyMensClothingHeaderText();
    }
}
