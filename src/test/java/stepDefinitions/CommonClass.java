package stepDefinitions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
import java.util.Random;

public class CommonClass {
    WebDriver driver;

    public CommonClass() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public String getScreenShot(String name) throws IOException {
        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        //The below method will save the screen shot in destination directory
        String path=System.getProperty("user.dir")+"/output/screenshot_"+name+".png";
        FileHandler.copy(scrFile, new File(path));
        return path;
    }
}
