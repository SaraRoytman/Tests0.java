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
    @DisplayName("בדיקת זמינות כרטיסים")
    public void testAvailability() throws InterruptedException {
        String[] websites = {
                "https://www.eventim.co.il/artist/%D7%94%D7%A8%D7%90%D7%9C-%D7%A1%D7%A7%D7%A2%D7%_%D7%AA/",
                "https://www.zappa-club.co.il/artist/%D7%94%D7%A8%D7%90%D7%9C-%D7%A1%D7%A7%D7%A2%D7%AA/?affiliate=ZPE",
                "https://kupat.co.il/artist/harel-skaat/",
                "https://barby.co.il/show/5437"
        };
        boolean foundtickets = false;

        for(String url: websites){
            driver.get(url);

            Thread.sleep(3000);

            String pageSource = driver.getPageSource();

            boolean hasArtist = pageSource.contains("הראל סקעת");
            boolean haskeyword = pageSource.contains("הופעה");
            boolean hasPrice = pageSource.contains("₪");
            boolean hasyear2026 = pageSource.contains("2026");
            boolean hasyear2027 = pageSource.contains("2027");

            if(hasArtist && hasPrice && (haskeyword || hasyear2026 || hasyear2027)){
                foundtickets = true;
                System.out.println("found in: " + url);
            }
            else{
                System.out.println("didn't find in: " + url);
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
