package framework.helpers;

import com.codeborne.selenide.Configuration;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class WaitHelper {

    public static void waitForPageLoaded() {
        WebDriver driver = getWebDriver();
        new WebDriverWait(driver, Configuration.timeout).until(
                webDriver -> ((JavascriptExecutor) webDriver).executeScript("return document.readyState").equals("complete"));
    }
}
