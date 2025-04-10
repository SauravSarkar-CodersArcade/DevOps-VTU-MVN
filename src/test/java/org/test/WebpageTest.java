package org.test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;
public class WebpageTest {
    private static WebDriver driver;

    @BeforeTest
    public void openBrowser() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.get("https://sauravsarkar-codersarcade.github.io/DevOps-VTU-MVN/");
    }
    @Test
    public void titleValidationTest(){
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        String expectedTitle = "Coders Arcade - CI/CD Learning";
        Assert.assertEquals(actualTitle, expectedTitle);
        assertTrue(true, "Title contains 'CI/CD'");
    }
    @AfterTest
    public void closeBrowser() throws InterruptedException {
        Thread.sleep(1000);
        driver.quit();
    }


}
