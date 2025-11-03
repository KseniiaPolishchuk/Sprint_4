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


