package com.OHRM;

import com.sun.org.apache.bcel.internal.generic.Select;
import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageObjects.AddSkill;
import pageObjects.LoginPage;

import java.net.MalformedURLException;
import java.util.List;
import java.util.concurrent.TimeUnit;


/**
 * Created by Shohil on 24/08/2016.
 */
public class StepDefs{
    WebDriver driver = BrowserFactory.getDriver();
    String baseURL= LoadProps.getProperty("baseURL");
    String browser = LoadProps.getProperty("browser");
    private String userName="admin";
    private String password="aediMNjU";
    private String skillname="JAVA3";
    private String skillDescription="good skill";

    BaseClass baseClass = new BaseClass();
    @Before
    public void StartBrowser()throws MalformedURLException,InterruptedException {
        try {
            BrowserFactory.StartBrowser(browser, baseURL);
            driver = BrowserFactory.driver;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @After
    public void closeBrowser(){
        driver.quit();
    }

    @Given("^Admin is on login page$")
    public void admin_is_on_login_page() {
        Assert.assertTrue(driver.findElement(By.id("btnLogin")).isDisplayed());
    }

    @When("^Admin login with below details$")
    public void admin_login_with_below_details(DataTable userDetails) {
        List<List<String>> details=userDetails.raw();
        driver.findElement(By.id("txtUsername")).sendKeys(details.get(0).get(0));
        driver.findElement(By.id("txtPassword")).sendKeys(details.get(1).get(0));
    }

    @When("^admin select login$")
    public void admin_select_login() {
        driver.findElement(By.id("btnLogin")).click();
    }

    @Then("^Admin should login successfully$")
    public void admin_should_login_successfully(){
        Assert.assertTrue(driver.findElement(By.id("menu_pim_viewPimModule")).isEnabled());
    }

    @Then("^Admin should welcome message as \"([^\"]*)\"$")
    public void admin_should_welcome_message_as(String message){
        Assert.assertTrue(driver.findElement(By.id("welcome")).getText().contains(message));
    }
    @Given("^Admin is logged in$")
    public void admin_is_logged_in_on_OHRM_website(){
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("aediMNjU");
        driver.findElement(By.id("btnLogin")).click();
        Assert.assertTrue(driver.findElement(By.id("menu_pim_viewPimModule")).isEnabled());
    }


    @Then("^Admin should be on the \"([^\"]*)\" Page$")
    public void iAmOnThePage(String pageName) {
//        driver.findElement(By.cssSelector("#content .head[name='"+pageName+"']"));
        Assert.assertTrue(baseClass.getCurrentHeader().equalsIgnoreCase(pageName));
    }

    @When("^Admin select PIM modual and select Add Employee$")
    public void admin_select_PIM_modual_and_select_Add_Employee(){
        driver.findElement(By.id("menu_pim_viewPimModule")).click();
        driver.findElement(By.id("menu_pim_addEmployee")).click();
    }

    @When("^select create login details checkbox$")
    public void select_create_login_details_checkbox(){
        driver.findElement(By.id("chkLogin")).click();
    }

    @When("^enter below details$")
    public void enter_below_details(DataTable empDetails){
        List<List<String>> empData = empDetails.raw();
        driver.findElement(By.id("firstName")).sendKeys(empData.get(0).get(0));
        driver.findElement(By.id("lastName")).sendKeys(empData.get(0).get(1));
        driver.findElement(By.id("user_name")).sendKeys(empData.get(0).get(2));
        driver.findElement(By.id("user_password")).sendKeys(empData.get(0).get(3));
        driver.findElement(By.id("re_password")).sendKeys(empData.get(0).get(4));
        //Select location= new Select(driver.findElement(By.id("location")));

    }

    @When("^select Save$")
    public void select_Save(){
    }

    @Then("^Admin should see employee details in employee list$")
    public void admin_should_see_employee_details_in_employee_list() {
        }
//        feature: Adding new skill


@Given("^admin is logged in and is on admin home page$")
public void verifyAdminIsLoggedIn() throws Throwable {
    LoginPage.loginAttempt(userName, password);
}

    @When("^admin select admin module$")
    public void selectAdminModule() {
        AddSkill.goToAdminModule();
    }

    @When("^select qualifiications$")
    public void selectQualifiications() throws Throwable {
        AddSkill.goToQualificationsModule();
    }

    @When("^select skills$")
    public void selectSkills() throws Throwable {
        AddSkill.goToSkillsModule();
    }

    @When("^select add button$")
    public void select_add_button() throws Throwable {
        AddSkill.selectAddSkill();
    }

    @When("^enter details as below$")
    public void enter_details_as_below(DataTable arg1) throws Throwable {
        AddSkill.enterSkillDetails(skillname,skillDescription);
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)

    }

    @When("^select save button$")
    public void select_save_button() throws Throwable {
        AddSkill.selectSave();
    }

    @Then("^admin should see skill in skills page$")
    public void admin_should_see_skill_in_skills_page() throws Throwable {
        Assert.assertTrue(driver.findElement(By.linkText(skillname)).getText().contains(skillname));
    }
}



