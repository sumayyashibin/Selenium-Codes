package com.obsqura.Automationcourse;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;



public class Edge {
	
	public 	WebDriver driver; 
	
	public void initializeEdge(){
	
	System.setProperty("webdriver.edge.driver", "C:\\Users\\SHIBIN\\eclipse-workspace\\Automationcourse\\src\\main\\java\\Resources\\msedgedriver.exe");	
	driver=new EdgeDriver();
	driver.get("https://www.amazon.in/");
	
	}

	public static void main(String[] args) {
		
		Edge obj=new Edge();
		
		obj.initializeEdge();

	}

}
