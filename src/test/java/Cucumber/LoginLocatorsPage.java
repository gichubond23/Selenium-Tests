package Cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginLocatorsPage {
public WebDriver driver;
       public LoginLocatorsPage(WebDriver driver) {
           this.driver = driver;
           PageFactory.initElements(driver,this);
       }

    @FindBy(id = "user_email")
    WebElement email;
    @FindBy(id = "user_password")
    WebElement password;
    @FindBy(xpath = "//input[@type='submit']")
    WebElement submit;

         /*By email = By.id("user_email");
         By password = By.id("user_password");
         By submit = By.xpath("//input[@type='submit']");*/



        public WebElement getEmail()
        {
            return email;
        }

       public WebElement getPassword()
       {
        return password;
       }

       public WebElement getSubmit()
       {
        return submit;
       }



}
