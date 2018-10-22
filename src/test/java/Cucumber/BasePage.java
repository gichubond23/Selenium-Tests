package Cucumber;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BasePage {
    public static WebDriver driver;
    public static Properties p;
    public WebDriver initializedriver() throws IOException {
         p = new Properties();
        FileInputStream fis = new FileInputStream("C:\\Users\\giris\\IdeaProjects\\Selenium_Tests\\src\\main\\resources\\data.properties");
        p.load(fis);

        if (p.getProperty("browser").equals("firefox"))
        {
            System.setProperty("webdriver.gecko.driver","C:\\Software Downloads\\Selenium geckodriver firefox\\geckodriver.exe");
            driver = new FirefoxDriver();
        }

        if (p.getProperty("browser").equals("chrome"))
        {
            System.setProperty("webdriver.chrome.driver","C:\\Software Downloads\\Selenium chromedriver chrome\\chromedriver.exe");
            driver = new FirefoxDriver();
        }

        if (p.getProperty("browser").equals("IE"))
        {
            System.setProperty("webdriver.gecko.driver","C:\\Software Downloads\\Selenium IEdriver IE\\IEDriverServer.exe");
            driver = new FirefoxDriver();
        }

        driver.manage().timeouts().implicitlyWait(Long.parseLong(p.getProperty("time")), TimeUnit.SECONDS);

return driver;

    }

    public void getScreenshot(String result) throws IOException {
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("C://Software Downloads//Selenium 3.1.3//Screenshots//"+result+"screenshot.jpg"));
    }
}
