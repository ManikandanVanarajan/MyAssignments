package week3.home.assignments;

public class TestData {
	
	public String enterCredentials(String name)
	{
		return name;
	}
	
	public void navigateToHomePage()
	{
		System.out.println("Home page displayed");
	}
	
	public static void main(String[] args) {
		
		//Creating an Object for own class and executing it's methods
		TestData dataTest = new TestData();
		String data = dataTest.enterCredentials("Wow");
		System.out.println(data);
		dataTest.navigateToHomePage();

	}

}
