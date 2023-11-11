package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Main {
    private WebDriver driver;


    @BeforeClass
    public void setup() {
        // Set the path to the Firefox driver executable if it's not in your system PATH
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Rashad\\IdeaProjects\\untitled5\\geckodriver.exe");

        // Initialize the WebDriver
        driver = new FirefoxDriver();

        // Set implicit wait to handle dynamic elements
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test(enabled = false)
    public void signUp() {
        driver.get("https://parabank.parasoft.com/parabank/admin.htm");
        WebElement callRegister = driver.findElement(By.cssSelector("#loginPanel > p:nth-child(3) > a:nth-child(1)"));
        callRegister.click();
        WebElement firstName = driver.findElement(By.cssSelector("#customer\\.firstName"));
        firstName.sendKeys("Rashad");
        WebElement lastName = driver.findElement(By.cssSelector("#customer\\.lastName"));
        lastName.sendKeys("Azimov");
        WebElement address = driver.findElement(By.cssSelector("#customer\\.address\\.street"));
        address.sendKeys("Magomaev");
        WebElement city = driver.findElement(By.cssSelector("#customer\\.address\\.city"));
        city.sendKeys("Baku");
        WebElement state = driver.findElement(By.cssSelector("#customer\\.address\\.state"));
        state.sendKeys("null");
        WebElement zipCode = driver.findElement(By.cssSelector("#customer\\.address\\.zipCode"));
        zipCode.sendKeys("12345");
        WebElement phone = driver.findElement(By.cssSelector("#customer\\.phoneNumber"));
        phone.sendKeys("+99477777777");
        WebElement ssnNumber = driver.findElement(By.cssSelector("#customer\\.ssn"));
        ssnNumber.sendKeys("112233");
        WebElement username = driver.findElement(By.cssSelector("#customer\\.username"));
        username.sendKeys("admin");
        WebElement password = driver.findElement(By.cssSelector("#customer\\.password"));
        password.sendKeys("12345678");
        WebElement confirmPassword = driver.findElement(By.cssSelector("#repeatedPassword"));
        confirmPassword.sendKeys("12345678");
        WebElement registerButton = driver.findElement(By.cssSelector(".form2 > tbody:nth-child(1) > tr:nth-child(13) > td:nth-child(2) > input:nth-child(1)"));
        registerButton.click();

    }

    @Test (enabled = true)
    public void logIn(){
        loginProcess();

    }
    @Test
    public void payBill() {
        loginProcess();
        WebElement billPay = driver.findElement(By.cssSelector("#leftPanel > ul:nth-child(3) > li:nth-child(4) > a:nth-child(1)"));
        billPay.click();
        WebElement payeeName = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div[1]/form/table/tbody/tr[1]/td[2]/input"));
        payeeName.sendKeys("Rashad");
        WebElement address = driver.findElement(By.cssSelector(".form2 > tbody:nth-child(1) > tr:nth-child(2) > td:nth-child(2) > input:nth-child(1)"));
        address.sendKeys("Dadashov");
        WebElement city = driver.findElement(By.cssSelector(".form2 > tbody:nth-child(1) > tr:nth-child(3) > td:nth-child(2) > input:nth-child(1)"));
        city.sendKeys("Washington");
        WebElement state = driver.findElement(By.cssSelector(".form2 > tbody:nth-child(1) > tr:nth-child(4) > td:nth-child(2) > input:nth-child(1)"));
        state.sendKeys("DC");
        WebElement zipCode = driver.findElement(By.cssSelector(".form2 > tbody:nth-child(1) > tr:nth-child(5) > td:nth-child(2) > input:nth-child(1)"));
        zipCode.sendKeys("12345");
        WebElement phone = driver.findElement(By.id("3a6555b2-e513-455a-8ea3-caa6bfc54051"));
        phone.sendKeys("+99477777777");
        WebElement account = driver.findElement(By.cssSelector(".form2 > tbody:nth-child(1) > tr:nth-child(8) > td:nth-child(2) > input:nth-child(1)"));
        account.sendKeys("azimov");
        WebElement verifyAccount = driver.findElement(By.cssSelector(".form2 > tbody:nth-child(1) > tr:nth-child(9) > td:nth-child(2) > input:nth-child(1)"));
        verifyAccount.sendKeys("azimov");
        WebElement amount = driver.findElement(By.cssSelector(".form2 > tbody:nth-child(1) > tr:nth-child(11) > td:nth-child(2) > input:nth-child(1)"));
        amount.sendKeys("1000");
        driver.manage().timeouts().implicitlyWait(2000,TimeUnit.MILLISECONDS);
        driver.quit();
    }
    public void loginProcess(){
        driver.get("https://parabank.parasoft.com/parabank/admin.htm");
        WebElement username = driver.findElement(By.cssSelector("div.login:nth-child(2) > input:nth-child(1)"));
        username.sendKeys("admin");
        WebElement password = driver.findElement(By.cssSelector("div.login:nth-child(4) > input:nth-child(1)"));
        password.sendKeys("12345678");
        WebElement loginButton = driver.findElement(By.cssSelector("div.login:nth-child(5) > input:nth-child(1)"));
        loginButton.click();

    }
}