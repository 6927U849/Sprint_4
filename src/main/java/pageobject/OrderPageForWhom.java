package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderPageForWhom {

    private final By nameField = By.xpath(".//input[contains(@placeholder, 'Имя')]");
    //поле Имя
    private final By surnameField = By.xpath(".//input[contains(@placeholder, 'Фамилия')]");
    //поле Фамилия
    private final By addressField = By.xpath(".//input[contains(@placeholder, 'куда привезти заказ')]");
    //поле с адресом заказа
    private final By metroField = By.xpath(".//input[@class='select-search__input']");
    //поле с выбором станции метро
    private final By metroStation = By.xpath(".//div[@class='select-search__select']/ul/li/button/div[2]");
    //Выбор станции метро(2) из списка
    private final By telephoneField = By.xpath(".//div[5]/input[contains(@class, 'Input_Input__1iN_Z')]");
    //поля ввода номера телефона
    private final By nextButton = By.xpath(".//button[text()='Далее']");
    //кнопка Далее
    private final WebDriver driver;

    public OrderPageForWhom(WebDriver driver) {
        this.driver = driver;
    }

    public void enterName(String name) {
        driver.findElement(nameField).sendKeys(name);
        //ввести имя в поле
    }

    public void enterSurname(String surname) {
        driver.findElement(surnameField).sendKeys(surname);
        //ввести фамилию в поле
    }

    public void enterAddress(String address) {
        driver.findElement(addressField).sendKeys(address);
        //заполнить адрес доставки
    }

    public void clickMetroStation() {
        driver.findElement(metroField).click();
        driver.findElement(metroStation).click();
        //выбрать станцию метро
    }

    public void enterPhoneNumber(String number) {
        driver.findElement(telephoneField).sendKeys(number);
        //ввести номер телефона
    }

    public void clickNextButton() {
        driver.findElement(nextButton).click();
        //нажать на кнопку далее
    }
//comment
}

