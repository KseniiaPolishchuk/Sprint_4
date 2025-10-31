package ru.yandex.praktikum.page.object.test;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import ru.yandex.praktikum.pages.OrderScooterPage;


@RunWith(Parameterized.class)
public class OrderScooter {

    @Rule
    public DriverFactoryHomePage  factoryHomePage = new DriverFactoryHomePage();

    private  String name;
    private  String surname;
    private  String address;
    private  String stateMetro;
    private  String telephone;
    private  String date;
    private  String durationRent;
    private  String colour;
    private  String comment;

    public OrderScooter(String name, String surname, String address,String stateMetro, String telephone, String date, String durationRent, String colour, String comment) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.stateMetro = stateMetro;
        this.telephone = telephone;
        this.date = date;
        this.durationRent = durationRent;
        this.colour = colour;
        this.comment = comment;
    }

    @Parameterized.Parameters
    public static Object[][] getOrder() {
        return new Object[][] {
                { "Иван", "Иванов", "Пушкина,16", "Бульвар Рокоссовского", "88001232111", "25.05.2025", "сутки", "чёрный жемчуг", "нет комментариев" },
                { "Максим", "Михайлов", "Ставропольская, 43", "Преображенская площадь", "89005714241", "14.10.2025", "трое суток", "серая безысходность", "нет комментариев" },
        };
    }


    @Test
    public void orderScooter() {

        WebDriver driver = factoryHomePage.getDriver();
        OrderScooterPage orderScooterPage = new OrderScooterPage(driver);


        //Открываем главную страницу

        orderScooterPage.openMainPage();

        //Нажимаем на верхнюю кнопку Заказать

        orderScooterPage.clickUpOrderButton();

        //Заполняем форму Для кого самокат

        orderScooterPage.completeFieldName(name);// заполнили поле Имя
        orderScooterPage.completeFieldSurname(surname);//заполнили поле фамилия
        orderScooterPage.completeFieldAddress(address);//заполнили поле адрес
        orderScooterPage.clickFieldStateMetro();//нажали на поле метро
        orderScooterPage.completeStateMetro(stateMetro);//заполнили поле метро
        orderScooterPage.completeFieldTelephone(telephone);//заполнили поле телефон

        orderScooterPage.clickButtonNext();//нажали на кнопку далее


        orderScooterPage.completeFieldDate(date);//заполнили поле дата
        orderScooterPage.clickFieldDurationRent();//нажали на поле срока аренды
        orderScooterPage.completeFieldDurationRent(durationRent);//заполнили поле
        orderScooterPage.completeColour(colour);//заполнили поле цвета
        orderScooterPage.leftComment(comment);//оставили комментарий

        orderScooterPage.clickCreateOrderButton();//нажали на кнопку создать заказ
        orderScooterPage.clickButtonYes();//нажали на кнопку Да
        orderScooterPage.checkedPopUpHeaderAfterCreateOrder();// проверили, что заказ оформлен

        //Открываем главную страницу
        orderScooterPage.openMainPage();
        //Делаем скролл до нижней кнопки Заказать
        orderScooterPage.scrollDownButtonCreate();

        //Нажимаем на нижнюю кнопку Заказать
        orderScooterPage.clickDownButtonCreate();


        orderScooterPage.completeFieldName(name);// заполнили поле Имя
        orderScooterPage.completeFieldSurname(surname);//заполнили поле фамилия
        orderScooterPage.completeFieldAddress(address);//заполнили поле адрес
        orderScooterPage.clickFieldStateMetro();//нажали на поле метро
        orderScooterPage.completeStateMetro(stateMetro);//заполнили поле метро
        orderScooterPage.completeFieldTelephone(telephone);
        orderScooterPage.clickButtonNext();//нажали на кнопку далее


        orderScooterPage.completeFieldDate(date);//заполнили поле дата
        orderScooterPage.clickFieldDurationRent();//нажали на поле срока аренды
        orderScooterPage.completeFieldDurationRent(durationRent);//заполнили поле
        orderScooterPage.completeColour(colour);//заполнили поле цвета
        orderScooterPage.leftComment(comment);//оставили комментарий

        orderScooterPage.clickCreateOrderButton();//нажали на кнопку создать заказ
        orderScooterPage.clickButtonYes();//нажали на кнопку Да
        orderScooterPage.checkedPopUpHeaderAfterCreateOrder();// проверили, что заказ оформлен

    }


}
