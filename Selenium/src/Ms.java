import java.util.Iterator;
	import java.util.Set;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.edge.EdgeDriver;

	public class Ms {

		public static void main(String[] args)
		throws InterruptedException{

	 System.setProperty("webdriver.edge.driver", "C:\\Users\\M1072983\\Desktop\\msedgedriver.exe");
     WebDriver driver=new EdgeDriver();
     Thread.sleep(2000L);
     driver.get("https://courses.letskodeit.com/practice");

     driver.findElement(By.xpath("//input[@id=\"benzradio\"]")).click();
    
    /* Select obj=new Select(driver.findElement(By.id("car-select")));
     obj.selectByValue("honda");  */
    
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
   
}
}