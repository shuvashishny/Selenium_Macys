package base;

import browser.Browser;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

/**
 * Created by Shuvashish on 2/22/2018.
 */
public class TestListener extends TestListenerAdapter {

    public void onTestFailure(ITestResult tr){
        System.out.println("test failed "+tr.getName());
        File fileSource = ((TakesScreenshot) Browser.driver)
                .getScreenshotAs(OutputType.FILE);

        try {
            Files.copy(fileSource.toPath(), new File(TestBase.getSrcFolder()+tr.getName()+".png").toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void onTestSuccess(ITestResult tr){
        System.out.println("test passed "+tr.getName());
    }
}
