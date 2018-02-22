package pages;

import browser.StartBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import java.util.List;

public class HomePage {

    public void seeAllLinks(String linkName){
        List<WebElement> elements = StartBrowser.driver.findElements(
                By.xpath("//ul[@id='mainNavigationFobs']/li/a/span"));

        for(WebElement element: elements ){
            System.out.println(element.getText());
        }

        elements.stream().filter(element->element.getText().equals(linkName))
                .findFirst().get().click();
        System.out.println("this is a test");
        System.out.println("this is second test");
        System.out.println("this is third test");

        /*for(WebElement element: elements){
            if(element.getText().equals(linkName)) {
                element.click();
                break;
            }
        }*/

    }
}
