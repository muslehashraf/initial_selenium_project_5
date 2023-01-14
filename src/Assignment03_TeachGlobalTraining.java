import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;
import utils.TechGlobalUtil;
import utils.Waiter;

public class Assignment03_TeachGlobalTraining {
    public static void main(String[] args) {

        /*
        TEST CASE 1
        Go to https://techglobal-training.netlify.app/
        Select "Frontend Testing" from the "Practices" dropdown
        Select the "Xpath-CSS Locators" card
        Validate the Programming Languages list items below
        Java
        JavaScript
        C#
         */

        WebDriver driver = Driver.getDriver();

        TechGlobalUtil.getFrontendTesting();
        TechGlobalUtil.clickOnCard(2);

        Waiter.pause(2);

        for (WebElement element : driver.findElements(By.xpath("(//h3[@class='Xpath_subheader__VOtsU']/..//ul)[1]"))) {
            System.out.println(element.getText());
            System.out.println(element.isDisplayed());
        }


        System.out.println("-------------Test Case 2-------------");


        Waiter.pause(2);

        for (WebElement element : driver.findElements(By.xpath("(//h3[@class='Xpath_subheader__VOtsU']/..//ul)[2]"))) {
            System.out.println(element.getText());
            System.out.println(element.isDisplayed());
        }


        Driver.quitDriver();


        /*
        TEST CASE 2
        Go to https://techglobal-training.netlify.app/
        Select "Frontend Testing" from the "Practices" dropdown
        Select the "Xpath-CSS Locators" card
        Validate the Automation Tools list items below
        Selenium WebDriver
        WebDriverIO
        Cypress
        Playwright
         */
    }
}
