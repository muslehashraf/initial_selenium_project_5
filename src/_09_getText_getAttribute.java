import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Driver;

public class _09_getText_getAttribute {
    public static void main(String[] args) {

        /*
        Go to https://www.techglobalschool.com/
        Scroll down to the bottom of the page

        Validate the Subscribe form
        Validate "Subscribe" heading2 with its text
        Validate "Stay up to date!" paragraph with its text
        Validate "Enter your first name" input box with its placeholder
        Validate "Enter your last name" input box with its placeholder
        Validate "Add your email" input box with its placeholder
        Validate "SUBSCRIBE" button with its text

        driver.findElement(By....).getAttribute("placeholder")
         */

        WebDriver driver = Driver.getDriver();

        driver.get("https://www.techglobalschool.com/");

        System.out.println(driver.findElement(By.id("comp-keehv7pd1")).isDisplayed());

        System.out.println(driver.findElement(By.id("input_comp-khwayxk9")).getAttribute("placeholder"));

        Driver.quitDriver();

    }
}
