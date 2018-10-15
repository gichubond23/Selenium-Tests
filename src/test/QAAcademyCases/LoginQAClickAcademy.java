import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginQAClickAcademy extends BasePage {
public static Logger log = LogManager.getLogger(BasePage.class.getName());
    @BeforeTest
    public void startdriver() throws IOException {
        driver = initializedriver();
        log.info("Driver initialized successfully");
        driver.get(p.getProperty("url"));
        log.info("Browser started successfully");
    }


    @Test(dataProvider = "getData")
    public void HomePageNavigation(String email,String password) throws IOException {


        LoginLocatorsPage l = new LoginLocatorsPage(driver);
        QAAcademyHomePageLocators qahpl = new QAAcademyHomePageLocators(driver);
        qahpl.getLoginlink().click();
        l.getEmail().sendKeys(email);
        l.getPassword().sendKeys(password);
        l.getSubmit().click();
        log.info("Test Case Completed");

    }

    @AfterTest
    public void teardown()
    {
        driver.close();
    }

    @DataProvider
    public Object[][] getData()
    {
        Object data[][] = new Object[1][2];

        data[0][0] = "restricteduser1@gmail.com";
        data[0][1] = "restricteduser123";

        //data[1][0] = "non_restricteduser1@gmail.com";
        //data[1][1] = "non_restricteduser123";

        return data;
    }
}
