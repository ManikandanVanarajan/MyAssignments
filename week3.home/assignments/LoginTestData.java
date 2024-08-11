package week3.home.assignments;

public class LoginTestData extends TestData{
	
	public String enterUsername(String userName)
	{
		return userName;
	}
	
	public String enterPassword(String passWord)
	{
		return passWord;
	}

	public static void main(String[] args) {
		
		
		//Creating an Object for Child class "LoginTestData"
		//Executing parent class methods because child extends parent class
		LoginTestData loginData = new LoginTestData();
		String userName = loginData.enterUsername("Manikandan");
		System.out.println(userName);
		String passy = loginData.enterPassword("!@Mani9");
		System.out.println(passy);
		String enterCred = loginData.enterCredentials("TestLeaf");
		System.out.println(enterCred);
		loginData.navigateToHomePage();
		

	}

}
