package com.jat20wd.SeleniumKeyboardEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class DatePickerautomation {
	 public static void main(String[] args) {
	        
	      //set up the Chrome Browser
	  	  ChromeDriver driver=new ChromeDriver();
	  	  
	  	//to maximize the window
	  	  driver.manage().window().maximize();
	  	  
	  	//load the url
	  	  driver.get("https://www.google.com/");
	  	  

	        try {
	            // Maximize the browser window
	            driver.manage().window().maximize();

	            // Navigate to the URL
	            driver.get("https://jqueryui.com/datepicker/");

	            // Switch to the iframe that contains the date picker
	            WebElement iframe = driver.findElement(By.cssSelector(".demo-frame"));
	            driver.switchTo().frame(iframe);

	            // Click on the date picker input field to open the date picker
	            WebElement datePicker = driver.findElement(By.id("datepicker"));
	            datePicker.click();

	            // Click the next month button
	            WebElement nextMonthButton = driver.findElement(By.cssSelector(".ui-datepicker-next"));
	            nextMonthButton.click();

	            // Select date 22 from the date picker
	            WebElement dateToSelect = driver.findElement(By.xpath("//a[text()='22']"));
	            dateToSelect.click();

	            // Print the selected date on the console
	            String selectedDate = datePicker.getAttribute("value");
	            System.out.println("Selected date: " + selectedDate);
	        } finally {
	            // Close the browser window and quit the WebDriver instance
	            driver.quit();
	        }
	    }
	}

