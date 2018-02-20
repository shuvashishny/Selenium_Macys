import browser.StartBrowser;
import dataprovider.HomePageDataProvider;
import org.testng.annotations.Test;

/**
 * Created by Shuvashish on 1/29/2018.
 */
public class HomePageTest {

    @Test(dataProvider="MacysHomePageData", dataProviderClass=HomePageDataProvider.class)
    public void testHomePage(String linkName){
        StartBrowser.openBroser().seeAllLinks(linkName);
    }

    @Test
    public void testNavNames(){
        StartBrowser.openBroser().verifyLinkNamesPresent();
    }

}
