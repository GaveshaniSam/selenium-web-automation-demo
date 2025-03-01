import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.FlightsPage;
import pages.LoginPage;
import pages.RegistrationPage;

public class FlightsTest extends BaseTest {
    private FlightsPage flightsPage;
    private LoginPage loginPage;
    private RegistrationPage registrationPage;

    @BeforeMethod
    public void before() {
        flightsPage = new FlightsPage(driver);
        loginPage = new LoginPage(driver);
        registrationPage = new RegistrationPage(driver);

        registrationPage.inputFirstName("Gaveshani");
        registrationPage.inputLastName("Samarawickrama");
        registrationPage.inputPhoneNumber("0711568393");
        registrationPage.inputEmail("gsam@gmail.com");
        registrationPage.inputAddress("124/6");
        registrationPage.inputCity("Colombo");
        registrationPage.inputState("Western province");
        registrationPage.inputPostalCode("32000");
        registrationPage.selectCountry("SRI LANKA");
        registrationPage.inputUserName("GUN");
        registrationPage.inputPassword("123456");
        registrationPage.inputConfirmPassword("123456");
        registrationPage.clickSubmit();

        loginPage.clickOnSignOff();
        loginPage.clickOnSignOn();
        loginPage.inputUsername("GUNS");
        loginPage.inputPassword("123456");
        loginPage.clickLogin();
    }

    @Test
    public void testValidFlightsBooking() {
        flightsPage.clickOnFlights();
        flightsPage.selectTypeOfTrip("One Way");
        flightsPage.selectPassengersCountDropdown("2");
        flightsPage.selectDepartingCityDropdown("London");
        flightsPage.selectMonthFromDropdown("May");
        flightsPage.selectDateFromDropdown("20");
        flightsPage.arrivingIn("Paris");
        flightsPage.selectReturningMonth("August");
        flightsPage.selectReturningDate("20");
        flightsPage.selectServiceClass("Business class");
        flightsPage.selectAirline("Pangea Airlines");
        flightsPage.clickContinue();
        flightsPage.clickOnBackToHome();
    }
}
