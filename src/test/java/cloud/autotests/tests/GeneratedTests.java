package cloud.autotests.tests;

import cloud.autotests.helpers.DriverUtils;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class GeneratedTests extends TestBase {
    @Test
    @Description("Soon to be implemented by you (or QA.GURU engineers)")
    @DisplayName("User login")
    void generatedTest() {
        step("Open ‘https://account.habr.com/login/‘", () -> {
            step("// todo: just add selenium action");
        });

        step("Set E-mail ‘irinatest27@gmail.com’", () -> {
            step("// todo: just add selenium action");
        });

        step("Set password ‘4Zp-A2R-fTy-DMS’", () -> {
            step("// todo: just add selenium action");
        });

        step("Submit form", () -> {
            step("// todo: just add selenium action");
        });

        step("Verify successful authorization as ‘@testengineer’", () -> {
            step("// todo: just add selenium action");
        });
    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Page title should have header text")
    void titleTest() {
        step("Open url 'https://account.habr.com/login/'", () ->
            open("https://account.habr.com/login/"));

        step("Page title should have text 'Вход — Habr Account'", () -> {
            String expectedTitle = "Вход — Habr Account";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Page console log should not have errors")
    void consoleShouldNotHaveErrorsTest() {
        step("Open url 'https://account.habr.com/login/'", () ->
            open("https://account.habr.com/login/"));

        step("Console logs should not contain text 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }
}