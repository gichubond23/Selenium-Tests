package Cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class QAAcademyAccountPageLocators {
    public WebDriver driver;

    public QAAcademyAccountPageLocators(WebDriver driver)
    {
        this.driver = driver;
    }



    By searchfield = By.name("query");

    public WebElement getSearchField()
    {
        return driver.findElement(searchfield);
    }
}
