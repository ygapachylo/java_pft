package my.avtomationstyde.Styde;

import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static javax.print.attribute.standard.MediaSizeName.D;

//# Указываем полный путь к geckodriver.exe на вашем ПК.
//driver = webdriver.Firefox('C:\\Files\\geckodriver.exe')
//driver.get("http://www.google.com")
public class GoogleTest {

    private WebDriver driver;

    @BeforeClass
    public static void setupClass() {
        FirefoxDriverManager.getInstance().setup();
    }

    @Before
    public void setupTest() {
        driver = new FirefoxDriver();
    }

    @After
    public void teardown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void test() {
        driver.get("https://rozetka.com.ua/");
        // Your test code here
    }

}
