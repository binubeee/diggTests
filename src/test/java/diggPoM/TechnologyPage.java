package diggPoM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TechnologyPage {
    WebDriver driver;

    public TechnologyPage(WebDriver d) {
        driver = d;
    }

    public WebElement pageHeader() {
        return driver.findElement(By.cssSelector("div.channel-branding-title"));
    }

}
