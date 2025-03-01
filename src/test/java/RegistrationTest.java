import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.RegistrationPage;

public class RegistrationTest extends BaseTest{
    private RegistrationPage registrationPage;

    @BeforeMethod
    public void before() {
            registrationPage= new RegistrationPage(driver);
        }

    @Test
    public void testValidRegistration() {
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
        Assert.assertEquals(driver.getCurrentUrl(), "https://demo.guru99.com/test/newtours/register_sucess.php");
    }
}
