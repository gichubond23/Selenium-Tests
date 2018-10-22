import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;


public class QAAcademyHomePageLocators {
    public WebDriver driver;

    public QAAcademyHomePageLocators(WebDriver driver)
    {
        this.driver = driver;
    }



    By login = By.cssSelector(".pull-right > ul:nth-child(1) > li:nth-child(4) > a:nth-child(1) > span:nth-child(2)");
    By popup = By.xpath("//button[text()='NO THANKS']");
    By featuredcoursestext = By.xpath("//h2[text()='Featured Courses']");

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
}
