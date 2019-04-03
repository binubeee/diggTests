package diggPoM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SearchResultsPage {
    WebDriver driver;

    public SearchResultsPage(WebDriver d) {
        driver = d;
    }

    public WebElement txtSearchBox() {
        return driver.findElement(By.cssSelector("input.search-form-input"));
    }

    public WebElement labelResulsCount() {
        return driver.findElement(By.cssSelector("span.object-hed-search-results-count"));
    }

    public List<WebElement> resultHeaders() {
        return driver.findElements(By.xpath("//*[@id=\"search-story-list\"]/article/div[2]/header/h2/a"));
    }
    public WebElement labelNoResults() {
        return driver.findElement(By.cssSelector("p.search-no-results"));
    }

    public void enterSearchCriteria(String input) {
        txtSearchBox().sendKeys(input);
    }

}
