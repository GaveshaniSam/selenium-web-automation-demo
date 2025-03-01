package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private final WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnSignOff() {
        driver.findElement(By.xpath("//a[@href='index.php' and contains(text(),'SIGN-OFF')]")).click();
    }

    public void clickOnSignOn() {
        driver.findElement(By.xpath("//a[@href='index.php']")).click();
    }

    public void inputUsername(String username) {
        driver.findElement(By.xpath("//input[@name='userName']")).sendKeys(username);
    }

    public void inputPassword(String password) {
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
    }

    public void clickLogin() {
        driver.findElement(By.xpath("//input[@name='submit']")).click();
    }
}