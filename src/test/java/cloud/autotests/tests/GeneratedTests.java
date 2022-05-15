package cloud.autotests.tests;

import cloud.autotests.helpers.DriverUtils;
import com.github.javafaker.Faker;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


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
    }

    @Test
    @Description("Phone number")
    @DisplayName("Page title should have header text")
    void phoneNumber() {
        step("Open url 'https://berizaryad.ru/'", () ->
            open(url));

        step("Page title should have phone number '+7 800 555 04 96'", () -> {
            $(".contacts").shouldHave(text(expectedTitle));
        });
    }


    @Test
    @Description("Google play")
    @DisplayName("Google play")
    void findHref() {
        step("Open url 'https://berizaryad.ru/'", () ->
                open(url));

        step("To Google play", () -> {
            $(".store-block").find(byLinkText("https://play.google.com/store/apps/details?id=ru.berizaryad&hl=ru"));
        });
    }


    @Test
    @Description("Cities")
    @DisplayName("Cities")
    void findCity() {
        step("Open url 'https://berizaryad.ru/'", () ->
                open(url));

        step("Find city", () -> {
            $(".cities-list").shouldHave(text("Москва"));
            $(".cities-list").shouldHave(text("Санкт-Петербург"));
        });
    }

    @Test
    @Description("Console check")
    @DisplayName("Page console log should not have errors")
    void consoleShouldNotHaveErrorsTest() {
        step("Open url 'https://berizaryad.ru/'", () ->
                open(url));

        step("Console logs should not contain text 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }

}