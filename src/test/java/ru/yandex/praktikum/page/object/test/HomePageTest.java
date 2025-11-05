package ru.yandex.praktikum.page.object.test;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.yandex.praktikum.pages.MainPage;

import static ru.yandex.praktikum.pages.MainPage.*;


@RunWith(Parameterized.class)
public class HomePageTest{

    @Rule
    public DriverFactoryHomePage  factoryHomePage = new DriverFactoryHomePage();

    public int questionNumber;
    public By question;
    public By answer;
    public String textAnswer;

    public HomePageTest(int questionNumber, By question, By answer, String textAnswer) {
        this.questionNumber = questionNumber;
        this.question = question;
        this.answer = answer;
        this.textAnswer = textAnswer;

    }

        @Parameterized.Parameters
        public static Object[][] getParameters() {
            return new Object[][]{
                    { 0, FIRST_QUESTION_DOWN_THE_PAGE, ANSWER_TO_THE_FIRST_QUESTION, "Сутки — 400 рублей. Оплата курьеру — наличными или картой."},
                    { 1, SECOND_QUESTION_DOWN_THE_PAGE, ANSWER_TO_THE_SECOND_QUESTION, "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим."},
                    { 2, THIRD_QUESTION_DOWN_THE_PAGE, ANSWER_TO_THE_THIRD_QUESTION, "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30."},
                    { 3, FOURTH_QUESTION_DOWN_THE_PAGE, ANSWER_TO_THE_FOURTH_QUESTION, "Только начиная с завтрашнего дня. Но скоро станем расторопнее."},
                    { 4, FIFTH_QUESTION_DOWN_THE_PAGE, ANSWER_TO_THE_FIFTH_QUESTION, "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010."},
                    { 5, SIXTH_QUESTION_DOWN_THE_PAGE, ANSWER_TO_THE_SIXTH_QUESTION, "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится."},
                    { 6, SEVENTH_QUESTION_DOWN_THE_PAGE, ANSWER_TO_THE_SEVENTH_QUESTION, "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои."},
                    { 7, EIGHT_QUESTION_DOWN_THE_PAGE, ANSWER_TO_THE_EIGHTH_QUESTION, "Да, обязательно. Всем самокатов! И Москве, и Московской области."},
            };
        }
    @Test
    public void testPressArrowTheTextOpens() {

        WebDriver driver = factoryHomePage.getDriver();
        MainPage mainPage = new MainPage(driver);

        mainPage.openMainPage();
        mainPage.clickAcceptCookieButton();
        mainPage.scrollTheElement();
        mainPage.clickQuestion(question);
        mainPage.getTextAnswerComparingWithTheExpected(answer, textAnswer);


    }
}
