import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;


public class ValidateTextOnHomePage extends BasePage {
public static Logger log = LogManager.getLogger(BasePage.class.getName());
    @BeforeTest
    public void startdriver() throws IOException {
        driver = initializedriver();
        log.info("Driver initialized successfully");
        driver.get(p.getProperty("url"));
        log.info("Browser started successfully");
    }
    @Test
    public void validate() throws IOException {

        QAAcademyHomePageLocators qahpl = new QAAcademyHomePageLocators(driver);
        WebDriverWait wd1 = new WebDriverWait(driver,10);
        wd1.until(ExpectedConditions.visibilityOfElementLocated(qahpl.popup));
        qahpl.getpopupbutton().click();
        WebDriverWait wd2= new WebDriverWait(driver,10);
        wd2.until(ExpectedConditions.visibilityOfElementLocated(qahpl.featuredcoursestext));
        Assert.assertEquals(qahpl.getFCText().getText(),"FEATURED COURSES");
        log.info("Assertion Validation Success");
    }

    @AfterTest
    public void teardown()
    {
        driver.close();
    }
}
