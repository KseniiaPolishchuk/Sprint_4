package ru.yandex.praktikum.page.object.test;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.yandex.praktikum.pages.MainPage;


@RunWith(Parameterized.class)
public class HomePageTest {


    @Rule
    public DriverFactoryHomePage  factoryHomePage = new DriverFactoryHomePage();

    private  By question;
    private  By answer;
    private  String textAnswer;
    private static final By FIRSTQUESTIONDOWNTHEPAGE = By.id("accordion__heading-0");
    private static final By SECONDQUESTIONDOWNTHEPAGE = By.id("accordion__heading-1");
    private static final By THIRDQUESTIONDOWNTHEPAGE = By.id("accordion__heading-2");
    private static final By FOURTHQUESTIONDOWNTHEPAGE = By.id("accordion__heading-3");
    private static final By FIFTHQUESTIONDOWNTHEPAGE = By.id("accordion__heading-4");
    private static final By SIXTHQUESTIONDOWNTHEPAGE = By.id("accordion__heading-5");
    private static final By SEVENTHQUESTIONDOWNTHEPAGE = By.id("accordion__heading-6");
    private static final By EIGHTQUESTIONDOWNTHEPAGE = By.id("accordion__heading-7");

    private static final By ANSWERTOTHEFIRSTQUESTION = By.id("accordion__panel-0");
    private static final By ANSWERTOTHESECONDQUESTION = By.id("accordion__panel-1");
    private static final By ANSWERTOTHETHIRDQUESTION = By.id("accordion__panel-2");
    private static final By ANSWERTOTHEFOURTHQUESTION = By.id("accordion__panel-3");
    private static final By ANSWERTOTHEFIFTHQUESTION = By.id("accordion__panel-4");
    private static final By ANSWERTOTHESIXTHQUESTION = By.id("accordion__panel-5");
    private static final By ANSWERTOTHESEVENTHQUESTION = By.id("accordion__panel-6");
    private static final By ANSWERTOTHEEIGHTHQUESTION = By.id("accordion__panel-7");

    private static final String TEXTANSWERFIRSTQUESTION = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
    private static final String TEXTANSWERSECONDQUESTION = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
    private static final String TEXTANSWERTHIRDQUESTION = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
    private static final String TEXTANSWERFOURTQUESTION = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
    private static final String TEXTANSWERFIFTHQUESTION = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
    private static final String TEXTANSWERSIXTHQUESTION = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
    private static final String TEXTANSWERSEVENTHQUESTION = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
    private static final String TEXTANSWEREIGHTHQUESTION = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";

    public HomePageTest(By question, By answer, String textAnswer) {
        this.question = question ;
        this.answer = answer;
        this.textAnswer = textAnswer;

    }




        @Parameterized.Parameters
        public static Object[][] getParameters() {
            return new Object[][]{
                    {FIRSTQUESTIONDOWNTHEPAGE, ANSWERTOTHEFIRSTQUESTION, TEXTANSWERFIRSTQUESTION},
                    {SECONDQUESTIONDOWNTHEPAGE, ANSWERTOTHESECONDQUESTION, TEXTANSWERSECONDQUESTION},
                    {THIRDQUESTIONDOWNTHEPAGE, ANSWERTOTHETHIRDQUESTION, TEXTANSWERTHIRDQUESTION},
                    {FOURTHQUESTIONDOWNTHEPAGE, ANSWERTOTHEFOURTHQUESTION, TEXTANSWERFOURTQUESTION},
                    {FIFTHQUESTIONDOWNTHEPAGE, ANSWERTOTHEFIFTHQUESTION, TEXTANSWERFIFTHQUESTION},
                    {SIXTHQUESTIONDOWNTHEPAGE, ANSWERTOTHESIXTHQUESTION, TEXTANSWERSIXTHQUESTION},
                    {SEVENTHQUESTIONDOWNTHEPAGE, ANSWERTOTHESEVENTHQUESTION, TEXTANSWERSEVENTHQUESTION},
                    {EIGHTQUESTIONDOWNTHEPAGE, ANSWERTOTHEEIGHTHQUESTION, TEXTANSWEREIGHTHQUESTION},
            };
        }
    @Test
    public void testPressArrowTheTextOpens() {

        WebDriver driver = factoryHomePage.getDriver();
        MainPage mainPage = new MainPage(driver);

        //Открываем главную страницу
        mainPage.openMainPage();
        //Принимаем куки
        mainPage.clickAcceptCookieButton();
        //Делаем скролл до нужного элемента
        mainPage.scrollTheElement();
        //Нажимаем на вопрос, получаем текст ответа и сравниваем его с ожидаемым
        mainPage.clickQuestion(question);
        mainPage.getTextAnswerComparingWithTheExpected(answer, textAnswer);


    }


}
