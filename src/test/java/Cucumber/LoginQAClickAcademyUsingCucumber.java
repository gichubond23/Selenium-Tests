package Cucumber;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;



public class LoginQAClickAcademyUsingCucumber extends BasePage  {

    @Given("^Firefox Browser is Initiated$")
    public void firefox_Browser_is_Initiated() throws Throwable {
        driver = initializedriver();
    }

    @Given("^Navigate to the url \"([^\"]*)\"$")
    public void navigate_to_the_url(String arg1) throws Throwable {
        driver.get(arg1);
    }

    @Given("^Click on Login Link on the HomePage$")
    public void click_on_Login_Link_on_the_HomePage() throws Throwable {
        QAAcademyHomePageLocators qahpl = new QAAcademyHomePageLocators(driver);
        if(qahpl.getPopUpSize()>0)
        {
            qahpl.getpopupbutton().click();
        }
        qahpl.getLoginlink().click();

    }

    @When("^User enters username (.+) and password (.+) and clicks login button$")
    public void user_enters_username_and_password_and_clicks_login_button(String username, String password) throws Throwable {
        LoginLocatorsPage l = new LoginLocatorsPage(driver);
        l.getEmail().sendKeys(username);
        l.getPassword().sendKeys(password);
        l.getSubmit().click();
    }

    @Then("^Verify user is successfully logged in$")
    public void verify_user_is_successfully_logged_in() throws Throwable {
       QAAcademyAccountPageLocators qaaapl = new QAAcademyAccountPageLocators(driver);
        Assert.assertTrue(qaaapl.getSearchField().isDisplayed());

    }

    @And("^Quit Browser$")
    public void quit_browser() throws Throwable {
        driver.quit();
    }
}
