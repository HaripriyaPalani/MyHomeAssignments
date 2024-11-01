package AbstractionHmeAssng;

public  class JavaConnection implements DatabseConnection{
	public void connect() {
	}
	{
		System.out.println("The database is connected sucessfully");
	}
	
	public void disconnect() {
	}
	{
		System.out.println("The database is disconnected ");
	}
	public void executeUpdate() {
	}
	{
		System.out.println("The database is Updated Successfully");
	}
	public static void main(String[] args) {
		JavaConnection dbConnection = new JavaConnection();
		dbConnection.connect();
		dbConnection.disconnect();
		dbConnection.executeUpdate();
}
}