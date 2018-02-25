package pages;

import dataprovider.AllData;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import java.util.List;

public class HomePage {

    @FindBy(how = How.CSS, using = "a[class=' top-nav']") private List<WebElement> topNavs;
    @FindBy(how = How.CSS, using = "a[data-expanded='subcategory']")
    private List<WebElement> mensSubcategories;



    public HomePage clickLinkFromTopNavs(String linkName){
        for(WebElement element: topNavs ){
            System.out.println(element.getText());
        }

        topNavs.stream().filter(element-> element.getText().equals(linkName))
                .findFirst().get().click();

        //This following code is doing the same thing using for loop
        /*for(WebElement element: topNavs){
            if(element.getText().equals(linkName)) {
                element.click();
                break;
            }
        }*/
        return this;

    }

    public void clickMensSubcategory(String subCategoryName){
        mensSubcategories.stream().filter(scn -> scn.getText()
                .equalsIgnoreCase(subCategoryName)).findFirst().get().click();
    }

    public void verifyLinkNamesPresent(){

        Assert.assertEquals(topNavs.size(), 6);

        for(WebElement element : topNavs){
            String str = element.getText();
            Assert.assertTrue(AllData.getAllData().contains(str), str+" was not found");
        }
    }
}
