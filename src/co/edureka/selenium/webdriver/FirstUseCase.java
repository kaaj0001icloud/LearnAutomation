package co.edureka.selenium.webdriver;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gargoylesoftware.htmlunit.javascript.host.Element;

public class FirstUseCase {

	WebDriver driver;
	WebDriverWait myWait;
	ArrayList<String> array;

	public  void invokeBrowser() {
		System.setProperty("webdriver.chrome.driver", "//Users//gopalchettykalangi//Documents//Selenium//Edurekha/3.1//chromedriver");
		driver = new ChromeDriver();
		//driver.get("http://www.flipkart.com");
	
		driver.navigate().to("http://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		String title = driver.getTitle();
		System.out.println(title);
		System.out.println(driver.getWindowHandle());
		int windows = driver.getWindowHandles().size();
		String window1 = driver.getWindowHandles().toArray()[0].toString();
		System.out.println(window1);
		//Array
		array = new ArrayList();
		array.add("Ajay");
		array.add("Ajay1");
		for(String arrayl : array){
		System.out.println(arrayl);
		}
		//String s = array.toString();
		
		//System.out.println(s.length());

	}
	public void closeBrowser(String tabORBrowser){
		if(tabORBrowser == "tab"){
			driver.quit();
		}
		else
			driver.close();
		
	}
	
	public void waitExplicit(){
	 myWait = new WebDriverWait(driver, 10);
	 
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstUseCase fs = new FirstUseCase();
		fs.invokeBrowser();
		fs.closeBrowser("Browser");
	}

}
