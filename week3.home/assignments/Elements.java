package week3.home.assignments;

public class Elements extends Button{
	
	public int getId(int identity)
	{
		System.out.println(identity);
		return identity;
	}

	public static void main(String[] args) {
		
		//Creating an Object for execution class "Elements" and executing parent class "Button" methods
		//Implementing GrandParent "WebElement" methods because Button class extends WebElements
		//Implementing Own class method
		Elements element = new Elements();
		element.click();
		element.setText("Manikandan");
		element.submit();
		element.getId(12);
		
		
		//Without extends creating an object for other sub classes and implementing their methods
		TextField text = new TextField();
		text.getText();
		
		RadioButton radio = new RadioButton();
		radio.selectRadioButton();
		
		CheckBoxButton check = new CheckBoxButton();
		check.clickCheckButton();	

	}

}
