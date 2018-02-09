package pages;

import browser.StartBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class HomePage {

    public void seeAllLinks(String linkName){
        List<WebElement> elements = StartBrowser.driver.findElements(
                By.xpath("//ul[@id='mainNavigationFobs']/li/a/span"));

        for(WebElement element: elements ){
            Assert.assertEquals(element.getText().contains());
            System.out.println(element.getText());
        }

        elements.stream().filter(element->element.getText().equals(linkName))
                .findFirst().get().click();

        /*for(WebElement element: elements){
            if(element.getText().equals(linkName)) {
                element.click();
                break;
            }
        }*/

    }
}
