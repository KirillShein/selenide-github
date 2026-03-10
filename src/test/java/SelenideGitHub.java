import com.codeborne.selenide.Configuration;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;


public class SelenideGitHub {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.baseUrl = "https://github.com/";
        Configuration.pageLoadStrategy = "eager";
    }


    @Test
    void testSelenideGitHub() {
        //открыть сайт github
        open("");
        // кликнуть по полю поиска
        $(".search-input").click();
        //ввести в поле selenide и нажать на enter
        $("#query-builder-test").setValue("Selenide").pressEnter();
        //Найти selenide/selenide и кликнуть по ней
        $$("a").findBy(exactText("selenide/selenide")).click();
        $("#wiki-tab").click();
        $$("a").findBy(exactText("Soft assertions")).click();
        $$("h4").findBy(text("3. Using JUnit5 extend test class:")).shouldBe(visible);



    }
}
