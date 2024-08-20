package com.jat20wd.SeleniumKeyboardEvents;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;






public class GuviRegistrationandLogin {
	
	private static FluentWait<WebDriver> wait;

	public static <WebDriver> void main(String[] args) {
		
		//set up the Chrome Browser
	  	  ChromeDriver driver=new ChromeDriver();
	  	  
	  	//to maximize the window
	  	  driver.manage().window().maximize();
	  	  
	  	//load the url
	  	  driver.get("https://www.google.com/");
	  	try {
            // Launch the GUVI website
            driver.get("https://www.guvi.in/");

            // Locate the signup button and click on it
            WebElement signupButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Signup')]")));
            signupButton.click();

            // Fill in the signup form with required details
            WebElement nameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("name")));
            WebElement emailField = driver.findElement(By.id("email"));
            WebElement passwordField = driver.findElement(By.id("password"));
            WebElement confirmPasswordField = driver.findElement(By.id("confirmPassword"));

            nameField.sendKeys("Test User");
            emailField.sendKeys("testuser@example.com");
            passwordField.sendKeys("TestPassword123");
            confirmPasswordField.sendKeys("TestPassword123");

            // Click on the signup button to submit the form
            WebElement submitSignupButton = driver.findElement(By.xpath("//button[contains(text(),'Signup')]"));
            submitSignupButton.click();

            // Wait for the page to load and verify that the user is registered successfully
            wait.until(ExpectedConditions.urlContains("some-expected-url-after-signup"));

            // Locate the Login button and click on it
            WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Login')]")));
            loginButton.click();

            // Fill in the login form with the email and password
            WebElement loginEmailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginEmail")));
            WebElement loginPasswordField = driver.findElement(By.id("loginPassword"));

            loginEmailField.sendKeys("testuser@example.com");
            loginPasswordField.sendKeys("TestPassword123");

            // Click on the login button to submit the form
            WebElement submitLoginButton = driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
            submitLoginButton.click();

            // Wait for the page to load and verify that the user is logged in successfully
            wait.until(ExpectedConditions.urlContains("some-expected-url-after-login"));
        } finally {
            // Close the Browser
            driver.quit();
        }
    }
}
