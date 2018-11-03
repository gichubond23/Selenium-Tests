package Cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;


public class QAAcademyHomePageLocators {
    public WebDriver driver;

    public QAAcademyHomePageLocators(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }



    By login = By.cssSelector(".pull-right > ul:nth-child(1) > li:nth-child(4) > a:nth-child(1) > span:nth-child(2)");
    By popup = By.xpath("//button[text()='NO THANKS']");
    By featuredcoursestext = By.xpath("//h2[text()='Featured Courses']");


    @FindBy(xpath = "//ul[@class='nav navbar-nav navbar-right']")
    public WebElement header;

    @FindBy(xpath = "//h2[text()='Featured Courses']")
    public WebElement homepagetext;

    @FindBy(xpath = "//ul[@class='nav navbar-nav navbar-right']/li[@class='active']/following-sibling::li[7]/a")
    public WebElement ContactLink;

    By headerlinks = By.tagName("a");




    public WebElement getLoginlink()
    {
        return driver.findElement(login);
    }
    public WebElement getpopupbutton()
    {
        return driver.findElement(popup);
    }
    public WebElement getFCText()
    {
        return driver.findElement(featuredcoursestext);
    }
    public int getPopUpSize() {return driver.findElements(popup).size();}
    public int getHeaderLinkSize()
    {
        return header.findElements(headerlinks).size();
    }
    public List<WebElement> getHeaderLinks()
    {
        return header.findElements(headerlinks);
    }
    public WebElement getHomepagetext(){return homepagetext;}
    public WebElement getContactLink()
    {
        return ContactLink;
    }
}
