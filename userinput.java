package jbbcproject;


	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;
	import java.sql.Statement;
	import java.util.Scanner;

	public class userinput 
	{
		static final String DB_URL = "jdbc:mysql://localhost:3306/sbibank";
		static final String USER = "root";
		static final String PASS = "root";
		public static void main(String[] args) throws SQLException
		{
				
			Connection c=DriverManager.getConnection(DB_URL,USER,PASS);
					Statement s=c.createStatement();
					String sql = "create table customer_details" +
							"(id int not null auto_increment primary key, name varchar(50), age int not null)";
					s.executeUpdate(sql);
				Scanner scanner = new Scanner(System.in);	
				System.out.println("Enter you name: ");
				String name = scanner.nextLine();
				System.out.println("Enter you age: ");
				int age = scanner.nextInt();
				
					sql = "insert into customer_details(name, age) values " + "( '" + name + " ',"+ age + ")";
					
							s.executeUpdate(sql);
					
					System.out.println("records inserted");
					//c.close();	
					scanner.close();
		}
	}



