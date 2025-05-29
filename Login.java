package DemoPrpject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.airasia.com/en/gb");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement Login=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\"Login__LoginIcon-sc-vur044-3 frGxnk\"]")));
		Login.click();
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement Username=wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id=\"text-input--login\"]")));
		Username.sendKeys("devendrareddy@gmail.com");
		WebElement Password=driver.findElement(By.id("password-input--login"));
		Password.sendKeys("Deva@34545677");
		try {
            WebElement closeBtn = driver.findElement(By.className("wzrk-close"));
            closeBtn.click();
            Thread.sleep(1000);
        } catch (Exception e) {
            ((JavascriptExecutor) driver).executeScript(
                "var overlay = document.querySelector('.wzrk-overlay'); if(overlay) overlay.remove();"
            );
        }    
        driver.findElement(By.id("loginbutton")).click();   		

	}

}
