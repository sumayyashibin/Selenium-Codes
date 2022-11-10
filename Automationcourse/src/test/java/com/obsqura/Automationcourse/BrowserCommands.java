package com.obsqura.Automationcourse;

import org.junit.Assert;

public class BrowserCommands extends Base {
	
	public void browserCommands() {
		
		String expectedTitle="Amazon.com. Spend less. Smile more.";
		String title = driver.getTitle();
		
		
		/*if(expectedTitle.equals(title)) {
			
			System.out.println("Titles are same");
			
		}
		else
		{
			System.out.println("Titles are not same");
		}*/
		Assert.assertEquals(expectedTitle, title);
		
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
	public void navigaton() {
		driver.navigate().to("https://www.amazon.com/s?k=gaming+keyboard&pd_rd_r=7a769ed3-cdc6-4291-a267-7bc17a1b6f98&pd_rd_w=JvpBy&pd_rd_wg=VPra1&pf_rd_p=12129333-2117-4490-9c17-6d31baf0582a&pf_rd_r=0328NMHHZGVWTJAK8WDA&ref=pd_gw_unk");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}
	
	
	public static void main(String args[]){
		BrowserCommands obj=new BrowserCommands();
		obj.initializeBrowser();
		obj.browserCommands();
		//obj.browserClose();
		obj.getUrl();
		obj.getPageSource();
		obj.navigaton();
		obj.browserQuit();
	}


}
