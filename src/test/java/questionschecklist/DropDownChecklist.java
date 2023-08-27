package questionschecklist;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import pageobject.MainPage;

import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static pageobject.MainPage.*;

public class DropDownChecklist {

    private WebDriver driver;

    @Test
    public void testQuestionOne() {
        driver = new ChromeDriver();
        MainPage mainPage = new MainPage(driver);
        // driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        mainPage.openSite();
        mainPage.scrollToElement();
        mainPage.clickCookie();
        mainPage.clickButtonOneQuestion(questionOne);
        assertEquals(MainPage.questionOneText, mainPage.getTextQuestionOne());  // сравнить текст
    }
    @Test
    public void testQuestionFour() {
        driver = new ChromeDriver();
        MainPage mainPage = new MainPage(driver);
        driver.manage().window().maximize();
        mainPage.openSite();
        mainPage.scrollToElement();
        mainPage.clickCookie();
        mainPage.clickButtonFourQuestion(questionFour);
        assertEquals(MainPage.questionFourText, mainPage.getTextQuestionFour());
    }
    @Test
    public void testQuestionFive() {
        driver = new ChromeDriver();
        MainPage mainPage = new MainPage(driver);
        driver.manage().window().maximize();
        mainPage.openSite();
        mainPage.scrollToElement();
        mainPage.clickCookie();
        mainPage.clickButtonFiveQuestion(questionFive);
        assertEquals(MainPage.questionFiveText, mainPage.getTextQuestionFive());
    }
    @Test
    public void testQuestionSix() {
        driver = new ChromeDriver();
        MainPage mainPage = new MainPage(driver);
        driver.manage().window().maximize();
        mainPage.openSite();
        mainPage.scrollToElement();
        mainPage.clickCookie();
        mainPage.clickButtonSixQuestion(questionSix);
        assertEquals(MainPage.questionSixText, mainPage.getTextQuestionSix());
    }
    @Test
    public void testQuestionSeven() {
        driver = new ChromeDriver();
        MainPage mainPage = new MainPage(driver);
        driver.manage().window().maximize();
        mainPage.openSite();
        mainPage.scrollToElement();
        mainPage.clickCookie();
        mainPage.clickButtonSevenQuestion(questionSeven);
        assertEquals(MainPage.questionSevenText, mainPage.getTextQuestionSeven());
    }
    @Test
    public void testQuestionEight() {
        driver = new ChromeDriver();
        MainPage mainPage = new MainPage(driver);
        driver.manage().window().maximize();
        mainPage.openSite();
        mainPage.scrollToElement();
        mainPage.clickCookie();
        mainPage.clickButtonEightQuestion(questionEight);
        assertEquals(MainPage.questionEightText, mainPage.getTextQuestionEight());
    }
    @After
    public void tearDown() {
        driver.quit();
    }
    //comment
}
