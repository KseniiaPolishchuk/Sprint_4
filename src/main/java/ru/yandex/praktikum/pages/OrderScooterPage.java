package ru.yandex.praktikum.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OrderScooterPage {


    private WebDriver driver;
    private  By upOrderButton = By.xpath(".//button[text()='Заказать'][1]");
    private  By fieldName = By.xpath(".//input[@placeholder='* Имя']");
    private  By fieldSurname = By.xpath(".//input[@placeholder='* Фамилия']");
    private  By fieldAddress = By.xpath(".//input[@placeholder='* Адрес: куда привезти заказ']");
    private  By fieldStateMetro = By.className("select-search__input");
    private  By fieldTelephone = By.xpath(".//input[@placeholder='* Телефон: на него позвонит курьер']");
    private  By fieldDate = By.xpath(".//input[@placeholder='* Когда привезти самокат']");
    private  By fieldDurationRent = By.xpath(".//span[@class='Dropdown-arrow']");
    private  By fieldComment = By.xpath(".//input[@placeholder='Комментарий для курьера']");
    private  By createOrderButton = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    private  By buttonNext = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM']");
    private  By buttonYes = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM' and text()='Да']");
    private  By popUpHeaderAfterCreateOrder = By.xpath(".//div[text()='Заказ оформлен']");
    private  By downOrderButton = By.xpath(".//div[contains(@class, 'Home_FinishButton')]/button");



    public OrderScooterPage(WebDriver driver) {
        this.driver = driver;
    }


    public void clickDownButtonCreate() {
        driver.findElement(downOrderButton).click();
    }

    public void scrollDownButtonCreate() {
        WebElement element = driver.findElement(downOrderButton);//делаем скролл до нижней кнопки Заказать
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
    }

    public void checkedPopUpHeaderAfterCreateOrder() {
        Assert.assertTrue(driver.findElement(popUpHeaderAfterCreateOrder). isDisplayed());
    }

    public void clickButtonYes() {
        driver.findElement(buttonYes).click();
    }

    public void clickCreateOrderButton() {
        driver.findElement(createOrderButton).click();
    }

    public void leftComment(String comment) {
        driver.findElement(fieldComment).sendKeys(comment);
    }

    public void completeColour(String colour) {
        driver.findElement(By.xpath(".//label[text()='" + colour + "']")).click();
    }

    public void completeFieldDurationRent(String durationRent) {
        driver.findElement(By.xpath(".//div[text()='" + durationRent + "']")).click();
    }

    public void clickFieldDurationRent() {
        driver.findElement(fieldDurationRent).click();
    }

    public void completeFieldDate(String date) {
        driver.findElement(fieldDate).sendKeys(date);
    }

    public void clickButtonNext() {
        driver.findElement(buttonNext).click();
    }

    public void completeFieldTelephone(String telephone) {
        driver.findElement(fieldTelephone).sendKeys(telephone);
    }

    public void completeStateMetro(String stateMetro) {
        driver.findElement(By.xpath(".//div[text()='" + stateMetro + "']")).click();
    }

    public void clickFieldStateMetro() {
        driver.findElement(fieldStateMetro).click();
    }

    public void completeFieldAddress(String address) {
        driver.findElement(fieldAddress).sendKeys(address);
    }

    public void completeFieldSurname(String surname) {
        driver.findElement(fieldSurname).sendKeys(surname);
    }

    public void completeFieldName(String name) {
        driver.findElement(fieldName).sendKeys(name);
    }

    public void clickUpOrderButton() {
        driver.findElement(upOrderButton).click();
    }

    public void openMainPage() {
        driver.get("https://qa-scooter.praktikum-services.ru/");
    }


}

