package ru.yandex.praktikum.pages;

import org.hamcrest.MatcherAssert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.hamcrest.CoreMatchers.is;

public class MainPage {

    private final WebDriver driver;

    private By acceptCookieButton = By.xpath(".//button[text()='да все привыкли']");
    private By scrollTheElement = By.xpath(".//div[@class='accordion']");
    public static final By FIRST_QUESTION_DOWN_THE_PAGE = By.id("accordion__heading-0");
    public static final By SECOND_QUESTION_DOWN_THE_PAGE = By.id("accordion__heading-1");
    public static final By THIRD_QUESTION_DOWN_THE_PAGE = By.id("accordion__heading-2");
    public static final By FOURTH_QUESTION_DOWN_THE_PAGE = By.id("accordion__heading-3");
    public static final By FIFTH_QUESTION_DOWN_THE_PAGE = By.id("accordion__heading-4");
    public static final By SIXTH_QUESTION_DOWN_THE_PAGE = By.id("accordion__heading-5");
    public static final By SEVENTH_QUESTION_DOWN_THE_PAGE = By.id("accordion__heading-6");
    public static final By EIGHT_QUESTION_DOWN_THE_PAGE = By.id("accordion__heading-7");

    public static final By ANSWER_TO_THE_FIRST_QUESTION = By.id("accordion__panel-0");
    public static final By ANSWER_TO_THE_SECOND_QUESTION = By.id("accordion__panel-1");
    public static final By ANSWER_TO_THE_THIRD_QUESTION = By.id("accordion__panel-2");
    public static final By ANSWER_TO_THE_FOURTH_QUESTION = By.id("accordion__panel-3");
    public static final By ANSWER_TO_THE_FIFTH_QUESTION = By.id("accordion__panel-4");
    public static final By ANSWER_TO_THE_SIXTH_QUESTION = By.id("accordion__panel-5");
    public static final By ANSWER_TO_THE_SEVENTH_QUESTION = By.id("accordion__panel-6");
    public static final By ANSWER_TO_THE_EIGHTH_QUESTION = By.id("accordion__panel-7");

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void scrollTheElement() {
        WebElement element = driver.findElement(scrollTheElement);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
    }

    public void clickAcceptCookieButton() {
        driver.findElement(acceptCookieButton).click();
    }

    public  void openMainPage() {
        driver.get("https://qa-scooter.praktikum-services.ru/");
    }

    public void clickQuestion(By question) {

        driver.findElement(question).click();
    }
    public void getTextAnswerComparingWithTheExpected(By answer, String textAnswer) {
        MatcherAssert.assertThat(driver.findElement(answer).getText(), is(textAnswer));
    }

}


