package hiring_demoblaz;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class LoginPage {

		
		private Locator usernameLocator;
		private Locator passwordLocator;
		private Locator submitButtonLocator;
		
		public LoginPage(Page page){
			 
		usernameLocator=page.locator("#loginusername");
		passwordLocator=page.locator("#loginpassword");

		submitButtonLocator=page.locator("button:has-text('Log in')");
		}
		
		public void loginToApplication(String user, String pass){
			
		usernameLocator.fill(user);

		passwordLocator.fill(pass);

		submitButtonLocator.click();
		}

	}



