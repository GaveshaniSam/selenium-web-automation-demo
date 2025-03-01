package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class FlightsPage {
    private final WebDriver driver;

    public FlightsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnFlights() {
        driver.findElement(By.xpath("//a[@href='reservation.php' and contains(text(),'Flights')]")).click();
    }

    public void selectTypeOfTrip(String type) {
        driver.findElement(By.xpath("//input[@type='radio' and @name='tripType' and @value='oneway']")).click();
    }

    public void selectPassengersCountDropdown(String passengers) {
        Select passengerSelect = new Select(driver.findElement(By.name("passCount")));
        passengerSelect.selectByVisibleText(passengers);
    }

    public void selectDepartingCityDropdown(String departingFrom) {
        Select departSelect = new Select(driver.findElement(By.name("fromPort")));
        departSelect.selectByVisibleText(departingFrom);
    }

    public void selectMonthFromDropdown(String month) {
        Select monthSelect = new Select(driver.findElement(By.name("fromMonth")));
        monthSelect.selectByVisibleText(month);
    }

    public void selectDateFromDropdown(String date) {
        Select dateSelect = new Select(driver.findElement(By.name("fromDay")));
        dateSelect.selectByVisibleText(date);
    }

    public void arrivingIn(String arrivingIn) {
        Select arrivingSelect = new Select(driver.findElement(By.name("toPort")));
        arrivingSelect.selectByVisibleText(arrivingIn);
    }

    public void selectReturningMonth(String monthR) {
        Select returnMonthSelect = new Select(driver.findElement(By.name("toMonth")));
        returnMonthSelect.selectByVisibleText(monthR);
    }

    public void selectReturningDate(String dateR) {
        Select returnDateSelect = new Select(driver.findElement(By.name("toDay")));
        returnDateSelect.selectByVisibleText(dateR);
    }

    public void selectServiceClass(String serviceClass) {
        driver.findElement(By.xpath("//input[@name='servClass' and @type='radio' and @value='Business']")).click();
    }

    public void selectAirline(String airline) {
        Select airlineSelect = new Select(driver.findElement(By.name("airline")));
        airlineSelect.selectByVisibleText(airline);
    }

    public void clickContinue() {
        driver.findElement(By.xpath("//input[@type='image']")).click();
    }

    public void clickOnBackToHome() {
        driver.findElement(By.xpath("//img[@src='images/home.gif']")).click();
    }
}
