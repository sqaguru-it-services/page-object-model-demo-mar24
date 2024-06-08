package testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import framework.BaseTest;
import pages.ButtonsPage;
import pages.ElementsPage;
import pages.HomePage;

public class ActionsContextClickTest extends BaseTest {

	@Test
	public void actionsContextClickTest() {
		
		//sample project

		HomePage homePage = new HomePage(driver);

		homePage.clickButtonElements();

		ElementsPage elementsPage = new ElementsPage(driver);

		elementsPage.clickButtonElements();

		ButtonsPage buttonsPage = new ButtonsPage(driver);

		buttonsPage.contextClickOnRightClickButton();

		buttonsPage.verifyLabelOfRightClickSuccess();

		buttonsPage.verifyRightClickLabelText();

	}

}
