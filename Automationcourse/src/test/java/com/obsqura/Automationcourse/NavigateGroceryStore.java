package com.obsqura.Automationcourse;

import org.junit.Assert;

public class NavigateGroceryStore extends GroceryStore {

	public void titleCommand() {
		String expectedTitle = "Opesmount | Web Designing, Web Development, Mobile App, SEO";
		String title = driver.getTitle();

		if (expectedTitle.equals(title)) {

			System.out.println("Titles are same");

		} else {
			System.out.println("Titles are not same");
		}
	}

	public void urlCommand() {

		String expectedUrl = "https://www.opesmount.com/";
		String url = driver.getCurrentUrl();

		if (expectedUrl.equals(url)) {
			System.out.println("Same Url");
		} else {
			System.out.println("Different Url");
		}
	}

	public void navigaton() {
		driver.navigate().to("https://www.toolsqa.com/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}

	public static void main(String[] args) {
		NavigateGroceryStore obj = new NavigateGroceryStore();
		obj.initializeBrowser();
		obj.titleCommand();
		obj.urlCommand();
		obj.navigaton();
		obj.browserClose();

	}

}
