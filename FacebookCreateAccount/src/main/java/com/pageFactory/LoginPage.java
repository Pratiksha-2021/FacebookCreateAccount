package com.pageFactory;

import org.openqa.selenium.By;

import com.generic.EnvSetUp;

public class LoginPage {

	private EnvSetUp objEnvSetUp;

	public LoginPage(EnvSetUp envSetup) {
		this.objEnvSetUp = envSetup;
	}

	By loc_btn_CreteNewAccount = By.xpath("//a[text()='Create New Account']");

	public void clickCreateNewAccount() {
		objEnvSetUp.getDriver().findElement(loc_btn_CreteNewAccount).click();
	}

}
