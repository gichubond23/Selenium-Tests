package Cucumber;

import Locators.QAClickAcademyContactPageLocators;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class FillContactFormContactPageUsingCucumber extends BasePage{
    @Given("^Firefox Browser is being initiated$")
    public void firefox_Browser_is_being_initiated() throws Throwable {
        driver = initializedriver();
    }

    @Given("^User navigates to the testing url (.+)$")
    public void user_navigates_to_the_testing_url_http_www_qaclickacademy_com(String url) throws Throwable {
        driver.get(url);
    }

    @Given("^Navigates to contact page$")
    public void navigates_to_contact_page() throws Throwable {
      QAAcademyHomePageLocators qahpl = new QAAcademyHomePageLocators(driver);
      if (qahpl.getPopUpSize()>0)
      {
          qahpl.getpopupbutton().click();
      }
      qahpl.getContactLink().click();
    }

    @When("^User fills the Contact details like (.+), (.+), (.+), (.+), (.+)$")
    public void user_fills_the_Contact_details_like_abcd_USA_abc_yahoo_com_Discount_on_courses(String name,String mobileno,String country,String email,String description) throws Throwable {
        QAClickAcademyContactPageLocators qacopl = new QAClickAcademyContactPageLocators(driver);
        Select s = new Select(qacopl.getContactSubjectField());
        qacopl.getContactNameField().sendKeys(name);
        qacopl.getContactMobileNoField().sendKeys(mobileno);
        qacopl.getContactCountryField().sendKeys(country);
        qacopl.getContactEmailField().sendKeys(email);
        s.selectByVisibleText("Online Courses");
        qacopl.getContactDescriptionField().sendKeys(description);
    }

    @Then("^Validate the entered (.+), (.+), (.+), (.+), (.+) fields$")
    public void validate_the_entered_name_mobileno_country_email_description_fields(String name,String mobileno,String country,String email,String description) throws Throwable {
        QAClickAcademyContactPageLocators qacopl = new QAClickAcademyContactPageLocators(driver);
        Select s = new Select(qacopl.getContactSubjectField());
        JavascriptExecutor js = (JavascriptExecutor)driver;
        String name_value = js.executeScript("return arguments[0].value",qacopl.getContactNameField()).toString();
        Assert.assertEquals(name_value,name);
        String mobileno_value = js.executeScript("return arguments[0].value",qacopl.getContactMobileNoField()).toString();
        Assert.assertEquals(mobileno_value,mobileno);
        String country_value = js.executeScript("return arguments[0].value",qacopl.getContactCountryField()).toString();
        Assert.assertEquals(country_value,country);
        String email_value = js.executeScript("return arguments[0].value",qacopl.getContactEmailField()).toString();
        Assert.assertEquals(email_value,email);
        String subject_value = js.executeScript("return arguments[0].value",qacopl.getContactSubjectField()).toString();
        Assert.assertEquals(s.getFirstSelectedOption().getText(),subject_value);
        String description_value = js.executeScript("return arguments[0].value",qacopl.getContactDescriptionField()).toString();
        Assert.assertEquals(description_value,description);
        driver.quit();
    }

}
