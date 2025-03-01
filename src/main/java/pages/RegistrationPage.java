package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {
    private final WebDriver driver;

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
    }

    public void inputFirstName(String firstname) {
        driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(firstname);
    }

    public void inputLastName(String lastname) {
        driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys(lastname);
    }

    public void inputPhoneNumber(String phone) {
        driver.findElement(By.xpath("//input[@name='phone']")).sendKeys(phone);
    }

    public void inputEmail(String email) {
        driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(email);
    }

    public void inputAddress(String address) {
        driver.findElement(By.xpath("//input[@name='address1']")).sendKeys(address);
    }

    public void inputCity(String city) {
        driver.findElement(By.xpath("//input[@name='city']")).sendKeys(city);
    }

    public void inputState(String state) {
        driver.findElement(By.xpath("//input[@name='state']")).sendKeys(state);
    }

    public void inputPostalCode(String postalCode) {
        driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys(postalCode);
    }

    public void selectCountry(String countryName) {
        driver.findElement(By.xpath("//select[@name='country']")).getAccessibleName();
    }

    public void inputUserName(String userName) {
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys(userName);
    }

    public void inputPassword(String password) {
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
    }

    public void inputConfirmPassword(String confirmPassword) {
        driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys(confirmPassword);
    }

    public void clickSubmit() {
        driver.findElement(By.xpath("//input[@name='submit']")).click();
    }
}

