

	import java.util.Iterator;
import java.util.List;
import java.util.Set;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

	public class Ms3 {

		public static void main(String[] args)
		throws InterruptedException{
			// TODO Auto-generated method stub
	//selenium code-
			
			
			//create Driver object for edge browser
			//we will strictly implement methods of webdriver
			/*Class name =EdgeDriver;
					
					X driver=new X();*/
			//invoke .exe file first
			System.setProperty("webdriver.edge.driver","C:\\Users\\M1072983\\msedgedriver.exe");
			WebDriver driver=new EdgeDriver();
			driver.get("https://courses.letskodeit.com/practice");
			
			driver.findElement(By.xpath("//input[@id=\"benzradio\"]")).click();
		    
		   Select s=new Select(driver.findElement(By.xpath("//select[@id='carselect']")));s.selectByValue("honda");
		     
		    
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
		       
		       Thread.sleep(2000L);
		       
		       driver.findElement(By.id("alertbtn")).click();
		       Thread.sleep(2000L);
		       driver.switchTo().alert().accept();
		   
		       /*7th*/
		       
		       String price =driver.findElement(By.xpath("//*[@id=\"product\"]/tbody/tr[3]/td[3]")).getText();
	             System.out.println("Price for programming :"+price);	       
		       
		       
		       
		       WebElement element=driver.findElement(By.id("mousehover"));
				
				Actions action=new Actions(driver);
				action.moveToElement(element).perform();
				
				WebElement subelement=driver.findElement(By.xpath("//*[@id=\"mouse-hover-example-div\"]/div/fieldset/div/div/a[1]"));
				action.moveToElement(subelement);
				action.click().build().perform();
				
				
				
				
				//*[@id="table-example-div"]/div[1]/fieldset/legend
				
				
				//*[@id="product"]
		       
		}
		
			
			
		}	
		
