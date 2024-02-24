package NewPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2. Initialize Webdriver object through ChromeDriver class.
  		 ChromeDriver browserObject = new ChromeDriver();
	// 3. Open the form page http://training.qaonlinetraining.com/testPage.php
       browserObject.get("http://training.qaonlinetraining.com/testPage.php");
       browserObject.findElement(By.xpath("//input[@value ='female']")).click();
       browserObject.findElement(By.name("name")).sendKeys("Taranpreet Kaur");
       browserObject.findElement(By.name("email")).sendKeys("taran.k.87@gmail.com");
       browserObject.findElement(By.name("website")).sendKeys("ITLearn360");
       browserObject.findElement(By.name("comment")).sendKeys("This is a good website");
       browserObject.findElement(By.name("submit")).click();;
	}

}
