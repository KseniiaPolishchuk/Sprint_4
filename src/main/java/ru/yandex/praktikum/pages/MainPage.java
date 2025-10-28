package ru.yandex.praktikum.pages;

import org.hamcrest.MatcherAssert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.hamcrest.CoreMatchers.is;

public class MainPage {

    private final WebDriver driver;


    private By question1 = By.id("accordion__heading-0");
    private By question2 = By.id("accordion__heading-1");
    private By question3 = By.id("accordion__heading-2");
    private By question4 = By.id("accordion__heading-3");
    private By question5 = By.id("accordion__heading-4");
    private By question6 = By.id("accordion__heading-5");
    private By question7 = By.id("accordion__heading-6");
    private By question8 = By.id("accordion__heading-7");


    private By answer1 = By.id("accordion__panel-0");
    private By answer2 = By.id("accordion__panel-1");
    private By answer3 = By.id("accordion__panel-2");
    private By answer4 = By.id("accordion__panel-3");
    private By answer5 = By.id("accordion__panel-4");
    private By answer6 = By.id("accordion__panel-5");
    private By answer7 = By.id("accordion__panel-6");
    private By answer8 = By.id("accordion__panel-7");

    private String textAnswer1 = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
    private String textAnswer2 = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
    private String textAnswer3 = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
    private String textAnswer4 = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
    private String textAnswer5 = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
    private String textAnswer6 = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
    private String textAnswer7 = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
    private String textAnswer8 = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";


    private By acceptCookieButton = By.xpath(".//button[text()='да все привыкли']");


    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickGetTextAndEquateQuestion8() {
        driver.findElement(question8).click();
        MatcherAssert.assertThat(driver.findElement(answer8).getText(), is(textAnswer8));
    }

    public void clickGetTextAndEquateQuestion7() {
        driver.findElement(question7).click();
        MatcherAssert.assertThat(driver.findElement(answer7).getText(), is(textAnswer7));
    }

    public void clickGetTextAndEquateQuestion6() {
        driver.findElement(question6).click();
        MatcherAssert.assertThat(driver.findElement(answer6).getText(), is(textAnswer6));
    }

    public void clickGetTextAndEquateQuestion5() {
        driver.findElement(question5).click();
        MatcherAssert.assertThat(driver.findElement(answer5).getText(), is(textAnswer5));
    }

    public void clickGetTextAndEquateQuestion4() {
        driver.findElement(question4).click();
        MatcherAssert.assertThat(driver.findElement(answer4).getText(), is(textAnswer4));
    }

    public void clickGetTextAndEquateQuestion3() {
        driver.findElement(question3).click();
        MatcherAssert.assertThat(driver.findElement(answer3).getText(), is(textAnswer3));
    }

    public void clickGetTextAndEquateQuestion2() {
        driver.findElement(question2).click();
        MatcherAssert.assertThat(driver.findElement(answer2).getText(), is(textAnswer2));
    }

    public void clickGetTextAndEquateQuestion1() {
        driver.findElement(question1).click();
        MatcherAssert.assertThat(driver.findElement(answer1).getText(), is(textAnswer1));
    }

    public void scrollTheElement() {
        WebElement element = driver.findElement(By.xpath(".//div[@class='accordion']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
    }

    public void clickAcceptCookieButton() {
        driver.findElement(acceptCookieButton).click();
    }

    public  void openMainPage() {
        driver.get("https://qa-scooter.praktikum-services.ru/");
    }

}
