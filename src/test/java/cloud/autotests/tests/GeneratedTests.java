package cloud.autotests.tests;

import cloud.autotests.helpers.DriverUtils;
import com.github.javafaker.Faker;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.href;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverConditions.url;
import static io.qameta.allure.Allure.link;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;
import static org.openqa.selenium.By.linkText;
import static org.openqa.selenium.By.partialLinkText;


public class GeneratedTests extends TestBase {

    ClassLoader cl = GeneratedTests.class.getClassLoader();

    String url="https://berizaryad.ru/";
    String expectedTitle = "+7 800 555 04 96";
    String userNumber="8(000) 000-0000";

    Faker faker = new Faker();
    String fullName=faker.name().fullName(),
            userEmail=faker.internet().emailAddress();


    @Test
    @Description("Callback")
    @DisplayName("Заполнить форму обратного звонка")
    void generatedTest() {
        step("Перейти на сайт https://berizaryad.ru/", () -> {
            open(url);
        });

       step("Заполнить форму обратной связи", () -> {
            $("#form-name").setValue(fullName);
            $("#form-phone").setValue(userNumber);
        });

        step("Отправить форму", () -> {
            $(".form").find(byText("Отправить заявку")).click();
        });

        step("Проверить отправку", () -> {
            $("#form").shouldHave(text("Спасибо"));
        });
    }

    @Test
    @Description("Phone number")
    @DisplayName("Номер телефона в хэдере страницы")
    void phoneNumber() {
        step("Открыть url 'https://berizaryad.ru/'", () ->
            open(url));

        step("Номер телефона в хэдере страницы '+7 800 555 04 96'", () -> {
            $(".contacts").shouldHave(text(expectedTitle));
        });
    }


    @Test
    @Description("Google play")
    @DisplayName("Перейти в Google play")
    void findHref() {
        step("Открыть url 'https://berizaryad.ru/'", () ->
                open(url));

        step("Перейти в Google play", () -> {
            $(byAttribute("src", "./assets/GooglePlay.png")).click();
        });

        step("Проверить, что открылся Google play", () -> {
            webdriver().shouldHave(url("https://play.google.com/store/apps/details?id=ru.berizaryad&hl=ru"));
        });
    }


    @Test
    @Description("Cities")
    @DisplayName("Проверка списка городов")
    void findCity() {
        step("Открыть url 'https://berizaryad.ru/'", () ->
                open(url));

        step("Найти города в списке", () -> {
            $(".cities-list").shouldHave(text("Москва"));
            $(".cities-list").shouldHave(text("Санкт-Петербург"));
        });
    }

    @Test
    @Description("Console check")
    @DisplayName("Проверка ошибок в логах в консоли")
    void consoleShouldNotHaveErrorsTest() {
        step("Открыть url 'https://berizaryad.ru/'", () ->
                open(url));

        step("В логах консоли не должно быть 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }

}