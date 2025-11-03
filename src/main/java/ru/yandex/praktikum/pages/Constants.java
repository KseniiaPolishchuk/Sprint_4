package ru.yandex.praktikum.pages;

import org.openqa.selenium.By;

public class Constants {

    public By question;
    public By answer;
    public String textAnswer;

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

    public static final String TEXT_ANSWER_FIRST_QUESTION = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
    public static final String TEXT_ANSWER_SECOND_QUESTION = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
    public static final String TEXT_ANSWER_THIRD_QUESTION = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
    public static final String TEXT_ANSWER_FOURTH_QUESTION = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
    public static final String TEXT_ANSWER_FIFTH_QUESTION = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
    public static final String TEXT_ANSWER_SIXTH_QUESTION = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
    public static final String TEXT_ANSWER_SEVENTH_QUESTION = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
    public static final String TEXT_ANSWER_EIGHTH_QUESTION = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";
}
