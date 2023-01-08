import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/Ashraf Musleh/IdeaProjects/initial_selenium_project_5/chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver(); // Instantiating

        driver.get("https://www.google.com/");

        driver.manage().window().maximize();

        String title = driver.getTitle();

        System.out.println(title);

        driver.quit();
    }
}
