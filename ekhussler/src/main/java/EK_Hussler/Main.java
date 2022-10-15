package EK_Hussler;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Main {

	public static void main(String[] args) {
	        //String pathToChromeDriver = ".//src//main//resources//ChromeDriver//chromedriver_Win_860424022.exe";
			String pathToChromeDriver = ".//src//main//resources//ChromeDriver//chromedriver.exe";
	        System.setProperty("webdriver.chrome.driver", pathToChromeDriver);
	        
	        ChromeOptions options = new ChromeOptions();
//	        options.addArguments("--headless");
	        options.addArguments("--ignore-certificate-errors");
	        options.addArguments("--disable-popup-blocking");
//	        options.addArguments("--incognito");
	        options.addArguments("--remote-debugging-port=9014");
	        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"}); 
	        options.setExperimentalOption("useAutomationExtension", false);
	        ChromeDriver Chrome1 = new ChromeDriver(options); 
//	        Chrome1.get("https://www.ebay-kleinanzeigen.de/m-einloggen.html?targetUrl=/");
	        try {
				Chrome1.get("https://www.ebay-kleinanzeigen.de/");
				WebElement firstResult = new WebDriverWait(Chrome1, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div/div/div/div/div[3]/button[1]/span/span")));
				Chrome1.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[3]/button[1]/span/span")).click();
				TimeUnit.SECONDS.toSeconds(3);
				Chrome1.findElement(By.xpath("/html/body/header/section[1]/section/nav/ul/li[3]/a")).click();
				System.out.println("Suche Login");
				TimeUnit.SECONDS.toSeconds(3);
				Chrome1.findElement(By.xpath("//*[@id=\"login-email\"]")).sendKeys("bernhard-pitsch@web.de");
				System.out.println("Suche Passwort");
				Chrome1.findElement(By.xpath("//*[@id=\"login-password\"]")).sendKeys("Sonne101");
				TimeUnit.SECONDS.toSeconds(10);
//				#TODO Chrome1.findElement(By.xpath("//*[@id=\"xpath-content\"]")).click();
				TimeUnit.SECONDS.toSeconds(3);
				Chrome1.findElement(By.xpath("/html/body/div[1]/div[2]/div/div[1]/form/div[4]/div/div/button/span")).click();
				System.out.println("login erfolgreich!");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				Chrome1.close();
				e.printStackTrace();
			}
//	        
	        
	        
	        String anzAnzeigen = Chrome1.findElement(By.cssSelector("li:nth-of-type(5) > .iconlist-text > b")).getText();
	        System.out.println(anzAnzeigen); 
//	        Chrome1.findElementByCssSelector("li:nth-of-type(5) > .iconlist-text > b").click();
//	        verlï¿½ngern 1
	      //ul[@id='my-manageads-adlist']/li[1]/article[@class='manageaditem']/section[@class='manageaditem-main']/section[@class='manageaditem-ad']/ul[@class='list']//a
//	      verlï¿½ngern 2
	      //ul[@id='my-manageads-adlist']/li[2]/article[@class='manageaditem']/section[@class='manageaditem-main']/section[@class='manageaditem-ad']/ul[@class='list']//a
//	      anzeigennr rechts oben
	        //div[@id='root']/div[@id='site-content']/div/section[1]/div[2]/ul[2]/ul/li[5]/span[@class='iconlist-text']/b
	}

}



