package EK_Hussler;

//Selenium Chrome
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.*;
//Sleep
import java.util.concurrent.TimeUnit;
//XPath
import javax.xml.xpath.XPath;
//from selenium import webdriver
//from time import sleep 

public class Hussler {
    private String username;
    private String password;
    private Chrome ChromeBrowser;
    
//Konstruktor
	Hussler(String username, String password){
    	this.username = username;
    	this.password = password;
    	ChromeBrowser = new Chrome();
    }
	
//Getter & Setter
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	public Chrome getChromeBrowser() {
		return ChromeBrowser;
	}
	public ChromeDriver getChromeDriver() {
		return ChromeBrowser.getChromedriver();
	}
//	HusslerToDos
//	Wait for x seconds
	public void sleep (int sec) {
    	try
        {
            Thread.sleep(1000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        };
    }
}