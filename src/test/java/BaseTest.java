import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import util.DriverManager;

public class BaseTest {
    public WebDriver driver;

    @BeforeMethod
    public void setUp() {
        DriverManager.createDriver("headless-chrome");
        driver = DriverManager.getDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/newtours/register.php");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
