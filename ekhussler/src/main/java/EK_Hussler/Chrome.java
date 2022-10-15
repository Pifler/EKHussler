package EK_Hussler;
import java.util.ArrayList;
import java.util.Arrays;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.remote.server.handler.GetCurrentUrl;
//
public class Chrome extends Website {

	private final static String PATHTOCHROMEDRIVER = ".//ChromeDriver//chromedriver_Win_860424022.exe";
	private final static String CHROMEDRIVERKEY = "webdriver.chrome.driver";
	private ChromeOptions options;
	private ChromeDriver driver;
	private final ArrayList<String> optionArguments = new ArrayList<String>(Arrays.asList("--ignore-certificate-errors","--disable-popup-bµlocking","--incognito","--remote-debugging-port=9014"));

// Konstruktor
	Chrome(){
		super();
        System.setProperty(CHROMEDRIVERKEY, PATHTOCHROMEDRIVER);
		options = new ChromeOptions();
		options.addArguments(optionArguments);
		options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"}); 
	    options.setExperimentalOption("useAutomationExtension", false);
	    driver = new ChromeDriver(options); 
	}
// Getter & Setter
	public String getPathtochromedriver() {
		return PATHTOCHROMEDRIVER;
	}
	public String getChromedriverkey() {
		return CHROMEDRIVERKEY;
	}
	public ChromeDriver getChromedriver() {
		return driver;
	}
//	public void aufrufWebsite() {
//		getChromedriver().get();
//	}
	
}
