import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class LoginLocatorsPage {
public WebDriver driver;
       public LoginLocatorsPage(WebDriver driver) {
           this.driver = driver;
       }


         By email = By.id("user_email");
         By password = By.id("user_password");
         By submit = By.xpath("//input[@type='submit']");



        public WebElement getEmail()
        {
            return driver.findElement(email);
        }

       public WebElement getPassword()
       {
        return driver.findElement(password);
       }

       public WebElement getSubmit()
       {
        return driver.findElement(submit);
       }



}
