package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ElementsPage {
	WebDriver driver;

	public ElementsPage(WebDriver driver) {
		this.driver = driver;
	}

	By btnButtons = By.xpath("//span[text()='Buttons']");

	public void clickButtonElements() {
		driver.findElement(btnButtons).click();
	}
}
