package com.apex.login.constant;

public interface LoginConstant {
	
	String BASEURL = "https://www.saucedemo.com/";
	
	//Locators
	String USERNAME_NAME_LOCATOR = "user-name";
	String PASSWORD_NAME_LOCATOR = "password";
	String LOGINBTN_NAME_LOCATOR = "login-button";
	String NAME = "name";
	String BAGPACK_XPATH_LOCATOR = "//*[@id=\"add-to-cart-sauce-labs-backpack\"]";
	String ERROR_MSG_XPATH_LOCATOR = "//*[@id=\"login_button_container\"]/div/form/div[3]/h3";
	String PROBLM_USER_BAGPACK_IMG_LOCATOR = "//*[@id=\"item_4_img_link\"]/img";

	
	//error message
	String TEXT_VERIFICATION_FAILED = "Text verification failed";
	String EXPTD_TXT_ERROR = "error";

	//Validations
	String SUCSFL_LOGIN_EXP_TXT = "add-to-cart-sauce-labs-backpack";
	String PROBLM_USR_BAGPACK_IMAGE_SRC = "https://www.saucedemo.com/static/media/sl-404.168b1cce.jpg";

	//data
	String PASSWORD_COMMON = "secret_sauce";
	String USERNAME_STANDARD_USER = "standard_user";
	String USERNAME_PROBLEM_USER = "problem_user";
	String USERNAME_PERFRMNC_GLITCH_USR = "performance_glitch_user";
	String USERNAME_LOCKDOUT_USER = "locked_out_user";

	//time-outs
	int TIMEOUT_5000 = 5000;
	int TIMEOUT_2000 = 2000;
	
}
