package hiring_demoblaz;



import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class SignupPage{
private Locator usernameLocator;
private Locator passwordLocator;
private Locator submitButtonLocator;
public SignupPage(Page page){
	 
usernameLocator=page.locator("#sign-username");
passwordLocator=page.locator("#sign-password");

submitButtonLocator=page.locator("button:has-text('Sign up')");
}
public void SignupToApplication(String user, String pass){
	
usernameLocator.fill(user);

passwordLocator.fill(pass);

submitButtonLocator.click();
}
}