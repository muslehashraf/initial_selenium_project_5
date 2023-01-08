import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_Locators_id {
    public static void main(String[] args) throws InterruptedException{


        // 1. set up - before actions
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ashraf Musleh\\IdeaProjects\\initial_selenium_project_5\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        // 2. Validation
        driver.get("https://techglobal-training.netlify.app/");

        Thread.sleep(2000);

        //Locate the logo and validate if it is displayed
        WebElement logo = driver.findElement(By.id("logo"));

        if(logo.isDisplayed()) System.out.println("logo validation PASSED");
        else System.out.println("logo validation FAILED");

        System.out.println(logo.isEnabled()); // True
        System.out.println(logo.isSelected()); // True

        // 3. Teardown - after actions
        driver.quit();






    }
}
