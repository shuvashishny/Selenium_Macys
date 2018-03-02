package dataprovider;

import org.testng.annotations.DataProvider;

/**
 * Created by Shuvashish on 2/1/2018.
 */
public class HomePageDataProvider {

    @DataProvider(name = "MacysHomePageData")
    public static Object[][] getHomePageHeaderLinks(){

        Object[][] linksName=new Object[6][1];
        linksName[0][0]= "Women";
        linksName[1][0]= "Men";
        linksName[2][0]= "Kids";
        linksName[3][0]= "Brands";
        linksName[4][0]= "Departments";
        linksName[5][0]= "Sale";
        return linksName;

    }
}
