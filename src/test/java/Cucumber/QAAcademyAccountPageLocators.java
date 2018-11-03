package Cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QAAcademyAccountPageLocators {
    public WebDriver driver;

    public QAAcademyAccountPageLocators(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);

    }



    By searchfield = By.name("query");

    @FindBy(xpath = "//div[@class='course-listing-title']")
    public WebElement course;

    public WebElement getSearchField()
    {
        return driver.findElement(searchfield);
    }
    public WebElement getCourseLink()
    {
        return course;
    }
}
