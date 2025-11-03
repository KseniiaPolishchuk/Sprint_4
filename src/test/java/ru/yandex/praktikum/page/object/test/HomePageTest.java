package ru.yandex.praktikum.page.object.test;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.yandex.praktikum.pages.Constants;
import ru.yandex.praktikum.pages.MainPage;



@RunWith(Parameterized.class)
public class HomePageTest extends Constants{

    @Rule
    public DriverFactoryHomePage  factoryHomePage = new DriverFactoryHomePage();


    public HomePageTest(By question, By answer, String textAnswer) {
        this.question = question ;
        this.answer = answer;
        this.textAnswer = textAnswer;

    }

        @Parameterized.Parameters
        public static Object[][] getParameters() {
            return new Object[][]{
                    {FIRST_QUESTION_DOWN_THE_PAGE, ANSWER_TO_THE_FIRST_QUESTION, TEXT_ANSWER_FIRST_QUESTION},
                    {SECOND_QUESTION_DOWN_THE_PAGE, ANSWER_TO_THE_SECOND_QUESTION, TEXT_ANSWER_SECOND_QUESTION},
                    {THIRD_QUESTION_DOWN_THE_PAGE, ANSWER_TO_THE_THIRD_QUESTION, TEXT_ANSWER_THIRD_QUESTION},
                    {FOURTH_QUESTION_DOWN_THE_PAGE, ANSWER_TO_THE_FOURTH_QUESTION, TEXT_ANSWER_FOURTH_QUESTION},
                    {FIFTH_QUESTION_DOWN_THE_PAGE, ANSWER_TO_THE_FIFTH_QUESTION, TEXT_ANSWER_FIFTH_QUESTION},
                    {SIXTH_QUESTION_DOWN_THE_PAGE, ANSWER_TO_THE_SIXTH_QUESTION, TEXT_ANSWER_SIXTH_QUESTION},
                    {SEVENTH_QUESTION_DOWN_THE_PAGE, ANSWER_TO_THE_SEVENTH_QUESTION, TEXT_ANSWER_SEVENTH_QUESTION},
                    {EIGHT_QUESTION_DOWN_THE_PAGE, ANSWER_TO_THE_EIGHTH_QUESTION, TEXT_ANSWER_EIGHTH_QUESTION},
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
