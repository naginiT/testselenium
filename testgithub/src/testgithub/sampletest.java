package testgithub;

import java.io.File;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class sampletest {
	
			public static void main(String[] args) throws Exception {
			WebDriver driver;
			
			System.setProperty("webdriver.chrome.driver", "F:\\Selenium_Harsha\\chromedriver.exe");

			 driver = new ChromeDriver();
				
			 driver.manage().window().maximize();
			 
			 driver.get("https://findusages.com/search/org.sikuli.script.Screen/wheel$2");
			 
			Screenshot sh =new AShot().shootingStrategy(ShootingStrategies.viewportPasting(100)).takeScreenshot(driver);
			
			File f= new File("F:\\Selenium_Harsha\\ScreenShotPrograms\\Ashotfullimage.jpg");
			
			ImageIO.write(sh.getImage(), "jpg", f);
			
			
		}

	}


