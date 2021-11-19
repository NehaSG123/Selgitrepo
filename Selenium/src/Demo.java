import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//selenium code-
		
		
		//create Driver object for edge browser
		//we will strictly implement methods of webdriver
		/*Class name =EdgeDriver;
				
				X driver=new X();*/
		//invoke .exe file first
		System.setProperty("webdriver.edge.driver","C:\\Users\\M1072983\\msedgedriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.amazon.in/");
	
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("refrigerator");
		driver.findElement(By.id("nav-search-submit-button")).click();
		/* System.out.println(driver.findElement(By.cssSelector("[class='a-size-medium a-color-base a-text-normal']")).getText());
		System.out.println(driver.findElement(By.cssSelector("[class='a-size-base']")).getText());
		String price=driver.findElement(By.cssSelector("[class='a-price-whole']")).getText();
		System.out.println(price);
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[3]/div/span/div/div/div/div/div[2]/div[1]/div/div/span/a/div/img")).click();

		*/
		driver.manage().window().maximize();
		System.out.println(driver.findElement(By.xpath("//div[@data-index='9'] //span[@class='a-size-medium a-color-base a-text-normal']")).getText());
		String price=driver.findElement(By.xpath("//div[@data-index='9'] //span[@class='a-price-whole']")).getText();
		System.out.println(price);
		System.out.println(driver.findElement(By.xpath("//div[@data-index='9'] //span[@class='a-size-base']")).getText());

		driver.findElement(By.xpath("//div[@data-index='9'] //span[@class='a-size-medium a-color-base a-text-normal']")).click();

		Set<String> str=driver.getWindowHandles();
		Iterator<String> it=str.iterator();
		String parent=it.next();
		String child=it.next();
		driver.switchTo().window(child);

		/*String s1=(driver.findElement(By.id("priceblock_ourprice")).getText());
		System.out.println(s1);
		String s2=s1.substring(0,s1.length()-3);*/

		if(driver.findElement(By.id("priceblock_dealprice")).getText().equalsIgnoreCase(price)){
		System.out.println("Test case is passed");
		}else {
		System.out.println("Test case is not passed");
		}
		System.out.println("================================");

		String capacity=driver.findElement(By.xpath("//*[@id=\"HLCXComparisonTable\"]/tbody/tr[10]/td[1]/span")).getText();
		System.out.println(capacity);
		String refrigeratorname=driver.findElement(By.xpath("//*[@id=\"comparison_title\"]/span[2]")).getText();
		System.out.println(refrigeratorname);
		System.out.println("capacity of "+refrigeratorname+ "is " +capacity);
		String product=driver.findElement(By.xpath( "//*[@id=\"comparison_title0\"]/span")).getText();
		System.out.println(product);
		String capacity2=driver.findElement(By.xpath("//*[@id=\"HLCXComparisonTable\"]/tbody/tr[10]/td[2]/span")).getText();
		System.out.println(capacity2);
		System.out.println("==========================");
		System.out.println("capacity of "+product+ "is " +capacity2);
		System.out.println("==========================");
		String product3=driver.findElement(By.xpath("//*[@id=\"comparison_title1\"]/span")).getText();
		String capacity3=driver.findElement(By.xpath("//*[@id=\"HLCXComparisonTable\"]/tbody/tr[10]/td[2]/span")).getText();
		System.out.println("capacity of "+product3+ "is "+capacity3);
		System.out.println(driver.findElements(By.xpath("//*[@id='prodDetails']")).size());
		int count=driver.findElements(By.xpath("//*[@id=\"prodDetails\"]/div/div[1]/div[1]/div/div[2]/div/div")).size();


		
		
		
		
	}

}
