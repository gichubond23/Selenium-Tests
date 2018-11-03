import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QAClickAcademyVideoPageLocators {
    public WebDriver driver;
    public QAClickAcademyVideoPageLocators(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//div[@class='col-sm-12 text-center']")
    public WebElement videopagetext;

    public WebElement getVideoPageText()
    {
        return videopagetext;
    }
}
