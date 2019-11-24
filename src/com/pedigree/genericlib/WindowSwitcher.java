package com.pedigree.genericlib;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.WebDriver;

public class WindowSwitcher {

	@SuppressWarnings("unused")
	public void switchToOtherWindow(WebDriver driver) {
		Set<String> set = driver.getWindowHandles();
		Iterator<String> itr = set.iterator();
		String ParentWindow = itr.next();
		String ChildWindow = itr.next();
		driver.switchTo().window(ChildWindow);
	}
}
