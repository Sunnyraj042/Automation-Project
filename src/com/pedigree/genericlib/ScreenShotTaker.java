package com.pedigree.genericlib;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShotTaker {

	public void getScreenShot(WebDriver driver) throws IOException {
		TakesScreenshot sShot=(TakesScreenshot)driver;
		File srcFile=sShot.getScreenshotAs(OutputType.FILE);
		File destFile=new File("C:\\Users\\Sunny Raj\\eclipse-workspace\\Selenium.pedigree.Framework\\ScreenShots\\image1.png");
		FileUtils.copyFile(srcFile, destFile);
	}
}
