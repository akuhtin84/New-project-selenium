package Anton.pages;

/**
 * Created by Kuhtin on 31.08.2016.
 */

import com.thoughtworks.selenium.*;
        import org.junit.After;
        import org.junit.Before;
        import org.junit.Test;
        import static org.junit.Assert.*;
        import java.util.regex.Pattern;

public class Test1 {
    private Selenium selenium;

    @Before
    public void setUp() throws Exception {
        selenium = new DefaultSelenium("localhost", 4444, "firefox", "https://www.yandex.ua/");
        selenium.start();
    }

    @Test
    public void testUntitled() throws Exception {
        selenium.open("/");
        selenium.click("xpath=(//a[contains(text(),'Новини')])[2]");
        selenium.waitForPageToLoad("30000");
        selenium.click("link=МЗС направило ноту протесту Росії через напад на українське посольство");
        Thread.sleep(5000);
        selenium.click("link=Коментар МЗС України у зв’язку з нападом на Посольство України в Російській Федерації - Новини - МЗС України");
    }

    @After
    public void tearDown() throws Exception {
        selenium.stop();
    }
}

