package dataprovider;

import org.testng.annotations.DataProvider;

/**
 * Created by Shuvashish on 2/1/2018.
 */
public class HomePageDataProvider {

   @DataProvider(name = "MacysHomePageData")
    public static Object[][] getHomePageHeaderLinks(){

        Object[][] linksName=new Object[6][1];
        linksName[0][0]= "WOMEN";
        linksName[1][0]= "MEN";
        linksName[2][0]= "HOME";
        linksName[3][0]= "BED & BATH";
        linksName[4][0]= "SHOES";
        linksName[5][0]= "HANDBAGS";
        return linksName;
    }



}
