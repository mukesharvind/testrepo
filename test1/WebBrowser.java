package seleniumwebbrowser;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebBrowser {

	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
				//EdgeDriver driver = new EdgeDriver();
				driver.get("http://leaftaps.com/opentaps");

				driver.manage().window().maximize();
		
	}
}
