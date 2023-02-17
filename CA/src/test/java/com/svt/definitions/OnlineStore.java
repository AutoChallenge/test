package com.svt.definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class OnlineStore {
    WebDriver driver;
    //https://www.viewcvs.co.uk/
    //http://demo.seleniumeasy.com/

    @FindBy(css="label")
            public WebElement email;

   //ChromeDriver  driver;
                /*Scenario: Logo Presence on Store Home Page*/
    @Given("I launch Chrome Browser")
    public void i_launch_chrome_browser() {
       // System.setProperty("webdriver.chrome.driver","F:\\Cucumber\\Resources\\ChromeDriver 109.0.5414.74\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://automationteststore.com/");
       // driver.manage().deleteAllCookies();
      //  driver.findElement(By.xpath(""));
       // RelativeLocator.with(By.)
      /*  WebDriverWait  wait = new WebDriverWait(driver, Duration.ofMillis(10));
        Select sel=new Select(driver.findElement(By.xpath("fdsf")));
        Actions act=new Actions(driver);*/



    }
    @When("I navigate Cart Home Page")
    public void i_open_store_home_page() {
        // Write code here that turns the phrase above into concrete actions
      driver.findElement(By.xpath("(//span[contains(text(),'Cart')])[1]"));
    }
    @Then("I verify that the logo present on Page")
    public void i_verify_that_the_logo_present_on_page() {
        boolean img=driver.findElement(By.xpath("//a[@class=\"logo\"]/img")).isDisplayed();
        Assert.assertEquals(true,img);
    }
    @And("Close browser")
    public void close_browser() {
        // Write code here that turns the phrase above into concrete actions
        driver.close();
        driver.quit();

    }
                /*Scenario: Login home page*/
    @Given("User navigates to landing page")
    public void user_navigates_to_landing_page() {
        System.out.println("2.1");
    }
    @When("User login into application with {string} and password {string}")
    public void user_login_into_application_with_and_password(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("2.2"+string +" AND "+string2);
    }
    @Then("Home Page is Loaded with user id {int}")
    public void home_page_is_loaded_with_user_id(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("2.3"+" and "+int1);
    }
    @And("Login User display is {string}")
    public void login_user_display_is(String string1) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("2.4"+" and "+string1);
    }

    @And("User Register with following details")
    public void user_register_with_following_details(io.cucumber.datatable.DataTable dataTable) {
        List<List<String>> userDataList=dataTable.asLists(String.class);
        System.out.println(userDataList.get(0).get(0));
        System.out.println(userDataList.get(0).get(1));
    }

    @When("^User Signup into application with (.+) and password (.+)$")
    public void user_signup_into_application_with_abraham_and_password(String string1,String string2) {
        System.out.println(string1 + string2);
    }


   /* @Then("test if he is a (admin|user)")
    public void verify_connect(String userType) {
        if (userType == "admin")
            connectAsAdmin();
        else
            connectAsUser();
    }*/


}
