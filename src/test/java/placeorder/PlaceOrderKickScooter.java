package placeorder;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pageobject.MainPage;
import pageobject.OrderPageAboutRent;
import pageobject.OrderPageForWhom;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.firefox.FirefoxDriver;

import static pageobject.MainPage.orderButtonAbove;
import static pageobject.MainPage.orderButtonCenter;

@RunWith(Parameterized.class)
public class PlaceOrderKickScooter {
    private WebDriver driver;
    private static By orderButton;
    private static String name;
    private static String surname;
    private static String address;
    private static String phoneNumber;
    private static String dayWhatIWant;
    private static String comment;


    public PlaceOrderKickScooter(By orderButton, String name, String surname, String address, String phoneNumber, String dayWhatIWant, String comment) {
        PlaceOrderKickScooter.orderButton = orderButton;
        PlaceOrderKickScooter.name = name;
        PlaceOrderKickScooter.surname = surname;
        PlaceOrderKickScooter.address = address;
        PlaceOrderKickScooter.phoneNumber = phoneNumber;
        PlaceOrderKickScooter.dayWhatIWant = dayWhatIWant;
        PlaceOrderKickScooter.comment = comment;
    }

    @Parameterized.Parameters // параметризация
    public static Object[][] getCredentials() {
        return new Object[][]{
                {orderButtonAbove, "Вера", "Панасенко", "Плещеева 24", "+79265522601", "27.08.2023", "Комментарий"},
                {orderButtonCenter, "Татьяна", "Панасенко", "Корнейчука 36", "89260687364", "27.08.2023", "Комментарий 2"}
        };
    }

    @Before
    public void setUp() {
        // driver = new ChromeDriver();
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        MainPage mainPage = new MainPage(driver);
        mainPage.openSite();
        mainPage.clickCookie();
    }

    @Test
    public void mainValidDataIsSuccess() {
        MainPage mainPage = new MainPage(driver);
        mainPage.clickOrderButton(orderButton);
        OrderPageForWhom orderPageForWhom = new OrderPageForWhom(driver);

        orderPageForWhom.enterName(name);
        orderPageForWhom.enterSurname(surname);
        orderPageForWhom.enterAddress(address);
        orderPageForWhom.clickMetroStation();
        orderPageForWhom.enterPhoneNumber(phoneNumber);
        orderPageForWhom.clickNextButton();
        //раздел для кого самокат
        OrderPageAboutRent orderPageAboutRent = new OrderPageAboutRent(driver);
        orderPageAboutRent.chooseDate(dayWhatIWant);
        orderPageAboutRent.chooseRentalPeriod();
        orderPageAboutRent.chooseColor();
        orderPageAboutRent.writeComment(comment);
        orderPageAboutRent.clickFinalOrderButton();
        orderPageAboutRent.confirmOrder();
        orderPageAboutRent.checkOrderComplete();
        //раздел про время аренды самоката
    }

    @After
    public void tearDown() {
        driver.quit();
    }
//----
}

