package WellsFargo;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class wellsFargoTestCaseSteps {
static WebDriver driver;
	
	public static void main(String[] args) throws Exception
	{
		driver = new FirefoxDriver();
		driver.get("http://www.WellsFargo.com");
			driver.manage().window().maximize();
			System.out.println("WellsFargo application Successfully Launched");
			WebElement Personal =driver.findElement(By.xpath("//html/body/div[1]/header/div/div/nav/div/ul/li[1]"));
			

			if(Personal.isDisplayed())
			{
				System.out.println("Personal tab is Displayed on the application");
				
				if(Personal.isSelected())
				{
					System.out.println("Personal tab is selected on the application");
					
				}
				else
				{
					//System.out.println("Personal tab is not selected on the application");
					
				}
				
			}
			else
			{
				System.out.println("Personal tab is not Displayed on the application");
				
			}
			
	
			WebElement About =driver.findElement(By.xpath("//html/body/div[1]/header/div/div/div[3]/nav/ul/li[2]/a"));
			if(About.isDisplayed())
			{
				System.out.println("Verified About Wells Fargo link is Displayed on the application");
				
				About.click();
				System.out.println("Verified About Wells Fargo link Clicked");
				
				String Expectedtext = "About Wells Fargo";
				String Actualtext = driver.findElement(By.xpath("//html/body/div[1]/div[1]/h1")).getText();
				
				if(Expectedtext.equals(Actualtext))
				{
					System.out.println("About Wells Fargo" +"is in <h1> tag");
				}
				else
				{
					System.out.println("Verified About Wells Fargo link is not Displayed on the application");
					
				}
				Thread.sleep(10000);
			
				driver.navigate().back();
				System.out.println("Navigate back");
				
				String str = driver.getTitle();
				
				System.out.println(str);
				
				Thread.sleep(10000);
				
				WebElement insurance =driver.findElement(By.xpath("//html/body/div[1]/nav/ul/li[3]/a"));
				
				
				//List<WebElement> allLinks = driver.findElements(By.tagName("a"));
				if(insurance.isDisplayed())
				{
					System.out.println("insurance tab is Displayed on the application");
					insurance.click();
					System.out.println("clicked on insurance Tab");
					Thread.sleep(5000);
					
					WebElement homeownersInsurance =driver.findElement(By.xpath("//html/body/div[1]/nav/ul/li[3]/div/div[1]/div[2]/ul/li[1]/a"));
					
					if(homeownersInsurance.isDisplayed())
					{
						homeownersInsurance.click();
						System.out.println("clicked on homeowners insurance Link");
					
						WebElement zipCode =driver.findElement(By.xpath("//html/body/div[4]/div[2]/div/form/div/input[1]"));
						if(zipCode.isDisplayed())
						{
						zipCode.sendKeys("94536");
					System.out.println("zip code entered To set the location");
					Thread.sleep(5000);
						}
					}
				}
					else
					{
						System.out.println("insurance tab is not selected on the application");
						
					}
					
				}
				
		driver.quit();
		
	}
	}
