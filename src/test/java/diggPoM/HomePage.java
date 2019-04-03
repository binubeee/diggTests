package diggPoM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver d) {
        driver = d;
    }


    public List<WebElement> linkSubHeadings() {
        return driver.findElements(By.cssSelector("a.channel__subnav__nav-item"));
    }

    public WebElement labelSearch() {
        //return driver.findElement(By.cssSelector("span.site-navigation__nav-item-label"));
        return driver.findElement(By.xpath("//*[@id=\"js--nav-search\"]/span/span[2]"));
    }

    public WebElement txtSearchBox() {
        return driver.findElement(By.cssSelector("#form-digg-search-input"));
    }

    public void clickSearchLabel() {
        labelSearch().click();

        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(txtSearchBox()));

    }

    public void enterSearchCriteria(String input) throws InterruptedException {

        txtSearchBox().sendKeys(input);
    }

}
