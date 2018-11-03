import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QAClickAcademyContactPageLocators {
       public WebDriver driver;
       public QAClickAcademyContactPageLocators(WebDriver driver)
       {
           this.driver = driver;
           PageFactory.initElements(driver,this);
       }

       @FindBy(xpath = "//div[@class='col-sm-12 text-center']")
       public WebElement ContactHeaderText;
       @FindBy(id = "contact-input-name")
       public WebElement ContactNameField;
       @FindBy(id = "contact-input-mobile")
       public WebElement ContactMobileNoField;
       @FindBy(id = "contact-input-country")
       public WebElement ContactCountryField;
       @FindBy(id = "contact-input-email")
       public WebElement ContactEmailField;
       @FindBy(id = "contact-input-message")
       public WebElement ContactDescriptionField;
       @FindBy(id = "contact-input-subject")
       public WebElement ContactSubjectField;





    public WebElement getContactHeaderText()
       {
           return ContactHeaderText;
       }
    public WebElement getContactNameField()
    {
        return ContactNameField;
    }
    public WebElement getContactMobileNoField()
    {
        return ContactMobileNoField;
    }
    public WebElement getContactCountryField()
    {
        return ContactCountryField;
    }
    public WebElement getContactEmailField()
    {
        return ContactEmailField;
    }
    public WebElement getContactDescriptionField()
    {
        return ContactDescriptionField;
    }
    public WebElement getContactSubjectField()
    {
        return ContactSubjectField;
    }
}
