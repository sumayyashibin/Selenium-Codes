package com.obsqura.Automationcourse;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Base {
	
	public WebDriver driver;
	
	public void initializeBrowser(){
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SHIBIN\\eclipse-workspace\\Automationcourse\\src\\main\\java\\Resources\\chromedriver.exe" );
		driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
	}
	
	public void browserCommands() {
		String expectedTitle="Amazon.com. Spend less. Smile more.";
		String title = driver.getTitle();
		
		
		if(expectedTitle.equals(title)) {
			
			System.out.println("Titles are same");
			
		}
		else
		{
			System.out.println("Titles are not same");
		}
	}
	
	public void getUrl() {
		String expectedUrl="https://www.amazon.com/";
		String url=driver.getCurrentUrl();
		
		if(expectedUrl.equals(url))
		{
			System.out.println("Same Url");
		}
		else
		{
			System.out.println("Different Url");
		}
	}
	
	public void getPageSource() {
		String pageSource=driver.getPageSource();
	
		}
	
	public void browserClose() {
		driver.close();
	}
	
	public void browserQuit() {
		driver.quit();
	}
	
	
	public static void main(String args[]){
		Base obj=new Base();
		obj.initializeBrowser();
		obj.browserCommands();
		//obj.browserClose();
		obj.getUrl();
		obj.getPageSource();
		obj.browserQuit();
	}
}
