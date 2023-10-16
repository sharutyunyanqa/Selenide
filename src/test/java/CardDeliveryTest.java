import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.time.Duration;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Configuration.timeout;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.remote.tracing.EventAttribute.setValue;

public class CardDeliveryTest {

    @Test
    public void shouldTestPositive() {
        open("http://localhost:9999/");
        SelenideElement form=$(By.className("form_theme_alfa-on-white"));
        $("[data-test-id=city] input").setValue("Санкт-Петербург");
        $("[data-test-id=date] input").setValue("22.10.2023");
        $("[data-test-id=name]input").setValue("Федор Иванов");
        $("[data-test-id=phone]input").setValue("+71236549874");
        $("[data-test-id=agreement]input").click();
        $("button").click();
        //$("[data-test-id=notification]").shouldHave(exactText("Встреча успешно забронирована на "));
        $(withText("Встреча успешно забронирована на ")).shouldBe(visible, Duration.ofSeconds(10));git g

    }
}
