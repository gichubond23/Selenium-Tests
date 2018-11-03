package Cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class ValidateTextOnHomePageUsingCucumber extends BasePage {
    @Given("^Firefox Browser will be Initiated$")
    public void firefox_Browser_will_be_Initiated() throws Throwable {
        driver = initializedriver();
    }

    @When("^User is navigated to the url (.+)$")
    public void user_is_navigated_to_the_url_http_www_qaclickacademy_com(String url) throws Throwable {
       driver.get(url);
    }

    @Then("^Validate the Text on the home page$")
    public void validate_the_Text_on_the_home_page() throws Throwable {
        QAAcademyHomePageLocators qahpl = new QAAcademyHomePageLocators(driver);
        if (qahpl.getPopUpSize()>0)
        {
            qahpl.getpopupbutton().click();
        }
        Assert.assertEquals(qahpl.getHomepagetext().getText(),"FEATURED COURSES");
        driver.quit();
    }
}
