package com.apex.order.constant;

public interface OrderConstant {
	String BASEURL = "https://www.saucedemo.com/";

	// Locators
	String USERNAME_NAME_LOCATOR = "user-name";
	String PASSWORD_NAME_LOCATOR = "password";
	String LOGINBTN_NAME_LOCATOR = "login-button";
	String NAME = "name";
	String BAGPACK_XPATH_LOCATOR = "//*[@id=\"add-to-cart-sauce-labs-backpack\"]";
	String ERROR_MSG_XPATH_LOCATOR = "//*[@id=\"login_button_container\"]/div/form/div[3]/h3";
	String PROBLM_USER_BAGPACK_IMG_LOCATOR = "//*[@id=\"item_4_img_link\"]/img";
	String FINISH_BTN_NAME_LOCATOR = "finish";
	String CNTINUE_BTN_ID_LOCATOR = "continue";
	String POSTCODE_NAME_LOCATOR = "postalCode";
	String LASTNAME_NAME_LOCATOR = "lastName";
	String FRSTNAME_NAME_LOCATOR = "firstName";
	String CHCKOUT_NAME_LOCATOR = "checkout";
	String CART_XPATH_LOCATOR = "//*[@id=\"shopping_cart_container\"]/a";
	String ADD_BAG2CART_ID_LOCATOR = "add-to-cart-sauce-labs-backpack";

	// error message
	String TEXT_VERIFICATION_FAILED = "Text verification failed";
	String EXPTD_TXT_ERROR = "error";

	// Validations
	String SUCSFL_LOGIN_EXP_TXT = "add-to-cart-sauce-labs-backpack";
	String PROBLM_USR_BAGPACK_IMAGE_SRC = "https://www.saucedemo.com/static/media/sl-404.168b1cce.jpg";

	// data
	String PASSWORD_COMMON = "secret_sauce";
	String USERNAME_STANDARD_USER = "standard_user";
	String USERNAME_PROBLEM_USER = "problem_user";
	String USERNAME_PERFRMNC_GLITCH_USR = "performance_glitch_user";
	String USERNAME_LOCKDOUT_USER = "locked_out_user";
	String POSTCODE = "95051";
	String FIRSTNAME = "Rohini";
	String LASTNAME = "Kasat";

	// time-outs
	int TIMEOUT_5000 = 5000;
	int TIMEOUT_2000 = 2000;

}
