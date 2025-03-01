import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.RegistrationPage;

public class LoginTest extends BaseTest {
    private LoginPage loginPage;
    private RegistrationPage registrationPage;

    @BeforeMethod
    public void before() {
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

    }

    @Test
    public void testValidLogin() {
        loginPage.clickOnSignOff();
        loginPage.clickOnSignOn();
        loginPage.inputUsername("GUNS");
        loginPage.inputPassword("123456");
        loginPage.clickLogin();
        Assert.assertEquals(driver.getCurrentUrl(), "https://demo.guru99.com/test/newtours/login_sucess.php");
    }
}
