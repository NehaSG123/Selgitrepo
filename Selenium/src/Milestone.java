
	import java.util.Iterator;
	import java.util.Set;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.Select;
	public class Milestone {
		public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.edge.driver", "C:\\\\Users\\\\M1072983\\\\msedgedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000L);
		driver.get("https://courses.letskodeit.com/practice");
		driver.findElement(By.xpath("//input[@id=\"benzradio\"]")).click();
		
		Select s=new Select(driver.findElement(By.xpath("//select[@id='carselect']")));
		s.selectByValue("honda");
		//Select obj=new Select(driver.findElement(By.id("car-select")));
//		obj.selectByValue("honda"); 
		driver.findElement(By.id("benzcheck")).click();
		driver.findElement(By.id("hondacheck")).click();
		driver.findElement(By.id("openwindow")).click();
		Set<String> str=driver.getWindowHandles();
		Iterator<String> it=str.iterator();
		String parent=it.next();
		String child=it.next();
		driver.switchTo().window(child);
		System.out.println(driver.getTitle());
		driver.switchTo().window(parent);
		driver.findElement(By.id("alertbtn")).click();
		Thread.sleep(5000L);
			driver.switchTo().alert().accept();
			
			String price = driver.findElement(By.xpath("//*[@id=\"product\"]/tbody/tr[3]/td[3]")).getText();
			System.out.println("Price for python programming: "+price);
			
	WebElement element=driver.findElement(By.id("mousehover"));
			
			Actions action=new Actions(driver);
			action.moveToElement(element).perform();
			
			WebElement subelement=driver.findElement(By.xpath("//*[@id=\"mouse-hover-example-div\"]/div/fieldset/div/div/a[1]"));
			action.moveToElement(subelement);
			action.click().build().perform();
	}
	}

