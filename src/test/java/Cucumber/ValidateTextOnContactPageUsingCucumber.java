package Cucumber;

import Locators.QAClickAcademyContactPageLocators;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class ValidateTextOnContactPageUsingCucumber extends BasePage {
    @Given("^Firefox Browser is going to be initiated$")
    public void firefox_Browser_is_going_to_be_initiated() throws Throwable {
         driver = initializedriver();
    }

    @Given("^User navigates to the website url (.+)$")
    public void user_navigates_to_the_website_url_http_www_qaclickacademy_com(String url) throws Throwable {
           driver.get(url);
    }

    @When("^User navigates to contact page$")
    public void user_navigates_to_contact_page() throws Throwable {
        QAAcademyHomePageLocators qahpl = new QAAcademyHomePageLocators(driver);
        if (qahpl.getPopUpSize()>0)
        {
            qahpl.getpopupbutton().click();
        }
        qahpl.getContactLink().click();
    }

    @Then("^Verify the text on the contact page$")
    public void verify_the_text_on_the_contact_page() throws Throwable {
        QAClickAcademyContactPageLocators qacopl = new QAClickAcademyContactPageLocators(driver);
        Assert.assertEquals(qacopl.getContactHeaderText().getText(),"CONTACT");
        driver.quit();
    }
}
