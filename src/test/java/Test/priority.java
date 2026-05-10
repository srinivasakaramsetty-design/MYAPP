package Test;

import org.testng.annotations.Test;

public class priority
{
	@Test(priority = 2)
    public void loginTest() {
        System.out.println("Login Test");
    }

    @Test(priority = 1)
    public void openBrowser() {
        System.out.println("Open Browser Test");
    }

    @Test(priority = 3)
    public void dashboard() {
    	System.out.println("Dashboard Test");
    }
    

    @Test(priority = 4)
    public void logout() {
        System.out.println("Logout Test");
    }
    
    

   
    
    
}
