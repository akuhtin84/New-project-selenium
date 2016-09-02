package Anton.pages;

        import com.thoughtworks.selenium.*;
        import org.junit.After;
        import org.junit.Before;
        import org.junit.Test;
        import static org.junit.Assert.*;
        import java.util.regex.Pattern;

public class Test2 {
    private Selenium selenium;

    @Before
    public void setUp() throws Exception {
        selenium = new DefaultSelenium("localhost", 4444, "firefox", "http://www.ribalkaforum.com/");
        selenium.start();
    }

    @Test
    public void testUntitled() throws Exception {
        selenium.open("/");
        selenium.click("link=Донная и другие виды ловли");
        selenium.waitForPageToLoad("30000");
        selenium.click("link=п.Старый Салтов");
        selenium.waitForPageToLoad("30000");
        selenium.click("link=exact:http://www.ribalkaforum.com/threads/p-staryj-saltov-arxiv.184/");
        selenium.waitForPageToLoad("30000");
    }

    @After
    public void tearDown() throws Exception {
        selenium.stop();
    }
}

