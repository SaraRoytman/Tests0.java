package Test5j.Calc;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;

public class TicketTest {
    private WebDriver driver;

    @BeforeEach
    public void setUp(){
        driver = new ChromeDriver();
    }

    @Test
    @DisplayName("בדיקה")
    public void testAvailability(){
        driver.get("https://www.eventim.co.il/artist/harel-skaat/");
        String pageText = driver.findElement(By.tagName("body")).getText();

        boolean haskeyword = pageText.contains("הופעה");
        boolean hasyear = pageText.contains("2027");

        assertTrue(haskeyword || hasyear);

        System.out.println("יש משהווו");


    }
    @AfterEach
    public void tearDown() {
        if(driver != null){
            driver.quit();
        }
    }

}
