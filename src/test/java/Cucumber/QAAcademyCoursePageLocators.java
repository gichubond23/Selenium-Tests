package Cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QAAcademyCoursePageLocators {
    public WebDriver driver;

    public QAAcademyCoursePageLocators(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//h2[@class='section-title']")
    public WebElement coursepageheader;

    By courselinktext = By.xpath("//div[@class='col-sm-12 text-center']");

    public WebElement getCoursePageHeader()
    {
        return coursepageheader;
    }
    public WebElement getCoursePageText()
    {
        return driver.findElement(courselinktext);
    }
}
