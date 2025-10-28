package PageObject;

import org.junit.Rule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import ru.yandex.praktikum.pages.MainPage;



public class HomePageTest {


    @Rule
    public DriverFactoryHomePage  factoryHomePage = new DriverFactoryHomePage();


    @Test
    public void testPressArrowTheTextOpens() {

        WebDriver driver = factoryHomePage.getDriver();
        MainPage mainPage = new MainPage(driver);

        //Открываем главную страницу

        mainPage.openMainPage();


        mainPage.clickAcceptCookieButton();

        //Делаем скролл до нужного элемента
        mainPage.scrollTheElement();

        //Нажимаем на выпадающий список, получаем текст ответа и сравниваем его с ожидаемым

        mainPage.clickGetTextAndEquateQuestion1();

        mainPage.clickGetTextAndEquateQuestion2();

        mainPage.clickGetTextAndEquateQuestion3();

        mainPage.clickGetTextAndEquateQuestion4();

        mainPage.clickGetTextAndEquateQuestion5();

        mainPage.clickGetTextAndEquateQuestion6();

        mainPage.clickGetTextAndEquateQuestion7();

        mainPage.clickGetTextAndEquateQuestion8();


    }


}

