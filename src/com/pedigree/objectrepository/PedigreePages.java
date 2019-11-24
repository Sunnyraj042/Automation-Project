package com.pedigree.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PedigreePages {

	@FindBy(xpath = "//div[@id='Header_divHeader']/div/div[4]/div/a")
	private WebElement search_Link;

	@FindBy(xpath = "//form[@id='form1']/section[3]/div/div/div[1]/input[1]")
	private WebElement search_TextBox;

	@FindBy(xpath = "//form[@id='form1']/section[4]/div/div/div[1]/h3/span")
	private WebElement articles;

	@FindBy(xpath = "//form[@id='form1']/section[4]/div/div/div[1]/ul/li[2]/a")
	private WebElement secondArticles_Link;

	@FindBy(id = "Header_imgLogo")
	private WebElement pedigreeLogo_Link;

	public void clickonSerch() {
		search_Link.click();
	}
	
	public void setTextBox(String Input)
	{
		search_TextBox.sendKeys(Input);
	}

	public String getArticles() {
		return articles.getText();
	}

	public void clickonsecondArticle() {
		secondArticles_Link.click();
	}

	public void clickonpedigreeLogo() {
		pedigreeLogo_Link.click();
	}
}
