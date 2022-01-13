package basicPractise;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

/*public class TestSuite {

    @Test
    public void openFacebook(){
        long startTime = System.currentTimeMillis();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.quit();
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime ;
        System.out.println(totalTime);
    }
    @Test
    public void openYouTube(){
        long startTime = System.currentTimeMillis();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.youtube.com/");
        driver.quit();
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime ;
        System.out.println(totalTime);
    }
    @Test
    public void openTwitter(){
        long startTime = System.currentTimeMillis();
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.twitter.com/");
        driver.quit();
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime ;
        System.out.println(totalTime);
    }


}*/


//-----------------------------Iteration-----------------------------------------------------//
public class TestSuite {
WebDriver driver;
long startTime;
long endTime;

    @BeforeSuite
    public void openDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
         startTime = System.currentTimeMillis();

    }


    @Test
    public void openFacebook() {
        driver.get("https://www.facebook.com/");

    }
    @Test
    public void openYoutube() {
        driver.get("https://www.youtube.com/");

    }
    @Test
    public void openTwitter() {
        driver.get("https://www.twitter.com/");

    }

    @AfterSuite
    public void closeBrowser(){

        driver.quit();
       endTime = System.currentTimeMillis();
       long totalTime = endTime-startTime;
        System.out.println(totalTime);

    }


}