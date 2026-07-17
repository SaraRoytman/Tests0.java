package Test5j.Calc;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.*;

public class TicketTest {
    private WebDriver driver;

    @BeforeEach
    public void setUp(){
        driver = new ChromeDriver();
    }

    @Test
    @DisplayName("בדיקה")
    public void testAvailability() throws InterruptedException { // הוספנו כאן התייחסות להשהיה
        String[] websites = {
                "https://www.eventim.co.il/artist/harel-skaat/",
                "https://www.zappa-club.co.il/artist/harel-skaat/",
                "https://kupat.co.il/artist/harel-skaat/",
                "https://barby.co.il/show/5437"
        };
        boolean foundtickets = false;

        for(String url: websites){
            driver.get(url);

            // עוצרים את הסקריפט ל-3 שניות כדי לתת לאתרים כמו הבארבי לטעון את התוכן הדינמי
            Thread.sleep(3000);

            String pageText = driver.findElement(By.tagName("body")).getText();

            boolean haskeyword = pageText.contains("הופעה");
            boolean haskeyword1 = pageText.contains("₪");
            boolean hasyear2026 = pageText.contains("2026");
            boolean hasyear2027 = pageText.contains("2027");

            if(haskeyword || haskeyword1 || hasyear2027 || hasyear2026){
                foundtickets = true;
                System.out.println("found in: " + url); // הוספנו רווח ונקודתיים לקריאות
            }
            else{
                System.out.println("didn't find in: " + url); // הוספנו רווח ונקודתיים לקריאות
            }
        }

        assertTrue(foundtickets, "no tickets!");
    }

    @AfterEach
    public void tearDown() {
        if(driver != null){
            driver.quit();
        }
    }
}
