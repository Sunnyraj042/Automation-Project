package com.pedigree.test;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.pedigree.genericlib.BaseClass;
import com.pedigree.genericlib.ExcelFileReader;
import com.pedigree.genericlib.ExcelFileWriter;
import com.pedigree.genericlib.ScreenShotTaker;
import com.pedigree.genericlib.WindowSwitcher;
import com.pedigree.objectrepository.PedigreePages;

public class PedigreeTest extends BaseClass {
	ExcelFileReader reader = new ExcelFileReader();
	ExcelFileWriter writer = new ExcelFileWriter();
	ScreenShotTaker screenShot = new ScreenShotTaker();
	WindowSwitcher switcher =new WindowSwitcher();

	@Test
	public void result() throws IOException {
		PedigreePages page = PageFactory.initElements(driver, PedigreePages.class);
		page.clickonSerch();
		writer.setExceFile("Sheet1", 0, 0, "Dog");
		page.setTextBox(reader.getExceFileReader("Sheet1", 0, 0));
		writer.setExceFile("Sheet1", 1, 0, page.getArticles());
		page.clickonsecondArticle();
		switcher.switchToOtherWindow(driver);
		page.clickonpedigreeLogo();
		screenShot.getScreenShot(driver);
	}
}
