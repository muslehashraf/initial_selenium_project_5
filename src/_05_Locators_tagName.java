import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Driver;
import utils.Waiter;

public class _05_Locators_tagName {
    public static void main(String[] args) {


        WebDriver driver = Driver.getDriver();

        try {


            driver.get("https://techglobal-training.netlify.app/");
            Waiter.pause(2);

            driver.findElement(By.id("dropdown-button")).click();
            Waiter.pause(2);


            driver.findElement(By.id("frontend-option")).click();
            Waiter.pause(2);

            if (driver.findElement(By.id("card-1")).getTagName().equals("Locators")) System.out.println("Test validation PASSED");
            else System.out.println("Test validation Failed");

        }catch (Exception e){
            System.out.println("Test validation FAILED past due: " + e.getMessage());
        }finally {
            Driver.quitDriver();
        }
    }
}
