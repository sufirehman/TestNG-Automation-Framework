import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class TestCases extends BaseClass {
    @FindBy(id = "user-name")
    private WebElement loginUsername;

    @FindBy(id = "password")
    private WebElement loginPassword;

    @FindBy(id = "login-button")
    private WebElement loginBtn;

    @Test
    public void ValidLogin()
    {
        PageFactory.initElements(driver, this);
        loginUsername.sendKeys("standard_user");
        loginPassword.sendKeys("secret_sauce");
        loginBtn.click();
    }
}
