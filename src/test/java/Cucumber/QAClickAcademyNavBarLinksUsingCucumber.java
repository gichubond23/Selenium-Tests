package Cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class QAClickAcademyNavBarLinksUsingCucumber extends BasePage {
    @Given("^Firefox Browser Initiated$")
    public void firefox_Browser_Initiated() throws Throwable {
         driver = initializedriver();
    }

    @Given("^User navigates to url (.+)$")
    public void user_navigates_to_url(String url) throws Throwable {
        driver.get(url);
    }

    @When("^User gets the count of links in header$")
    public void user_gets_the_count_of_links_in_header() throws Throwable {
        QAAcademyHomePageLocators qahpl = new QAAcademyHomePageLocators(driver);
        if (qahpl.getPopUpSize()>0) {

            qahpl.getpopupbutton().click();
        }

         Assert.assertEquals(qahpl.getHeaderLinkSize(),8);
    }

    @When("^Navigates to first link$")
    public void navigates_to_first_link() throws Throwable {
        QAAcademyHomePageLocators qahpl = new QAAcademyHomePageLocators(driver);
        for (int i=0;i<qahpl.getHeaderLinkSize();i++)
        {
            String linktext = qahpl.getHeaderLinks().get(i).getText();

            if (linktext.equalsIgnoreCase("COURSES"))
            {
                qahpl.getHeaderLinks().get(i).click();
            }
        }

    }

    @Then("^Validate the navigation to the first link page$")
    public void validate_the_navigation_to_the_first_link_page() throws Throwable {
          QAAcademyCoursePageLocators qacpl = new QAAcademyCoursePageLocators(driver);
          Assert.assertEquals(qacpl.getCoursePageText().getText(),"COURSES");
    }

    @Then("^Navigates to the second link$")
    public void navigates_to_the_second_link() throws Throwable {
        QAAcademyHomePageLocators qahpl = new QAAcademyHomePageLocators(driver);
        for (int i=0;i<qahpl.getHeaderLinkSize();i++)
        {
            String linktext = qahpl.getHeaderLinks().get(i).getText();

            if (linktext.equalsIgnoreCase("VIDEOS"))
            {
                qahpl.getHeaderLinks().get(i).click();
            }
        }
    }

    @Then("^Validate the navigation to the second link page$")
    public void validate_the_navigation_to_the_second_link_page() throws Throwable {
        QAClickAcademyVideoPageLocators qavpl = new QAClickAcademyVideoPageLocators(driver);
        Assert.assertEquals(qavpl.getVideoPageText().getText(),"VIDEO GALLERY");
        driver.quit();
    }

}
