//package tests;
//
//import java.time.Duration;
//
//import org.testng.Assert;
//import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;
//
//import base.BaseTest;
//import pages.Login_Page;
//
//public class LoginTests extends BaseTest {
//
//    @DataProvider(name = "loginData")
//    public Object[][] loginData() {
//
//        return new Object[][] {
//
//            // username, password, expected result
//            {"anuja@1411", "anuja@04", "valid"},
//            {"anuja@1411", "wrong123", "invalid"},
//            {"wrong@", "anuja@04", "invalid"},
//            {"wrong@", "wrong123", "invalid"},
//            {"anuja@1411", " ", "invalid"},
//            {" ", "anuja@04", "invalid"}
//        };
//    }
//
//    @Test(dataProvider = "loginData")
//    public void loginTest(String username, String password, String expectedResult) throws InterruptedException {
//
//        Login_Page login = new Login_Page(driver);
//
//        
//        login.loginLinkClick();
//        login.loginUsername(username);
//        login.loginPassword(password);
//        Thread.sleep(3000);
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
//        login.loginButtonClick();
//
//        if (expectedResult.equals("valid")) {
//
//            Assert.assertTrue(login.isLoggedIn(),
//                    "User was not logged in with valid credentials");
//
//        } else {
//
//            Assert.assertTrue(login.isLoginFailed(),
//                    "Invalid credentials were accepted");
//        }
//    }
//}



package tests;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.Login_Page;

public class LoginTests extends BaseTest {

    @DataProvider(name = "loginData")
    public Object[][] loginData() {
        return new Object[][] {
            {"anuja@1411", "anuja@04", "valid"},
            {"anuja@1411", "wrong123", "invalid"},
            {"wrong@", "anuja@04", "invalid"},
            {"wrong@", "wrong123", "invalid"},
            {"anuja@1411", " ", "invalid"},
            {" ", "anuja@04", "invalid"}
        };
    }

    @Test(dataProvider = "loginData")
    public void loginTest(String username, String password, String expectedResult) {

        Login_Page login = new Login_Page(driver);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Open login modal safely
        login.loginLinkClick();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginusername")));

        // Perform login
        login.loginUsername(username);
        login.loginPassword(password);
        login.loginButtonClick();

        if (expectedResult.equals("valid")) {
            // Verify welcome text is displayed on successful login
            boolean isLogged = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nameofuser"))).isDisplayed();
            Assert.assertTrue(isLogged, "Login failed for valid credentials.");
        } else {
            // Handle and accept error alert on invalid login
            Alert alert = wait.until(ExpectedConditions.alertIsPresent());
            Assert.assertNotNull(alert, "Expected error alert, but none appeared.");
            alert.accept();
        }
    }
}