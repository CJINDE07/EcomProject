package Project1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MotorCycle {

 public static void main(String[] args) throws InterruptedException, IOException {
	
	    WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://sampleapp.tricentis.com/101/app.php");
		
		//FIRSY PAGE
	    driver.findElement(By.id("nav_motorcycle")).click();
	    driver.findElement(By.id("make")).sendKeys("Porsche");
		driver.findElement(By.id("model")).sendKeys("Moped");
		driver.findElement(By.id("cylindercapacity")).sendKeys("220");
		driver.findElement(By.id("engineperformance")).sendKeys("450");
		driver.findElement(By.id("dateofmanufacture")).sendKeys("03/05/2024");
		driver.findElement(By.id("numberofseatsmotorcycle")).sendKeys("2");
		driver.findElement(By.id("listprice")).sendKeys("1000");
		driver.findElement(By.id("annualmileage")).sendKeys("150");
		driver.findElement(By.id("nextenterinsurantdata")).click();
		
		//SECOND PAGE
		driver.findElement(By.id("firstname")).sendKeys("Chetan");
		driver.findElement(By.id("lastname")).sendKeys("jinde");
		driver.findElement(By.id("birthdate")).sendKeys("07/12/2000");
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[4]/p/label[1]/span")).click();
		driver.findElement(By.id("streetaddress")).sendKeys("1752,Datta Nagar");
		driver.findElement(By.id("country")).sendKeys("india");
		driver.findElement(By.id("zipcode")).sendKeys("413005");
		driver.findElement(By.id("city")).sendKeys("Solapur");
		driver.findElement(By.id("occupation")).sendKeys("Employee");
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[10]/p/label[2]/span")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[10]/p/label[4]/span")).click();
		driver.findElement(By.id("website")).sendKeys("https://www.google.com/");
		driver.findElement(By.id("nextenterproductdata")).click();
		
		//THIRD PAGE
		driver.findElement(By.id("startdate")).sendKeys("04/06/2025");
		driver.findElement(By.id("insurancesum")).sendKeys("15.000.000.00");
		driver.findElement(By.id("damageinsurance")).sendKeys("Partial Coverage");
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[4]/p/label[1]/span")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[4]/p/label[2]/span")).click();
		driver.findElement(By.id("nextselectpriceoption")).click();		
		
		//FOURTH PAGE
		driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[1]/table/tfoot/tr/th[2]/label[1]/span")).click();
		driver.findElement(By.id("nextsendquote")).click();
		
		//FIFTH PAGE
		driver.findElement(By.id("email")).sendKeys("chetannjinde@gmail.com");
		driver.findElement(By.id("phone")).sendKeys("7972842585");
		driver.findElement(By.id("username")).sendKeys("CJINDE");
		driver.findElement(By.id("password")).sendKeys("Chetan@07");
		driver.findElement(By.id("confirmpassword")).sendKeys("Chetan@07");
		driver.findElement(By.id("sendemail")).click();
		
		Thread.sleep(10000);
		File src=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\selenium\\Screenshot3.jpeg"));
		//screenshot 
		driver.findElement(By.xpath("/html/body/div[4]/div[7]/div/button")).click();
						
		driver.findElement(By.id("backmain")).click();
		
		
		
}
}
