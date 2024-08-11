package week3.home.assignments;

public class JavaConnection implements DatabaseConnection{

	@Override
	public void connect() {
	
		System.out.println("Database successfully connected");
		
	}

	@Override
	public void disconnect() {
		
		System.out.println("Database successfully disconnected");
		
	}

	@Override
	public void executeUpdate() {
		
		System.out.println("Database successfully updated");
	}
	
	public static void main(String[] args) {
		
		//DataBaseConnection Interface is implemented by JavaConnection class
		//JavaConnection class has given his own implementation for Interface class methods
		JavaConnection javaConnect = new JavaConnection();
		javaConnect.connect();
		javaConnect.executeUpdate();
		javaConnect.disconnect();		

	}

}
