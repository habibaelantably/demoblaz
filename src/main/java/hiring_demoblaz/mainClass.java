package hiring_demoblaz;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class mainClass {

	public static void main(String[] args) {
		
			 Playwright playwright = Playwright.create();
	            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
	            Page page = browser.newPage();
	            page.navigate("https://www.demoblaze.com/index.html");
	            
	            
	            page.locator("#signin2").click();  
	            page.waitForSelector("#sign-username",new Page.WaitForSelectorOptions().setTimeout(5000));
	            SignupPage signupPage=new SignupPage(page);
	            signupPage.SignupToApplication("aadmin237","QWE@1234");
	            
	            
	            page.locator("#login2").click();  
	            page.waitForSelector("#loginusername",new Page.WaitForSelectorOptions().setTimeout(5000));
	            LoginPage loginpage=new LoginPage(page);
	            loginpage.loginToApplication("aadmin235","QWE@1234");
	            
	            
	            page.onceDialog(dialog -> {
	                System.out.println("Alert message: " + dialog.message());
	                dialog.accept();
	            });

	            
	           
	            page.getByText("Monitors").click();
	            page.waitForSelector("a:has-text('Apple monitor 24')", new Page.WaitForSelectorOptions().setTimeout(10000));
	            page.getByText("Apple monitor 24").click();
	            page.locator("button:has-text('Add to cart')");
	            
	           
	            page.waitForSelector("#logout2", new Page.WaitForSelectorOptions().setTimeout(5000));
	            page.locator("#logout2").click();

	            
	            
	            
	            
	            
//	            page.getByText("Log out").click();
	            
//	            page.onDialog(dialog -> {
//	                System.out.println("Dialog message: " + dialog.message());
//	                dialog.accept(); // or dialog.dismiss() for confirm/prompt
//	            });
	           // page.waitForSelector("text=Product added.", new Page.WaitForSelectorOptions().setTimeout(5000));

	            
	            
	              
	}

}
