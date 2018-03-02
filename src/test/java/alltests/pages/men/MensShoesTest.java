package alltests.pages.men;

import alltests.base.TestBase;
import alltests.base.TestListener;
import browser.Browser;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.men.MensShoes;

/**
 * Created by Shuvashish on 2/25/2018.
 */
@Listeners(value= TestListener.class)
public class MensShoesTest extends TestBase{

    @Test(groups = {"regression"})
    public void navigateToMensShose(){
        Browser
                .openBrowser()
                .clickLinkFromTopNavs("Men")
                .clickMensSubcategory("Shoes");
        PageFactory
                .initElements(Browser.driver, MensShoes.class)
                .verifyMensShosePage();
    }

}
