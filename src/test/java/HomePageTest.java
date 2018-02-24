import base.TestBase;
import base.TestListener;
import browser.StartBrowser;
import dataprovider.HomePageDataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/**
 * Created by Shuvashish on 1/29/2018.
 */
@Listeners(value= TestListener.class)
public class HomePageTest extends TestBase {

    @Test(groups = {"regression"}, dataProvider="MacysHomePageData", dataProviderClass=HomePageDataProvider.class)
    public void testHomePage(String linkName){
        StartBrowser.openBroser().seeAllLinks(linkName);
    }

    @Test(groups = {"smoke"})
    public void testNavNames(){
        StartBrowser.openBroser().verifyLinkNamesPresent();
    }



}
