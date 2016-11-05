package pageObjects;

import com.OHRM.BaseClass;
import org.openqa.selenium.By;

/**
 * Created by ravinder reddy on 04/11/2016.
 */
public class LoginPage extends BaseClass {
    // List of web element selectors Simple page object model
    static By usernameTextbox = By.id("txtUsername");
    static By passwordTextbox = By.id("txtPassword");
    static By loginButton = By.id("btnLogin");
    static By welcomeMsg = By.id("welcome");
    static By logoutLink = By.linkText("Logout");

    public static DashBoardPage loginAttempt(String username, String password){
        driver.findElement(usernameTextbox).sendKeys(username);
        driver.findElement(passwordTextbox).sendKeys(password);
        driver.findElement(loginButton).click();
        return new DashBoardPage();
    }
    public static void logout(){
        driver.findElement(welcomeMsg).click();
        driver.findElement(logoutLink).click();
    }
}

//logingPage.loginAttempt(adminUserName,adminPassword).selectPIMModule().addEMployee();


