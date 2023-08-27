package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderPageAboutRent {
    // url страницы с формой Для кого самокат
    //private final String urlHomePage = "https://qa-scooter.praktikum-services.ru/order";

    private final By dateField = By.xpath(".//input[contains(@placeholder, 'Когда привезти самокат')]");
    //поле Когда привезти самокат
    private final By choosingDate = By.xpath(".//div[contains(@class, 'react-datepicker__day--selected')]");
    //выбор даты когда вернуть самокат
    private final By rentField = By.xpath(".//div[@class='Dropdown-placeholder']");
    //поле с выпадающим списком со сроком аренды самоката
    private final By choosingRentalPeriod = By.xpath(".//div[text()='сутки']");
    //выбор периода аренды из списка
    private final By colorOfScooter = By.id("black");
    //выбор черного цвета
    private final By commentField = By.xpath(".//input[contains(@placeholder, 'Комментарий для курьера')]");
    //поле с комментарием
    private final By finalOrderButton = By.xpath(".//div[3]/button[text()='Заказать']");
    //финальная кнопка заказать
    private final By yesOrderButton = By.xpath(".//button[text()='Да']");
    //Всплывающее окно хотите оформить заказ? Кнопка Да
    private final By notificationOfSuccessfulOrder = By.xpath(".//div[contains(text(), 'Заказ оформлен')]");
    //сообщение об успешном оформлении заказа
    private final WebDriver driver;

    public OrderPageAboutRent(WebDriver driver) {
        this.driver = driver;
    }

    public void chooseDate(String dayWhatIWant) {
        driver.findElement(dateField).sendKeys(dayWhatIWant);
        driver.findElement(choosingDate).click();
        //выбор даты
    }

    public void chooseRentalPeriod() {
        driver.findElement(rentField).click();
        driver.findElement(choosingRentalPeriod).click();
        //выбор срока аренды
    }

    public void chooseColor() {
        driver.findElement(colorOfScooter).click();
        //выбор чек-бокса с цветом самоката
    }

    public void writeComment(String comment) {
        driver.findElement(commentField).sendKeys(comment);
        // комментарий по желанию
    }

    public void clickFinalOrderButton() {
        driver.findElement(finalOrderButton).click();
        //нажать на финальную кнопку Заказать
    }

    public void confirmOrder() {
        driver.findElement(yesOrderButton).click();
        //подтвердить намерение заказать
    }

    public void checkOrderComplete() {
        driver.findElement(notificationOfSuccessfulOrder).isDisplayed();
        //сообщение об успешном заказе
    }
//comment
}

