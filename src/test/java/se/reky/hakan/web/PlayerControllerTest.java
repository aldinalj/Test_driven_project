package se.reky.hakan.web;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


@Disabled
class PlayerControllerTest {

    WebDriver  webDriver;

    @BeforeAll
    public static void init(){
        WebDriverManager.firefoxdriver().setup();
    }

    @BeforeEach
    public void setUp() {
        webDriver = new FirefoxDriver();
    }

    @AfterEach
    public void tearDown() {
        if (webDriver != null) {
            webDriver.quit();
        }
    }
    @Test
    public void testAmountOfPlayers() {
        webDriver.get("http://localhost:8080/players");
        List<WebElement> players = webDriver.findElements(By.tagName("li"));
        assertEquals(2, players.size());
    }

    @Test
    public void checkFirstPlayer() {
        webDriver.get("http://localhost:8080/players");
        WebElement player = webDriver.findElement(By.tagName("li"));
        assertTrue(player.isDisplayed());
    }

    @Test
    public void testTitleOfSite() {
        webDriver.get("http://localhost:8080/players");
        assertEquals("Players List", webDriver.getTitle());
    }

    @Test
    public void testButtonHasLogIn() {
        webDriver.get("http://localhost:8080/players");
        assertEquals("Logga in", webDriver.findElement(By.tagName("button")).getText());
    }

    @Test
    public void testEndpointText() {
        webDriver.get("http://localhost:8080/players");
        webDriver.findElement(By.cssSelector("ul li a")).click();
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        WebElement playerNameWebElement = wait.until((ExpectedConditions.visibilityOfElementLocated(By.className("player-name"))));
        String playerName = playerNameWebElement.getText();
        assertEquals("tove", playerName);

     ;


    }
}