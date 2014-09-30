package co.edu.eafit.safebuy.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RegisterBuyerPage {

	private final WebDriver webDriver;

	public RegisterBuyerPage() {
		webDriver = new FirefoxDriver();
		webDriver
				.get("http://localhost:8080/safebuy/registerBuyer.html");
	}

	public String getTitle() {
		return webDriver.getTitle();
	}

	public void close() {
		webDriver.quit();
	}

	public void submit() {
		WebElement button = webDriver.findElement(By.id("sendButton"));
		button.click();
	}

	public String getErrorMessage() {

		return webDriver.findElement(By.className("error")).getText();
	}

	public String getSuccessMessage() {

		return webDriver.findElement(By.className("success")).getText();
	}

	public void fillForm(String userName, String name, String lastName,
			String birthday, String email) {
		webDriver.findElement(By.xpath("//input[@name= 'user']")).sendKeys(
				userName);
		webDriver.findElement(By.xpath("//input[@name= 'name']"))
				.sendKeys(name);
		webDriver.findElement(By.xpath("//input[@name= 'lastName']")).sendKeys(
				lastName);
		webDriver.findElement(By.xpath("//input[@name= 'birthDay']")).sendKeys(
				birthday);
		webDriver.findElement(By.xpath("//input[@name = 'email']")).sendKeys(
				email);
	}

	public void takeScreenshot(String fileName) throws IOException {
		File scrFile = ((TakesScreenshot) webDriver)
				.getScreenshotAs(OutputType.FILE);
		// Now you can do whatever you need to do with it, for example copy
		// somewhere
		FileUtils.copyFile(scrFile, new File(fileName));
	}

}
