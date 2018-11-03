import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class QAAcademyAccountPageLocators {
    public WebDriver driver;

    public QAAcademyAccountPageLocators(WebDriver driver)
    {
        this.driver = driver;
    }



    By searchfield = By.name("query");

    @FindBy(xpath = "//div[@class='course-listing-title']")
    public WebElement course;

    public WebElement getSearchField()
    {
        return driver.findElement(searchfield);
    }
    public WebElement getCourse()
    {
        return course;
    }
}
