package Cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class ValidateTextOnCoursePageUsingCucumber extends BasePage {
    @Given("^Firefox Browser was Initiated$")
    public void firefox_Browser_was_Initiated() throws Throwable {
        driver = initializedriver();
    }

    @Given("^User navigates to the url (.+)$")
    public void user_navigates_to_the_url(String url) throws Throwable {
        driver.get(url);
    }

    @Given("^Clicks on Login Link on the HomePage$")
    public void clicks_on_Login_Link_on_the_HomePage() throws Throwable {
        QAAcademyHomePageLocators qaphl = new QAAcademyHomePageLocators(driver);
       if (qaphl.getPopUpSize()>0)
       {
           qaphl.getpopupbutton().click();
       }
       qaphl.getLoginlink().click();
    }

    @Given("^User enters his username (.+) and password (.+) and clicks login button$")
    public void user_enters_username_and_password_and_clicks_login_button(String username, String password) throws Throwable {
        LoginLocatorsPage l = new LoginLocatorsPage(driver);
        l.getEmail().sendKeys(username);
        l.getPassword().sendKeys(password);
        l.getSubmit().click();
    }

    @When("^User clicks the course$")
    public void user_clicks_the_course() throws Throwable {
       QAAcademyAccountPageLocators qaapl = new QAAcademyAccountPageLocators(driver);
       qaapl.getCourseLink().click();
    }

    @Then("^Verify the text on the course curriculum page$")
    public void verify_the_text_on_the_course_curriculum_page() throws Throwable {
        QAAcademyCoursePageLocators qacpl = new QAAcademyCoursePageLocators(driver);
        Assert.assertEquals(qacpl.getCoursePageHeader().getText(),"Class Curriculum");
        driver.quit();
    }







}
